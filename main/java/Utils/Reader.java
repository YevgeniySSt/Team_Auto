package Utils;

import java.io.*;

public class Reader {

    public static String readlineFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


}
