package buzz.yixiaobai.builderpattern01;

/**
 * 指挥者->动态指定制作流程，返回产品
 * @author yixiaobai
 * @create 2022/04/18 下午8:03
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null;

    // 通过构造器传入， 执行初始化
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter方法传入，进行初始化
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者（可以自定义流程）
     * @return 建造好的房子
     */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
