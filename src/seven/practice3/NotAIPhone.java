package seven.practice3;

public class NotAIPhone extends Phone {


    public NotAIPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sentMessage() {
        System.out.println("发送文字信息。。。。");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话。。。。");
    }

    @Override
    void broadcast() {
        System.out.println("开始播放音乐《歌唱祖国》");
    }
}
