package buzz.yixiaobai.compositepattern03;

/**
 * 抽象公司职员
 * @author yixiaobai
 * @create 2022/04/17 下午6:08
 */
public abstract class Corp {
    private String name;
    private String position;
    private int salary;
    public Corp(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获取员工信息
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + this.name);
        sb.append("\t职位：" + this.position);
        sb.append("\t薪水：" + this.salary);

        return sb.toString();
    }
}
