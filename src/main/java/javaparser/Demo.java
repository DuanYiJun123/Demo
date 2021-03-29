package javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/1/6 7:28 PM
 **/
public class Demo {

    private static final String FILE_PATH = "/Users/duanyijun/Documents/demo/src/main/java/javaparser/JParserDemo.java";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> methodNameList = new ArrayList<>();
        CompilationUnit cu = JavaParser.parse(new File(FILE_PATH));
        MethodNamePrinter methodNamePrinter = new MethodNamePrinter();
        methodNamePrinter.visit(cu, methodNameList);
        methodNameList.forEach(n -> System.out.println("Method Name Collected: " + n));

        List<Comment> comments = cu.getAllContainedComments();
        comments.forEach(n-> System.out.println("comments : "+n));
    }
}
