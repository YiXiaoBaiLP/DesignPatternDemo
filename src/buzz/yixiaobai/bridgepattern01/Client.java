package buzz.yixiaobai.bridgepattern01;

/**
 * 桥接模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午2:48
 */
public class Client {
    public static void main(String[] args){
        // 创建一个手机品牌
        Brand brand = new VivoBrand();
        // 创建一个手机样式
        FolderPhone vivoFolderPhone = new FolderPhone(brand);
        vivoFolderPhone.open();

        // 创建小米手机品牌
        Brand brand1 = new XiaoMiBrand();
        // 折叠手机样式
        new FolderPhone(brand1).open();
        // 平板手机
        new UpRightPhone(brand1).open();

        // 创建魅族手机品牌
        Brand meiZUBrand = new MeiZuBrand();
        // 折叠手机
        FolderPhone meiZuPhone = new FolderPhone(meiZUBrand);
        meiZuPhone.open();
        meiZuPhone.close();
        meiZuPhone.call();
    }
}
