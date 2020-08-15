package factory.abstract1;

public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("huawei phone call");
    }

    @Override
    public void sendSMS() {
        System.out.println("huawei phone send sms");
    }
}
