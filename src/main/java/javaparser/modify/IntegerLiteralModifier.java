package javaparser.modify;

import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.util.regex.Pattern;

/**
 * @Author yijun.dyj
 * @Date 2020/1/2 11:43 AM
 **/
public class IntegerLiteralModifier extends ModifierVisitor<Void> {

    private static final Pattern LOOK_AHEAD_THREE = Pattern.compile("(\\d)(?=(\\d{3})+$)");

    private static String formatWithUnderscores(String value) {
        String withoutUnderscores = value.replaceAll("_", "");
        return LOOK_AHEAD_THREE.matcher(withoutUnderscores).replaceAll("$1_");
    }

    @Override
    public FieldDeclaration visit(FieldDeclaration fd, Void arg) {
        super.visit(fd, arg);
        fd.getVariables().forEach(v -> {
            v.getInitializer().ifPresent(i -> {
                if (i instanceof IntegerLiteralExpr) {
                    v.setInitializer(formatWithUnderscores(((IntegerLiteralExpr)i).getValue()));
                }
            });
        });

        return fd;
    }

}
