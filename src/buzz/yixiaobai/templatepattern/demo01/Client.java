package buzz.yixiaobai.templatepattern.demo01;

/**
 * 模版模式-客户端
 * @author yixiaobai
 * @create 2022/04/26 下午3:10
 */
public class Client {
    public static void main(String[] args){
        // 制作红豆豆浆

        System.out.println("--- 制作红豆豆浆 ---");
        SoyaMilk redSoyaMilk = new RadBeanSoyaMilk();
        redSoyaMilk.make();

        System.out.println("--- 制作花生豆浆 ---");
        SoyaMilk peanutSoyaMilk = new PeanutSoyMilk();
        peanutSoyaMilk.make();
    }
}
