package factory.abstract1;

/**
 * 抽象工厂模式
 */
public interface ProductFactory {
    // 生产手机
    Phone getPhone();

    // 生产路由器
    Router getRouter();
}
