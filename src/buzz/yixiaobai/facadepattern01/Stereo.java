package buzz.yixiaobai.facadepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/20 下午11:32
 */
public class Stereo {
    // 使用单例模式
    private Stereo(){}

    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Stereo on ");
    }

    public void off(){
        System.out.println(" Stereo off ");
    }

    public void up(){
        System.out.println(" Sterro up...");
    }
}
