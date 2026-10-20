package Task4;
/*题目要求
  设计一个图形计算程序。
  1. 定义接口 Shape，包含 area()、perimeter() 和 type() 三个方法。
  2. 实现 Rectangle、Circle 和 Triangle 三个具体图形类。
  3. 使用 Shape[] 保存多个不同图形，并通过统一循环输出每个图形的类型、面积和周长。
  拓展（加分，可选）
  1. 定义抽象类 AbstractShape，实现 Shape 接口并保存图形名称；让三个图形类继承 AbstractShape。
  2. 使用匿名内部类创建一个只使用一次的特殊图形对象。
  建议的核心接口：  java public interface Shape {
    double area();
    double perimeter();
    String type();
}   */

public class test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Rectangle(10, 20),
                new Circle(4),
                new Triangle(3, 4, 5),

                new AbstractShape("AbstractShape") {
                    @Override
                    public double area() {
                        return 0;
                    }
                    @Override
                    public double perimeter() {
                        return 0;
                    }
                    @Override
                    public String type() {
                        return "AbstractShape";
                    }
                }
        };
        for (Shape shape : shapes) {
            System.out.println(shape.type() + " 的面积是 " + shape.area() + "，周长是 " + shape.perimeter());
        }
    }
}
