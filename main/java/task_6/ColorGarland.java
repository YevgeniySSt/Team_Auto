package task_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ColorGarland extends Garland {
    ArrayList<ColorLightBulb> lightBulbs = new ArrayList<ColorLightBulb>();

    public ColorGarland(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                this.lightBulbs.add(new ColorLightBulb(Color.BLUE));
            } else if (i % 4 > 0 && i % 4 <= 1) {
                this.lightBulbs.add(new ColorLightBulb(Color.RED));
            } else if (i % 4 > 1 && i % 4 <= 2) {
                this.lightBulbs.add(new ColorLightBulb(Color.YELLOW));
            } else if (i % 4 > 2 && i % 4 <= 3) {
                this.lightBulbs.add(new ColorLightBulb(Color.GREEN));
            } else if (i % 4 > 3 && i % 4 <= 4) {
                this.lightBulbs.add(new ColorLightBulb(Color.BLUE));
            }
        }
        setCondition(lightBulbs);
    }

    @Override
    public void printCondition() {
        for (int i = 0; i < lightBulbs.size(); i++) {
            boolean status = lightBulbs.get(i).isOn;
            System.out.println(lightBulbs.get(i).color + " лампочка " + (i + 1) + " - " + status);
        }
    }
}
