package javaparser;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.sun.tools.internal.ws.processor.util.ClassNameCollector;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 11:09 AM
 **/
public class Jparser {

    public static void parser(File inFile, HashSet<String> argNameSet, HashSet<String> classNameSet, ArrayList<Integer> record) {
        try{
            System.out.println(inFile.toString());
            record.set(0, record.get(0) + 1);
            //将一个java代码的文本解析为一棵CompilationUnit类型的树
            CompilationUnit unit = com.github.javaparser.JavaParser.parse(inFile);
            VoidVisitor<HashSet<String>> methodArgsNameCollector = new MethodArgsNameCollector();
            VoidVisitor<HashSet<String>> classNameCollector = (VoidVisitor<HashSet<String>>)new ClassNameCollector();
            //在指定的树上进行搜索，然后根据遇到的节点的类型调用具体的回调
            methodArgsNameCollector.visit(unit, argNameSet);
            classNameCollector.visit(unit, classNameSet);
        } catch (Exception e) {
            record.set(1, record.get(1) + 1);
        }
    }
}
