public class Activity {
    public static void main(String[] args) {
        
        Student student = new Student("Patrick", "Balayan", "BSIT", 2);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        System.out.println(student.toString());
        
        Staff staff = new Staff("Russel", "San Piro", "BSU", 253000);
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: " + staff.getSalary());
        System.out.println(staff.toString());
    }
}
