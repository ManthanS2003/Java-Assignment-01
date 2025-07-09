/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manth
 */
public class MethodOverloading {
    int a,b,c;
     int add(int a,int b) {
         return a+b;
     }
     int add(int a,int b,int c) {
         return a+b+c;
     }
     public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
         System.out.println("Sum of two Numbers : "+ob.add(5,4));
         System.out.println("Sum of three Numbers : "+ob.add(5,4,6));
    }
}
