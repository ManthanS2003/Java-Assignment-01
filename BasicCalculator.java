/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class BasicCalculator {
    double a, b;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        b = sc.nextDouble();
    }
    double add() {
        return a + b;
    }
    double sub() {
        return a - b;
    }
    double mul() {
        return a * b;
    }
    double div() {
        if (b != 0)
            return a / b;
        else
            return Double.NaN;
    }
    public static void main(String[] args) {
        BasicCalculator ob = new BasicCalculator();
        ob.getInput();
        System.out.println("Addition: " + ob.add());
        System.out.println("Subtraction: " + ob.sub());
        System.out.println("Multiplication: " + ob.mul());
        System.out.println("Division: " + ob.div());
    }
}
