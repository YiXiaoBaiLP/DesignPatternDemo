package buzz.yixiaobai.prototypepattern01;

import java.util.Random;

/**
 * 场景类
 * @author yixiaobai
 * @create 2022/04/14 下午3:50
 */
public class Client {
    private static int MAX_COUNT = 6000000;
    public static void main(String[] args){
        // 模拟发送邮件
        int i = 0;
        // 把模版定义出来，这个是从数据库中获取
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while(i < MAX_COUNT){
            // 这里使用了浅拷贝方法，即原型模式
            Mail cloneMail = mail.clone();
            // 每个邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    /**
     * 发送邮件
     * @param mail
     */
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() +"\t...发送成功！");
    }

    /**
     * 获取指定长度的随机字符串
     * @param maxLength 字符串长度
     * @return
     */
    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random ran = new Random();
        for(int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(ran.nextInt(source.length())));
        }
        return sb.toString();
    }
}
