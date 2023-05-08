package seven.practice3;

public class AiPhone extends Phone implements Online, Photo {
    public AiPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    void sentMessage() {
        System.out.println("发送图片与文字信息。。。");
    }

    @Override
    void call() {
        System.out.println("开始视频通话。。。。");
    }

    @Override
    void broadcast() {
        System.out.println("开始播放视频《精忠报国》。。。");
    }

    @Override
    public void Network() {
        System.out.println("已经启动移动网络了。。。");
    }

    @Override
    public void takePicture() {
        System.out.println("咔嚓。。。拍照成功");
    }
}
