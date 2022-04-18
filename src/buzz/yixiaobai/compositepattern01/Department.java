package buzz.yixiaobai.compositepattern01;

/**
 * 这是叶子节点
 * @author yixiaobai
 * @create 2022/04/17 下午3:22
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des){
        super(name, des);
    }

    // add()、remove()方法就不需要重写了

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String getDes(){
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
