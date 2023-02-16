package my.example;

import java.io.*;

public class Exeptions {

    public void wrongReader1() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Solve this problem");
        }
    }

    public void wrongReader2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
    }

    public String wrongReader3(String path) throws IOException {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();

        }
    }
}

