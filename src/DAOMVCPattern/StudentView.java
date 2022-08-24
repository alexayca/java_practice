/* * * * *
 * MVC -> view
 * * */
package DAOMVCPattern;

public class StudentView {
    public void printStudentDetails(String studentName, int studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
