import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Contact> tDirectory=new HashMap<>();
        String line;
        String[] piece;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/thomasszucs/IdeaProjects/TelephoneDirectory/src/telefonkonyv.csv"))) {

            while ((line= br.readLine())!=null) {
                piece = line.split(";");

                tDirectory.put(piece[0],new Contact(piece[0],piece[1],piece[2],piece[3],piece[4],piece[5],piece[6],piece[7]));
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Names in the phone book: ");
        for (String name : tDirectory.keySet()) {
            System.out.println(name);
        }
        System.out.println();
        System.out.print("Whose data are you asking for? ");
        String name= sc.nextLine();
        System.out.println(tDirectory.get(name));
    }
}