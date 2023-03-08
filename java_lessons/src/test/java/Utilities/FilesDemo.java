package Utilities;

import java.io.*;

public class FilesDemo {
    public static void readFromFile()  throws IOException {
        String path = "src/test/resources/text";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String text = br.readLine();
        br.close();
        System.out.println(text);
    }

    public static void writeToFile()  throws IOException{
        FileWriter fw = new FileWriter("src/test/resources/text", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("\nTest2");
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        readFromFile();
        writeToFile();
    }
}
