package buzz.yixiaobai.bridgepattern01;

/**
 * 直板手机，继承Phone类
 * @author yixiaobai
 * @create 2022/04/18 下午2:46
 */
public class UpRightPhone extends Phone{
    // 构造函数中初始化Brand类
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println(" 直板手机开机了！ ");
    }

    public void close(){
        super.close();
        System.out.println(" 直板手机关机了！ ");
    }

    public void call(){
        super.call();
        System.out.println(" 直板手机打电话！ ");
    }
}
