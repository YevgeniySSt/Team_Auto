package task_6;

import Utils.Reader;

import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException {

        System.out.println("Ввведите количество лампочек");
        int number = Integer.parseInt(Reader.readlineFromConsole());

        //creation of simple garland
        SimpleGarland simpleGarland = new SimpleGarland(number);

        //creation of color garland
        ColorGarland colorGarland = new ColorGarland(number);

        // выводим состояние
        simpleGarland.printCondition();
        colorGarland.printCondition();


    }
}
