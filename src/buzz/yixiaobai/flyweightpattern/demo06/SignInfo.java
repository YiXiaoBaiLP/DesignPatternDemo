package buzz.yixiaobai.flyweightpattern.demo06;

/**
 * 享元模式-报考信息
 * @author yixiaobai
 * @create 2022/04/21 下午6:59
 */
public class SignInfo {
    // 报考人员的ID
    private String id;
    // 考试地点
    private String location;
    // 考试科目
    private String subject;
    // 邮寄地址
    private String postAddress;
    // 外部状态
    private ExtrinsicState state;

    public ExtrinsicState getState() {
        return state;
    }

    public void setState(ExtrinsicState state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
