import javax.swing.*;
import java.awt.*;

public class hej {  // Beräkning av summan 1+2+3+ .. + n
    public static void main(String[] arg) {
        String s = JOptionPane.showInputDialog("n?");
        int n = Integer.parseInt(s);
        int summa = 0;
        int k=1;
        while (k <= n) {
            summa = summa + k;
            k = k + 1;
        }
        JOptionPane.showMessageDialog(null, "summan blir " + summa);
    }
}