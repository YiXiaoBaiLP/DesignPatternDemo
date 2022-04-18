package buzz.yixiaobai.compositepattern02;

/**
 * @author yixiaobai
 * @create 2022/04/17 下午5:23
 */
public class Leaf implements ILeaf{
    // 名称
    private String name = "";
    // 职位
    private String position = "";
    // 薪水
    private int salary = 0;
    // 通过构造函数传递员工信息
    public Leaf(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    // 获取员工信息
    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + this.name);
        sb.append("\t职位：" + this.position);
        sb.append("\t薪水：" + this.salary);

        return sb.toString();
    }
}
