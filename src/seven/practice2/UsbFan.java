package seven.practice2;

public class UsbFan implements UsbInterface{
    @Override
    public void usbStandard() {
        System.out.println("我遵守了你的规范，可以获取电流，使风扇转动");
    }
}
