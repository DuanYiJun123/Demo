package aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.io.IOException;

/**
 * @Author yijun.dyj
 * @Date 2021/2/7 11:27 AM
 **/
public class Aviator {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException {

        AviatorEvaluator.addStaticFunctions("featureUtil", FeatureUtil.class);
        AviatorEvaluator.addStaticFunctions("jsonUtil", JSonUtil.class);
        AviatorEvaluator.addStaticFunctions("parserUtil",ParserUtil.class);

        Expression exp = AviatorEvaluator.getInstance().compileScript(
            "/Users/duanyijun/Documents/demo/src/main/java/aviator/test.av");
        exp.execute();

    }
}
