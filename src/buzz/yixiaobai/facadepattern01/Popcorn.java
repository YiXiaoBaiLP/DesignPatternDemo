package buzz.yixiaobai.facadepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/20 下午11:26
 */
public class Popcorn {
    // 单例模式
    private Popcorn(){}

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" popcorn on ");
    }

    public void off(){
        System.out.println(" popcorn off ");
    }

    public void pop(){
        System.out.println(" popcorn is poping ");
    }
}
