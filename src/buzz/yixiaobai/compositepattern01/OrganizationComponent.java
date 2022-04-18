package buzz.yixiaobai.compositepattern01;

/**
 * 组合模式
 * @author yixiaobai
 * @create 2022/04/17 下午2:55
 */
public abstract class OrganizationComponent {

    // 名字
    private String name;
    // 说明
    private String des;
    // 这里暂时无法确定，所以先默认实现
    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }
    // 这里暂时无法确定，所以先默认实现
    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }
    // 这个方法子类都需要实现
    protected abstract void print();
    // 构造器
    public OrganizationComponent(String name, String des){
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
