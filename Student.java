/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
import java.util.Scanner;
class Student {
    int rollNo;
    String stdName;
    void getDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        stdName = sc.nextLine();
        System.out.println("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }
    void display() {
        System.out.println("Student Name: " + stdName);
        System.out.println("Roll No: " + rollNo);
    }
    public static void main(String args[]) {
        Student s = new Student();
        s.getDetail();
        s.display();
    }
}
