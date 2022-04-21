package buzz.yixiaobai.flyweightpattern.demo06;

import java.util.Objects;

/**
 * 享元模式-外部状态类
 * @author yixiaobai
 * @create 2022/04/21 下午10:55
 */
public class ExtrinsicState {
    // 考试科目
    private String subject;
    // 考试地点
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    // 重写equest方法
    @Override
    public boolean equals(Object o) {
        if(o instanceof ExtrinsicState){
            ExtrinsicState state = (ExtrinsicState) o;
            return state.getSubject().equals(subject) && state.getLocation().equals(location);
        }
        return false;
    }
    // 重写hashCode
    @Override
    public int hashCode() {
        return subject.hashCode() + location.hashCode();
    }
}
