package javaparser;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 5:47 PM
 **/
public class MethodDecla extends VoidVisitorAdapter<Void> {

    @Override
    public void visit(MethodDeclaration n, Void arg) {
        super.visit(n, arg);

        String declarationAsString = n.getDeclarationAsString();
        System.out.println("method declaration:" + declarationAsString);
        ExprPrint exprPrint = new ExprPrint();
        exprPrint.visit(n, arg);

    }
}
