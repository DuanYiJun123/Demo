package javaparser;

import com.alibaba.fastjson.JSONObject;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.printer.YamlPrinter;
import com.sun.tools.internal.ws.processor.util.ClassNameCollector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2019/12/27 10:18 AM
 **/
public class App {

    public static void ergodicDir(File dir, HashSet<String> argNameSet, HashSet<String> classNameSet,
                                  ArrayList<Integer> record) {
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    ergodicDir(file, argNameSet, classNameSet, record);
                }
                if (file.isFile() && file.getName().endsWith("java")) {
                    Jparser.parser(file, argNameSet, classNameSet, record);
                }
            }
        }
    }

    public static void main(String[] args) {
        YamlPrinter printer = new YamlPrinter(true);

        File file = new File(
            "/Users/duanyijun/Documents/code/mec-tradeds/mec-tradeds-start/src/main/java/cn/damai/ec/trade/ds"
                + "/Application.java");
        try {
            CompilationUnit parse = JavaParser.parse(file);
            //System.out.println(printer.output(parse));
            //System.out.println(parse.toString());

            ExprPrint exprPrint = new ExprPrint();
            MethodDecla methodDecla = new MethodDecla();
            ClassDecla classDecla = new ClassDecla();
            // parse.accept(exprPrint, null);
            //parse.accept(methodDecla, null);
            parse.accept(classDecla, null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
