package task_1_2;

public class Fitter {
    public static boolean isCircleFittedSquare(double areaOfACircle, double areaOfASquare) {
        double diameter = 2 * Math.sqrt(areaOfACircle / Circle.pi);
        double side = Math.sqrt(areaOfASquare);
        /*if (diameter <= side) {
            return true;
        } else {
            return false;
        }
        */
        return diameter <= side ? true : false;

    }

    public static boolean isSquareFittedCircle(double areaOfASquare, double areaOfACircle) {
        double diagonal = Math.sqrt(2) * Math.sqrt(areaOfASquare);
        double diameter = 2 * Math.sqrt(areaOfACircle / Circle.pi);
       /* if (diagonal <= diameter) {
            return true;
        } else {
            return false;
        }
*/
       return diagonal <= diameter ? true : false;

    }
}
