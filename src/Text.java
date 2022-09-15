import java.util.ArrayList;
import java.util.Random;
import java.io.*;

import static java.lang.System.out;

public class Text {
    public static void main(String[] args) throws IOException {

        File tycko = new File("Tycko.txt");

        BufferedReader reader = null;
        BufferedWriter writer = null;
        ArrayList list = new ArrayList();

        DataInputStream input = new DataInputStream (new BufferedInputStream(new FileInputStream("myData.dat")));
        DataOutputStream output = new DataOutputStream (new BufferedOutputStream(new FileOutputStream("myData.dat")));

        reader = new BufferedReader(new FileReader(tycko));
        FileWriter fw = new FileWriter(tycko);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);

        DataInputStream inFile = input;
        int number = Integer.parseInt(inFile.readLine());
        DataOutput outFile = output;
        outFile.writeInt(number);

        input.readInt();
        output.writeInt(new Integer(number));

        int y;
        int x;
        Random r = new Random();

        for (int i = 0 ; i < 1920*1080 ; i++) {
            x = r.nextInt(0xffffff);
            y = r.nextInt(0x16775215);
            out.println(x^y);
            try {
                x = Integer.parseInt(String.valueOf(new PrintWriter((File) outFile)));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
