package buzz.yixiaobai.prototypepattern05;

import java.io.*;
import java.util.ArrayList;

/**
 * 深拷贝（二进制流实现）
 * @author yixiaobai
 * @create 2022/04/14 下午5:46
 */
public class Thing implements Serializable, Cloneable {

    private ArrayList<String> list = new ArrayList<>();

    @Override
    public Thing clone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Thing thing = (Thing) ois.readObject();
            return thing;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                // 关闭流
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                // 输出错误信息
                System.err.println(e.getMessage());
            }
        }

    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(String value) {
        this.list.add(value);
    }
}
