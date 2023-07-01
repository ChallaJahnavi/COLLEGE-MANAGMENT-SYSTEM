import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private int age;
    
    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
}

class CollegeManagementSystem {
    private List<Student> students;
    
    public CollegeManagementSystem() {
        students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Age: " + student.getAge());
            System.out.println("---------------------");
        }
    }
}

public class Main1{
    public static void main(String[] args) {
        CollegeManagementSystem cms = new CollegeManagementSystem();
        
        // Adding sample students
        Student student1 = new Student("John Doe", "001", 20);
        Student student2 = new Student("Jane Smith", "002", 19);
        
        cms.addStudent(student1);
        cms.addStudent(student2);
        
        // Displaying the list of students
        cms.displayStudents();
    }
}
