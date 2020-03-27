package com.shapes;
import java.util.Scanner;

import com.hexagon.Hexagon;
import com.parallelogram.Parallelogram;
import com.rectangle.Rectangle;
import com.shapes.com.circle.Circle;

public class Shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SHAPE AREA CALCULATOR!");

        System.out.println("Press '0' to continue and '-1' to quit: ");
        int i = input.nextInt();

        while (i != -1) {

            System.out.println("Press '1' to calculate area of circle, '2' for parallelogram, '3' for hexagon, '4' " +
                    "for rectangle: ");
            int c = input.nextInt();

            if (c == 1) {
                Circle circle1 = new Circle();
                System.out.println("Enter radius of the circle: ");
                circle1.setRadius(circle1.getRadius() + input.nextDouble());

                System.out.println("Area is ≈ " + 3.14 * (circle1.getRadius() * circle1.getRadius()));
            } //circle

            else if (c == 2) {
                Parallelogram parallelogram1 = new Parallelogram();
                System.out.println("Enter base of parallelogram: ");
                parallelogram1.setBase(input.nextDouble());
                System.out.println("Enter height of parallelogram: ");
                parallelogram1.setHeight(input.nextDouble());

                System.out.println("Area is ≈ " + (parallelogram1.getBase() * parallelogram1.getHeight()));
            }// parallelogram

            else if (c == 3){
                Hexagon hexagon1 = new Hexagon();
                System.out.println("Enter side length of hexagon: ");
                hexagon1.setSide(input.nextDouble());

                System.out.println("Area is ≈ " + ((3 * (Math.sqrt(3))) / (2)) * (hexagon1.getSide()* hexagon1.getSide()) );
            }//hexagon
            else if (c == 4){
                Rectangle rectangle1 = new Rectangle();
                System.out.println("Enter length of rectangle: ");
                rectangle1.setLength(input.nextDouble());
                System.out.println("Enter width of rectangle: ");
                rectangle1.setWidth(input.nextDouble());

                System.out.println("Area is ≈ " + (rectangle1.getLength() * rectangle1.getWidth()) );
            }// rectangle

            System.out.println("Press '0' to continue and '-1' to quit: ");
            i = input.nextInt();

        }// while loop

    }//main method

}//class shapes



