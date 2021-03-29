package javaparser;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/1/6 7:38 PM
 **/
public class MethodNamePrinter extends VoidVisitorAdapter<List<String>> {

    @Override
    public void visit(MethodDeclaration md, List<String> list) {
        super.visit(md, list);
        list.add(md.getNameAsString());
        System.out.println("Method Name Printed: " + md.getName());
    }
}
