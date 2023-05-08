package seven.pratice2;

public class Test {
    public static void main(String[] args) {
        UsbInterface mouse=new Mouse();
        mouse.usbStandard();

        UsbInterface uDisk=new UDisk();
        mouse.usbStandard();
    }
}
