package listTest;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.Optional;

/**
 * @Author yijun.dyj
 * @Date 2019/11/25 10:22 AM
 **/
public class Test {

    public void parseJavaCode() {
        String javaCode = "public class ParserTest {\n"
            + "\n"
            + "    public static void main(String[] args) {\n"
            + "        int x = Integer.parseInt(args[0]);\n"
            + "        System.out.println(\"sign(x)=\" + sign(x));\n"
            + "    }\n"
            + "\n"
            + "    private static int sign(int x) {\n"
            + "        if (x > 0) {\n"
            + "            return 1;\n"
            + "        } else if (x < 0) {\n"
            + "            return -1;\n"
            + "        } else {\n"
            + "            return 0;\n"
            + "        }\n"
            + "    }\n"
            + "}\n";

        //JavaParser pa = new JavaParser();
       // CompilationUnit result = JavaParser.parse(javaCode);
        // Optional<CompilationUnit> result1 = result.getResult();

        VoidVisitorAdapter<Object> adapter = new VoidVisitorAdapter<Object>() {
            @Override
            public void visit(ClassOrInterfaceDeclaration clz, Object arg) {
                super.visit(clz, arg);
                System.out.println(clz.getName().getIdentifier());
            }

            @Override
            public void visit(MethodDeclaration mth, Object arg) {
                super.visit(mth, arg);
                System.out.println(mth.getName().getIdentifier());
            }

        };

        //adapter.visit(result, null);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.parseJavaCode();
    }

}
