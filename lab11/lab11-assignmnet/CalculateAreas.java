package com.company;
import java.util.Scanner;
public class CalculateAreas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int length = input.nextInt();
        Shape[] arr = new Shape[length];

        for (int i = 0 ; i<arr.length ; i++){
            System.out.println("Enter 1 if you want to instantiate circle, 2 for triangle and 3 for rectangle: ");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                arr[i] = new Circle(radius);
            }
            else if (choice == 2){
                System.out.println("Enter the base and height of triangle: ");
                double base = input.nextDouble();
                double height = input.nextDouble();
                arr[i] = new Triangle(base,height);
            }
            else if (choice == 3){
                System.out.println("Enter the lenght and width of rectangle: ");
                double len = input.nextDouble();
                double wid = input.nextDouble();
                arr[i] = new Rectangle(len,wid);
            }
            else {
                System.out.println("Your choice is incorrect, please try again");
                i-=1;
            }
        }
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] instanceof Circle){
                System.out.println("The area of circle of length "+((Circle) arr[i]).getRadius() +
                        " is "+arr[i].Area());
            }
            else if (arr[i] instanceof Rectangle){
                System.out.println("The area of rectangle of length "+((Rectangle) arr[i]).getLength()+
                        " and width "+((Rectangle) arr[i]).getWidth()+" is "+arr[i].Area());
            }
            else{
                System.out.println("The area of triangle of base "+((Triangle)arr[i]).getBase()+
                        " and height "+((Triangle)arr[i]).getHeight()+" is "+arr[i].Area());
            }
        }
    }
}
