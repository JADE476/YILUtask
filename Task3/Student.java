package Task3;

public class Student {
   
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
