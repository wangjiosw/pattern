package builder.demo02;

public class Test {
    public static void main(String[] args) {
        // 服务员
        Builder worker = new Worker();
        // 链式编程：在原来的基础上可以自由组合了，如果不组合，也有默认的套餐
        Product product = worker.builderA("全家桶").builderB("雪碧").getProduct();
        System.out.println(product.toString());
    }
}
