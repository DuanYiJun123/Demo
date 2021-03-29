package listTest;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * @Author yijun.dyj
 * @Date 2019/11/25 11:05 AM
 **/
public class ExprPrint extends VoidVisitorAdapter<Void> {

    @Override
    public void visit(MethodCallExpr ae, Void arg) {
        super.visit(ae, arg);
        System.out.println(
            ("Method Call : line num {}" + ae.getBegin().get().line + " ===>  {}" + ae.getParentNode().get()
                + " ====> type is {} " + ae.getParentNode().get().getClass()
            ));
    }

    @Override
    public void visit(BinaryExpr binaryExpr, Void arg) {
        //            super.visit(binaryExpr,arg);
        System.out.println(
            ("Binary call :  line num {}" + binaryExpr.getRange().get().begin.line + " ===> {}" + binaryExpr
                .getParentNode().get().toString() + " ==> type is {}" + binaryExpr.getParentNode().get().getClass()
            ));

    }

    @Override
    public void visit(AssignExpr n, Void arg) {
        super.visit(n, arg);
        //System.out.println(("Assign express : line num {} ===> {} ===> type is {}", n.getBegin().get().line,
        //    n.getParentNode().get(), n.getParentNode().get().getClass());
    }
}
