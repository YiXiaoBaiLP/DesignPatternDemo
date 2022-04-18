package buzz.yixiaobai.singletonpattern08;

/**
 * 单例模式（枚举）
 * @author yixiaobai
 * @create 2022/04/19 上午12:57
 */
public enum Singleton {
    INSTANCE;

    private Singleton instance;
    private Singleton instance(){
        instance = new Singleton();
    }
    public void isOK(){
        System.out.println("OK");
    }
}
