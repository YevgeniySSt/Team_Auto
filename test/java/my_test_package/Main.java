package my_test_package;

import my_package.AreaCalculator;
import my_package.Fitter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Task 1

        System.out.println("Please enter the radius of a circle:");
        double areaOfACircle = AreaCalculator.calculateAreaOfACircle();

        System.out.println("Please enter the side of a square:");
        double areaOfASquare = AreaCalculator.calcucateAreaOfSquare();

        System.out.println("Area of circle = " + areaOfACircle);
        System.out.println("Area of a square = " + areaOfASquare);

        // Task 2

        boolean circleFitsSquare = Fitter.doesCircleFitSquare(areaOfACircle, areaOfASquare);
        boolean squareFitsCircle = Fitter.doesSquareFitCircle(areaOfASquare, areaOfACircle);

        if (circleFitsSquare) {
            System.out.println("Circle fits square");
        } else {
            System.out.println("Circle doesn't fit square");
        }

        if (squareFitsCircle) {
            System.out.println("Square fits circle");
        } else {
            System.out.println("Square doesn't fit circle");
        }


    }
}
