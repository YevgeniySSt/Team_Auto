package task_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SimpleGarland extends Garland {
    ArrayList<SimpleLightBulb> simpleLightBulbs = new ArrayList<SimpleLightBulb>();

    @Override
    public void printCondition(int number) {
        DateFormat dateFormat = new SimpleDateFormat("mm");
        Date date = new Date();
        int minute = Integer.parseInt(dateFormat.format(date));

        if (minute % 2 == 0) {
            for (int i = 0; i < number; i = i + 2) {
                this.simpleLightBulbs.get(i).isOn = true;
            }
        } else {
            for (int i = 1; i < number; i = i + 2) {
                this.simpleLightBulbs.get(i).isOn = true;
            }
        }
        for (int i = 0; i < number; i++) {
            boolean status = this.simpleLightBulbs.get(i).isOn;
            System.out.println("Лампочка " + (i + 1) + " - " + status);
        }
    }


}
