package task_3;

import Utils.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3_AnotherImplementation {
    public static void main(String[] args) throws IOException {
        List<Integer> listOfNumbers = new ArrayList<Integer>();

        System.out.println("Введите диапазон натуральных чисел от 20 до 40");
        int leftBorder = Integer.parseInt(Reader.readlineFromConsole());
        int rightBorder = Integer.parseInt(Reader.readlineFromConsole());

        while (rightBorder - leftBorder < 10) {
            System.out.println("Диапазон должен вмещать не меньше 10 чисел, введите правую границу");
            rightBorder = Integer.parseInt(Reader.readlineFromConsole());

        }

        for (int i = leftBorder; i <= rightBorder; i++) {
            listOfNumbers.add(i);
        }

        int sum = 0;
        for (Integer integer : listOfNumbers) {
            if (integer % 3 == 0 && integer % 5 != 0) {
                sum += integer;
            }
        }
        System.out.println("Сумма чисел которые делятся на 3, но не делятся на 5: " + sum);


    }
}
