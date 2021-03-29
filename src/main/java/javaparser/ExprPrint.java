package javaparser;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.Optional;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 11:52 AM
 **/


public class ExprPrint extends VoidVisitorAdapter<Void> {

    @Override
    public void  visit(MethodCallExpr ae, Void arg){
        super.visit(ae,arg);
        SimpleName name = ae.getName();
        //Node node = ae.getParentNode().get();
        //Node node1 = node.getParentNode().get();
        // Node node2 = node1.getParentNode().get();
        NodeList<Expression> arguments = ae.getArguments();
        System.out.println(name);
        System.out.println(arguments.toString());

        //System.out.println("parentNode: "+node.toString());

        //
        //System.out.println("pparentNode: "+node1.toString());
        //String s = ae.getBegin().get().toString();
        //System.out.println(s);
        //System.out.println("ppparentNode: "+node2.toString());
        // logger.info("Method Call : line num {} ===>  {} ====> type is {} ",ae.getBegin().get().line, ae.getParentNode().get(), ae.getParentNode().get().getClass());

    }
}
