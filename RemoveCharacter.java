import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveCharacter {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("README.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter("MyFile.txt", true);

            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                
                writer.write(line=line.replace("*",""));
                writer.write("\r\n");

                System.out.println(line);
            }
            reader.close();
            writer.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
