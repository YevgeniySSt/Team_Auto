package task_6;

import Utils.Reader;

import java.io.IOException;

public class Task6 {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Ввведите количество лампочек");
        int number = Integer.parseInt(Reader.readlineFromConsole());

        //creation of simple garland
        SimpleGarland simpleGarland = new SimpleGarland();
        for (int i = 0; i < number; i++) {
            simpleGarland.simpleLightBulbs.add(new SimpleLightBulb());
        }
        //creation of color garland
        ColorGarland colorGarland = new ColorGarland();
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                colorGarland.colorLightBulbs.add(new ColorLightBulb(Color.BLUE));
            } else if (i % 4 > 0 && i % 4 <= 1) {
                colorGarland.colorLightBulbs.add(new ColorLightBulb(Color.RED));
            } else if (i % 4 > 1 && i % 4 <= 2) {
                colorGarland.colorLightBulbs.add(new ColorLightBulb(Color.YELLOW));
            } else if (i % 4 > 2 && i % 4 <= 3) {
                colorGarland.colorLightBulbs.add(new ColorLightBulb(Color.GREEN));
            } else if (i % 4 > 3 && i % 4 <= 4) {
                colorGarland.colorLightBulbs.add(new ColorLightBulb(Color.BLUE));
            }
        }

        // выводим состояние
        simpleGarland.printCondition(number);
        colorGarland.printCondition(number);


    }
}
