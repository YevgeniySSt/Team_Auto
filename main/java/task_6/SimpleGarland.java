package task_6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SimpleGarland extends Garland {


    ArrayList<SimpleLightBulb> lightBulbs = new ArrayList<SimpleLightBulb>();

    public SimpleGarland (int number){
        for (int i = 0; i < number; i++) {
            this.lightBulbs.add(new SimpleLightBulb());
        }
        setCondition(lightBulbs);
    }

    @Override
    public void printCondition() {//Garland to print

        for (int i = 0; i < this.lightBulbs.size(); i++) {
            boolean status = this.lightBulbs.get(i).isOn;
            System.out.println("Лампочка " + (i + 1) + " - " + status);
        }
    }


}
