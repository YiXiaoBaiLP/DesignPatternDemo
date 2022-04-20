package buzz.yixiaobai.facadepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/20 下午11:28
 */
public class Projector {
    // 使用饿汉式
    private Projector(){}

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Projector on");
    }

    public void off(){
        System.out.println(" Projector off");
    }

    public void fouc(){
        System.out.println(" Projector is Project");
    }
}
