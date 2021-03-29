package test123322;

/**
 * @Author yijun.dyj
 * @Date 2021/3/2 4:59 PM
 **/
public class Test {

    public static void main(String[] args) {
        Dto dto=new Dto();

        trans(dto);

        System.out.println(dto.getName());
    }

    public static void trans(Dto dto) {
        dto.setName("123");
    }
}
