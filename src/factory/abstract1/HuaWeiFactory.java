package factory.abstract1;

public class HuaWeiFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Router getRouter() {
        return new HuaWeiRouter();
    }
}
