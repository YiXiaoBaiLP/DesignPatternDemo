package buzz.yixiaobai.facadepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/20 下午11:30
 */
public class Screen {

    private Screen(){}

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" Screen on ");
    }

    public void off(){
        System.out.println(" Screen off ");
    }

    public void down(){
        System.out.println(" Screen down ");
    }

    public void up(){
        System.out.println(" Screen up ");
    }
}
