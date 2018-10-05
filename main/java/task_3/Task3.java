package task_3;

import Utils.Reader;
import java.io.IOException;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Введите числа от 20 до 40, чтобы закончить ввод введите run");
        String s = Reader.readlineFromConsole();

        while (!s.equals("run")){
            int a = Integer.parseInt(s);
            arrayList.add(a);
            s = Reader.readlineFromConsole();
        }

        int sum = 0;
        for (Integer integer : arrayList) {
            if (integer % 3 == 0 && integer % 5 !=0){
                sum += integer;
            }
        }
        System.out.println("Сумма чисел которые делятся на 3, но не делятся на 5: " + sum);


    }
}
