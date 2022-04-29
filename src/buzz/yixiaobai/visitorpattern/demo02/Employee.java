package buzz.yixiaobai.visitorpattern.demo02;

/**
 * 抽象员工类
 * @author yixiaobai
 * @create 2022/04/29 上午1:16
 */
public abstract class Employee {
    // 0代表男性
    public final static int MALE = 0;
    // 1代表女性
    public final static int FEMALE = 1;
    // 姓名
    private String name;
    // 薪水
    private int salary;
    // 性别
    private int sex;

    /**
     * 我允许一个访问者访问
     * @param iVisitor
     */
    public abstract void accept(IVisitor iVisitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
