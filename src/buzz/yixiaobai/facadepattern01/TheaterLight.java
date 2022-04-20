package buzz.yixiaobai.facadepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/20 下午11:35
 */
public class TheaterLight {

    private TheaterLight(){}

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" TheaterLight on ");
    }

    public void off(){
        System.out.println(" TheaterLight off ");
    }

    public void dim(){
        System.out.println(" TheaterLight dim ");
    }

    public void bright(){
        System.out.println(" TheaterLight bright ");
    }
}
