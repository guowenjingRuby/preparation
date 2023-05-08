package seven.practice2;

public class UDisk implements UsbInterface{
    @Override
    public void usbStandard() {
        System.out.println("我遵守了usb规范，我可以用它进行数据传输。");
    }
}
