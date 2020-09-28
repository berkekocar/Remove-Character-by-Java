import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveCharacter {
 
    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader("README.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter("MyFile.txt", true);
            Scanner sc = new Scanner(System.in);
            String line;
            
            System.out.println("Which character would you like to remove?");
            String ch = sc.nextLine();
 
            while ((line = bufferedReader.readLine()) != null) {
                
                writer.write(line=line.replace(ch,""));
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
