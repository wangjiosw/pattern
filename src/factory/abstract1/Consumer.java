package factory.abstract1;

public class Consumer {
    public static void main(String[] args) {
        ProductFactory productFactory = new HuaWeiFactory();
        Phone phone = productFactory.getPhone();
        Router router = productFactory.getRouter();

        phone.call();
        phone.sendSMS();
        router.shareWifi();
    }
}
