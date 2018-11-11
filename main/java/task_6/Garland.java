package task_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Garland {

    public abstract void printCondition();

    public void setCondition(ArrayList<? extends SimpleLightBulb> lightBulbs){
        DateFormat dateFormat = new SimpleDateFormat("mm");
        Date date = new Date();
        int minute = Integer.parseInt(dateFormat.format(date));

        if (minute % 2 == 0) {
            for (int i = 0; i < lightBulbs.size(); i = i + 2) {
                lightBulbs.get(i).isOn = true;
            }
        } else {
            for (int i = 1; i < lightBulbs.size(); i = i + 2) {
                lightBulbs.get(i).isOn = true;
            }
        }

    }


}
