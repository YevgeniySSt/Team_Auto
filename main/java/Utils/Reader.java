package Utils;

import java.io.*;

public class Reader {

    public static String readlineFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        return line;
    }


}
