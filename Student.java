package Task3;

public class Student {
    /*设计一个 Student 类，包含以下内容：

私有字段：studentId、name、score、status。
status 使用枚举 StudentStatus，至少包含 STUDYING 和 GRADUATED。1
使用构造方法初始化学生信息。
使用公有的读取和修改方法访问私有字段（允许使用 IDEA 自动生成 getter/setter）。
使用静态变量记录程序创建过的学生对象数量。
使用 static final 定义一个工作室名称常量。
创建至少三个学生对象，分别输出学生信息、当前对象数量和工作室名称，并演示修改其中一个学生的成绩和状态。

实现要求
所有字段必须使用 private 修饰。
构造方法中需要给静态对象数量加一。
静态成员和实例成员要在代码中同时出现。
记录本题学习笔记，笔记内容不作其他限制，但开头需要回答本题的全部“必答问题”。
必答问题
类和对象是什么关系？
this 解决了什么问题？
静态成员和实例成员有什么区别？
final 修饰变量、方法和类时分别意味着什么？
完成清单
[ ] Student 类完成字段封装
[ ] 构造方法正确初始化对象*/
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


}
