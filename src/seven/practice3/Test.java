package seven.practice3;

public class Test {
    public static void main(String[] args) {
        Phone phone=new NotAIPhone("G502c","索尼爱立信");
        phone.printInfo();
        phone.broadcast();
        phone.sentMessage();
        phone.call();


        System.out.println();
        /*智能手机*/
        Phone phone1=new AiPhone("HTC","I9100");
        phone1.printInfo();
        /*联网*/
        if(phone1 instanceof AiPhone){
            ((AiPhone) phone1).Network();
        }
        phone1.broadcast();
        if(phone1 instanceof AiPhone){
            ((AiPhone) phone1).takePicture();
        }
        phone1.sentMessage();
        phone1.call();
    }
}
