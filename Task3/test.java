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
