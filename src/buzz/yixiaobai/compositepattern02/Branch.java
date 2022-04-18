package buzz.yixiaobai.compositepattern02;

import java.util.ArrayList;

/**
 * @author yixiaobai
 * @create 2022/04/17 下午5:32
 */
public class Branch implements IBranch{
    // 领导名称
    private String name;
    // 领导职位
    private String position;
    // 领导薪资
    private int salary = 0;
    // 管理的员工
    ArrayList<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     * 增加员工
     * @param corp
     */
    @Override
    public void addSubordinate(ICorp corp) {
        subordinateList.add(corp);
    }

    /**
     * 查看员工
     * @return
     */
    @Override
    public ArrayList<ICorp> getSubordinate() {
        return null;
    }

    @Override
    public int removeSubordinate(ICorp corp) {
        subordinateList.remove(corp);
        return 1;
    }

    /**
     * 领导信息
     * @return
     */
    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + this.name);
        sb.append("\t职位：" + this.position);
        sb.append("\t薪水：" + this.salary);
        return sb.toString();
    }
}
