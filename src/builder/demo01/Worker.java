package builder.demo01;

/**
 * 具体的建造者：工人
 */
public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void builderA() {
        product.setBuildeA("地基");
        System.out.println("地基");
    }

    @Override
    void builderB() {
        product.setBuildeB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void builderC() {
        product.setBuildeC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void builderD() {
        product.setBuildeD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
