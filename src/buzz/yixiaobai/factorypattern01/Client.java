package buzz.yixiaobai.factorypattern01;



/**
 * 单例模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午4:26
 */
public class Client {
    public static void main(String[] args){
        // 创建一个工厂类
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("--造出的第一批是白色人种--");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--造出的第二批是黑色人种--");
        Human blackHuamn = humanFactory.createHuman(BlackHuman.class);
        blackHuamn.getColor();
        blackHuamn.talk();
        System.out.println("--造出的第三批是黄色人种--");
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
