package factory.simple;

/**
 * 简单工厂模式（静态工厂模式）
 * 违反开闭原则：对扩展开放，对修改关闭
 * 添加新车时需要改动现有代码
 */
public class CarFactory {
    public static Car getCar(String carName){
        if ("wuLing".equals(carName)){
            return new WuLingCar();
        } else if ("Tesla".equals(carName)){
            return new Tesla();
        } else {
            return null;
        }
    }
}
