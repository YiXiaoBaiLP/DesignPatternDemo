package buzz.yixiaobai.visitorpattern.demo05;

/**
 * @author yixiaobai
 * @create 2022/04/29 下午5:51
 */
public abstract class Employee {

    // 0代表男性
    public final static int MALE = 0;
    // 1代表女性
    public final static int FEMALE = 1;

    // 薪水
    private int salary;
    // 姓名
    private String name;
    // 性别
    private int sex;

    // 谁可以访问
    abstract void accept(IVisitor iVisitor);

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
