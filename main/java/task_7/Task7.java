package task_7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Country> map = new HashMap<Integer, Country>();

        File file = new File("C://Users//YevgeniyS//IdeaProjects//Team_automation//src//main//java//task_7//EuropeCountries.txt");
        FileInputStream fr = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fr));
        String line = reader.readLine();
        int i = 1;
        while (line != null) {
            map.put(i, new Country(line));
            line = reader.readLine();
            i++;
        }

        map.put(i, new Country("Ukraine"));

        for (Map.Entry<Integer, Country> set : map.entrySet()) {
            String s = set.getValue().name;
            if ((s.equals("Hungary")) || (s.equals("Denmark"))){
                map.get(set.getKey()).isTelenorSupported = true;
            }

        }

        map.get(13).isTelenorSupported = true;//find by name
        map.get(7).isTelenorSupported = true;

        for (Map.Entry<Integer, Country> set : map.entrySet()) {
            boolean s = set.getValue().isTelenorSupported;
            if (!s) {
                System.out.println(set.getKey() + " " + set.getValue().name);
            }
        }

    }
}
