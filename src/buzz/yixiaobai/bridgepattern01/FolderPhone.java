package buzz.yixiaobai.bridgepattern01;

/**
 * 折叠手机，继承手机类
 * @author yixiaobai
 * @create 2022/04/18 下午2:44
 */
public class FolderPhone extends Phone{

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println(" 折叠手机! ");
    }

    public void close(){
        super.close();
        System.out.println(" 折叠手机！ ");
    }

    public void call(){
        super.call();
        System.out.println(" 折叠手机！ ");
    }
}
