package my_package;

public class Fitter {
    public static boolean doesCircleFitSquare(double areaOfACircle, double areaOfASquare) {
        double diameter = 2 * Math.sqrt(areaOfACircle / Circle.pi);
        double side = Math.sqrt(areaOfASquare);
        if (diameter <= side) {
            return true;
        } else return false;

    }

    public static boolean doesSquareFitCircle(double areaOfASquare, double areaOfACircle) {
        double diagonal = Math.sqrt(2) * Math.sqrt(areaOfASquare);
        double diameter = 2 * Math.sqrt(areaOfACircle / Circle.pi);
        if (diagonal <= diameter) {
            return true;
        } else return false;


    }
}
