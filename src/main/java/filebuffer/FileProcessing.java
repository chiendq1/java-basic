package filebuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/filebuffer/text.txt"));
            // read and print lines in file
            for(String line = br.readLine(); line != null; line = br.readLine()) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            // close file if file exist anyway
            try {
                br.close();
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
