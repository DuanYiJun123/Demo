//package testc;
//
//
//import com.github.javaparser.ast.CompilationUnit;
//import com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Author yijun.dyj
// * @Date 2020/1/3 4:51 PM
// **/
//public class Test {
//
//    public void test1() {
//        System.out.println("123");
//        System.out.println("456");
//    }
//
//    //public void test2() {
//    //    System.out.println("123");
//    //}
//    //
//    //public void test3() {
//    //    System.out.println("456");
//    //}
//
//    //public static void main(String[] args) {
//    //    Map<String, String> map = new HashMap<>();
//    //    map.put("1", "2");
//    //    map.put("1", "3");
//    //
//    //    System.out.println(JSONObject.toJSONString(map));
//    //}
//
//    public static void main(String[] args) {
//        String code = "// Hey, this is a comment\n\n\n// Another one\n\nclass A { }";
//        CompilationUnit cu = StaticJavaParser.parse(code);
//        LexicalPreservingPrinter.setup(cu);
//        System.out.println(LexicalPreservingPrinter.print(cu));
//    }
//
//}
