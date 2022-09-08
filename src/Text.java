import jdk.nashorn.internal.scripts.JO;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
import array.util.list;

public class Text {
    public static void main(String[] args) throws IOException {
        String Tycko = "Tycko.txt";
        FileWriter fw = new FileWriter(Tycko);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);
        FileReader fr = new FileReader(Tycko);
        BufferedReader inFil = new BufferedReader(fr);

        Scanner input = new Scanner(new File("Tycko.txt"));

    }

}
