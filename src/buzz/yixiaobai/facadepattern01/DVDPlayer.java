package buzz.yixiaobai.facadepattern01;

/**
 * 外观模式
 * @author yixiaobai
 * @create 2022/04/20 下午11:22
 */
public class DVDPlayer {

    // 使用单例模式
    private DVDPlayer(){}

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" dvd on ");
    }

    public void off(){
        System.out.println(" dvd off ");
    }

    public void play(){
        System.out.println(" dvd is playing ");
    }

    public void pause(){
        System.out.println(" dvd pause ... ");
    }
}
