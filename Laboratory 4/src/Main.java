import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Eliodor\\Desktop\\test.txt");
        String st;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            st = sc.nextLine();
            System.out.println(st);
            CheckParantheses.checkParantheses(st);
            }
    }
}
