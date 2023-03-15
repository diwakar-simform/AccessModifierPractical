package package2;
import package1.*;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        //Calling setter methods to set values.
        obj.setMyNickName("D");
        obj.setMyName("Diwakar");
        obj.setMyAge(22);

        //Calling getter methods to get values.
        System.out.println("My NickName : "+obj.getMyNickName());
        System.out.println("My Name : "+obj.getMyName());
        System.out.println("My Age : "+obj.getMyAge());
    }
}
