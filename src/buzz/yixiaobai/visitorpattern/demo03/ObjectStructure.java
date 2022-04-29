package buzz.yixiaobai.visitorpattern.demo03;

import java.util.Random;

/**
 * 结构对象
 * @author yixiaobai
 * @create 2022/04/29 下午2:12
 */
public class ObjectStructure {

    /**
     * 对象生成器，通过一个工厂方法模式模拟
     * @return
     */
    public static Element createElement(){
        Random random = new Random();
        if(random.nextInt(100) > 50){
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }


}
