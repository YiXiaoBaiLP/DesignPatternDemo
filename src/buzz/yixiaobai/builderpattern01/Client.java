package buzz.yixiaobai.builderpattern01;

/**
 * 建造者模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午8:14
 */
public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 创建构建者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
        System.out.println("--------------------------------------------------");
        // 盖高房子
        HeightHouse heightHouse = new HeightHouse();
        HouseDirector houseDirector1 = new HouseDirector(heightHouse);
        houseDirector1.constructHouse();
    }
}
