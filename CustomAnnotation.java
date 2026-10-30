
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface StudentInfo {
    String name();
    int rollNo();
}

@StudentInfo(name = "Anil", rollNo = 101)
class StudentDetails {
}

class CustomAnnotation {
    public static void main(String[] args) {

        System.out.println("Student Details:");

        StudentInfo s = StudentDetails.class.getAnnotation(StudentInfo.class);

        System.out.println("Name: " + s.name());
        System.out.println("Roll Number: " + s.rollNo());
    }
}
