package factory.abstract1;

public class XiaoMiFactory implements ProductFactory {
    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Router getRouter() {
        return new XiaoMiRouter();
    }
}
