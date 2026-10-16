```java
enum StudentStatus {
    STUDYING, GRADUATED
}
private String studentId;
private String name;
private double score;
private StudentStatus status;
private static int studentCount = 0;
private static final String WORKSHOP_NAME = "Software Engineering";
public Student(String studentId, String name, double score, StudentStatus status) {
    this.studentId = studentId;
    this.name = name;
    this.score = score;
    this.status = status;
    studentCount++;
}
public String getStudentId() {
    return studentId;
}
public void setStudentId(String studentId) {
    this.studentId = studentId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getScore() {
    return score;
}
public void setScore(double score) {
    this.score = score;
}
public StudentStatus getStatus() {
    return status;
}
public void setStatus(StudentStatus status) {
    this.status = status;
}
public static int getStudentCount() {
    return studentCount;
}

public static String getWorkshopName() {
    return WORKSHOP_NAME;
}
```

```java
package Task3;

public class test {
    public static void main(String[] args) {
        Student student1 = new Student("001", "张三", 90, Student.StudentStatus.STUDYING);
        Student student2 = new Student("002", "李四", 80, Student.StudentStatus.GRADUATED);
        Student student3 = new Student("003", "王五", 75, Student.StudentStatus.STUDYING);
        System.out.println(student1.getName() + " " + student1.getScore() + " " + student1.getStatus());
        System.out.println(student2.getName() + " " + student2.getScore() + " " + student2.getStatus());
        System.out.println(student3.getName() + " " + student3.getScore() + " " + student3.getStatus());
        System.out.println("当前对象数量：" + Student.getStudentCount());
        System.out.println("工作室名称：" + Student.getWorkshopName());
        student1.setScore(95);
        student1.setStatus(Student.StudentStatus.GRADUATED);
        System.out.println(student1.getName() + " " + student1.getScore() + " " + student1.getStatus());
    }

}
```

## 类和对象是什么关系？

类是抽象的描述，定义一类事物有哪些属性和行为，对象是实例个体，具有确切的属性和行为

## `this`解决了什么问题？

解决了同名参数的问题，确切的指向特定的对象

## 静态成员和实例成员有什么区别？

静态成员(static)属于类本身拥有的，而实例成员属于对象，必须先new出对象后才存在

## `final` 修饰变量、方法和类时分别意味着什么？

修饰变量：变量只能被赋值一次，数值不可变动

修饰方法：该方法不可以被重写（子类）

修饰类：该类不能被继承

