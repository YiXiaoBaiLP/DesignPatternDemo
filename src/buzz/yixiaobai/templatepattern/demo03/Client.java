package buzz.yixiaobai.templatepattern.demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模版方法模式（钩子方法）--场景类
 * @author yixiaobai
 * @create 2022/04/26 下午4:31
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("------- H1 型号悍马 ------");
        System.out.println("H1 型号的悍马是否需要喇叭声响？0 - 不需要    1 - 需要");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HummerH1Mode1 h1 = new HummerH1Mode1();
        if(type.equals("0")){
            h1.setAlarmFlag(false);
        }
        h1.run();

        System.out.println("------- H2 型号悍马 ------");
        HummerH2Mode2 h2 = new HummerH2Mode2();
        h2.run();
    }
}
