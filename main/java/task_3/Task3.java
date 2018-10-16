package task_3;

import Utils.Reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        List<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Введите числа от 20 до 40, чтобы закончить ввод введите run");
        String lineFromConsole = Reader.readlineFromConsole();

        while (true) {
            if (lineFromConsole.equals("run")) {
                if (arrayList.size() < 10) {
                    System.out.println("введите еще " + (10 - arrayList.size()) + " чисел");
                    lineFromConsole = Reader.readlineFromConsole();
                } else break;
            }
            int a = Integer.parseInt(lineFromConsole);
            arrayList.add(a);
            lineFromConsole = Reader.readlineFromConsole();
        }

        int sum = 0;
        for (Integer integer : arrayList) {
            if (integer % 3 == 0 && integer % 5 != 0) {
                sum += integer;
            }
        }
        System.out.println("Сумма чисел которые делятся на 3, но не делятся на 5: " + sum);


    }
}
