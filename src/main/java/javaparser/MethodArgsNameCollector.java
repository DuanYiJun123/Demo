package javaparser;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.HashSet;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 10:20 AM
 **/
public class MethodArgsNameCollector extends VoidVisitorAdapter<HashSet<String>> {

    @Override
    public void visit(MethodDeclaration md, HashSet<String> argNameSet) {
        NodeList<Parameter> parameters = md.getParameters();
        for (Parameter parameter : parameters) {
            argNameSet.add(String.valueOf(parameter.getName()));
        }
        super.visit(md, argNameSet);
    }

}
