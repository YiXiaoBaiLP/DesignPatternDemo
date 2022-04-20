package buzz.yixiaobai.facadepattern01;

/**
 * 外观模式
 * @author yixiaobai
 * @create 2022/04/20 下午11:45
 */
public class Client {
    public static void main(String[] args){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.play();
        homeTheaterFacade.read();
        homeTheaterFacade.end();
    }
}
