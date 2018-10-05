package task_1_2;

import Utils.Reader;

import java.io.IOException;

public class AreaCalculator {


    public static double calculateAreaOfACircle() throws IOException {
        String line = Reader.readlineFromConsole(); //read radius
        double radius = Double.parseDouble(line);
        double areaOfACircle = Circle.area(radius);
        return areaOfACircle;

    }

    public static double calcucateAreaOfSquare() throws IOException {
        String line = Reader.readlineFromConsole();
        double side = Double.parseDouble(line);
        double areaOfSquare = Square.area(side);
        return areaOfSquare;
    }
}
