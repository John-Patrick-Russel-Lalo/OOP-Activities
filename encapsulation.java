
public class encapsulation {
    public static void main(String[] args) {
        student student1 = new student();
        
        student1.setStudent_Id(19656);
        student1.setName("Patrick");
        
        System.out.println("Student ID: " + student1.getStudent_Id());
        System.out.println("Name: " + student1.getName());
        
        // Practical Exercise
        book book1 = new book();
        
        book1.setBook_Number(192245);
        book1.setTitle("Java Rice");
        book1.setAuthor("John Patrick Russel");
        book1.setPrice(234.34);
        
        System.out.println("\nBook Number: " + book1.getBook_Number());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: $" + book1.getPrice());
    }
}
