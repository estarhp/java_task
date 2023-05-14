package StudentManagementSystem;

//这个基础阶段考核的内容为做一个类似于管理学生管理系统这样功能的板块，具体内容自己想做什么就做什么
//功能简单不要紧，但是一定要用到java类与对象和部分高级特性，把之前学的那些java知识尽量都用进去就行了
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StudentManagementSystem {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Student ID:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Student GPA:");
        double gpa = Double.parseDouble(scanner.nextLine());

        Student student = new Student(name, id, gpa);
        students.add(student);
    }

    public void viewStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() +
                    ", ID: " + student.getId() +
                    ", GPA: " + student.getGpa());
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        boolean running = true;

        while (running) {
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to view all students");
            System.out.println("Enter 3 to exit");

            int selection = Integer.parseInt(system.scanner.nextLine());

            switch (selection) {
                case 1:
                    system.addStudent();
                    break;
                case 2:
                    system.viewStudents();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
