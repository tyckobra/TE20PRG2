import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Psykolog {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Hej och välkommen till din digitala psykolog!");

        JOptionPane.showInputDialog("Vad vill du prata om idag? Skola, Jobb eller dina Hobbys?");

        String skola = o.nextLine();

        System.out.println("Det jag gillar med skolan är" + skola);
        }
}
