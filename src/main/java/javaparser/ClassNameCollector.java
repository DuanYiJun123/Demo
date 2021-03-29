package javaparser;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.HashSet;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 10:37 AM
 **/
public class ClassNameCollector extends VoidVisitorAdapter<HashSet<String>> {

    @Override
    public void visit(ClassOrInterfaceDeclaration cORid, HashSet<String> classNameSet) {
        classNameSet.add(cORid.getNameAsString());
        super.visit(cORid, classNameSet);
    }
}
