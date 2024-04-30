public class User {
  String name;
  String login() {
    return "LoggedIn";
  }
  String register() {
    if (password.equals("") || username.equals("")) {
      return "Can't be empty";
    } else {
      System.out.println("Login successful");
    }
  }
    String logout() {
      return "Logged out successfully";
  }
 
}
public class Admin extends User {
  String StaffNo;
  String UploadResult(String course, float score) {
    System.out.println("Course + score);
  }
}
public class Student extends User {
  String MatricNo;
  String AdmissionNo;
  String RegisterCourses(String course, String courseCode) {
    System.out.println("Course" + CourseCode);
  }
  String CheckResult(String department, double GPA) {
    System.out.println("department" + GPA);
   
  }
}
