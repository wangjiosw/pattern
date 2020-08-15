package builder.demo01;

/**
 * 指挥：核心，负责指挥构建一个工程，工程如何构建，由它决定
 */
public class Director {
    public Product build(Builder builder){
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
