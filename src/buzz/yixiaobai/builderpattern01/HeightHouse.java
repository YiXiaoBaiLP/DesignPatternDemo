package buzz.yixiaobai.builderpattern01;

/**
 * 建造高楼
 * @author yixiaobai
 * @create 2022/04/18 下午8:10
 */
public class HeightHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" 高楼的地基10米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的墙砌20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的屋顶是透明的 ");
    }
}
