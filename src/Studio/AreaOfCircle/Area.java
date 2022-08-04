package Studio.AreaOfCircle;

import java.util.Scanner;
import Studio.AreaOfCircle.Circle;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);


            if (radius <= 0 ){
                System.out.println("Error: Enter a positive number");

            } else {
                System.out.println("The area of a circle of radius " + radius + " is: " + area);

            }

         }

    }

