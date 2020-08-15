package builder.demo01;

/**
 * 产品：房子
 */
public class Product {
    private String buildeA;
    private String buildeB;
    private String buildeC;
    private String buildeD;

    public String getBuildeA() {
        return buildeA;
    }

    public void setBuildeA(String buildeA) {
        this.buildeA = buildeA;
    }

    public String getBuildeB() {
        return buildeB;
    }

    public void setBuildeB(String buildeB) {
        this.buildeB = buildeB;
    }

    public String getBuildeC() {
        return buildeC;
    }

    public void setBuildeC(String buildeC) {
        this.buildeC = buildeC;
    }

    public String getBuildeD() {
        return buildeD;
    }

    public void setBuildeD(String buildeD) {
        this.buildeD = buildeD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "buildeA='" + buildeA + '\'' +
                ", buildeB='" + buildeB + '\'' +
                ", buildeC='" + buildeC + '\'' +
                ", buildeD='" + buildeD + '\'' +
                '}';
    }
}
