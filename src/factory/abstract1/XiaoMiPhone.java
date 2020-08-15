package factory.abstract1;

public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("xiaomi phone call");
    }

    @Override
    public void sendSMS() {
        System.out.println("xiaomi phone send sms");
    }
}
