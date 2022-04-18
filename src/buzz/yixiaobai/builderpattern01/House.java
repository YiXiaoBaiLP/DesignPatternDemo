package buzz.yixiaobai.builderpattern01;

/**
 * 房子 产品类-> Product
 * @author yixiaobai
 * @create 2022/04/18 下午7:53
 */
public class House {

    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
