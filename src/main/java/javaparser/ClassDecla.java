package javaparser;

import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;


/**
 * @Author yijun.dyj
 * @Date 2019/12/30 3:44 PM
 **/
public class ClassDecla extends VoidVisitorAdapter<Void> {


    @Override
    public void visit(PackageDeclaration n, Void arg) {


        //NodeList<BodyDeclaration<?>> members = n.getMembers();
        //for(int i=0;i<members.size();i++){
        //    //Optional<BlockStmt> body = members.get(i).asMethodDeclaration().getBody();
        //    System.out.println(members.get(i).asMethodDeclaration());
        //}
        super.visit(n, arg);
        System.out.println("class declaration:" + n.getNameAsString());

    }

}
