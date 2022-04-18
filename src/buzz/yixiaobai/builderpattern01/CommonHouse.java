package buzz.yixiaobai.builderpattern01;

/**
 * 通用房屋
 * @author yixiaobai
 * @create 2022/04/18 下午8:12
 */
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
