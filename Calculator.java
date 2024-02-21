import java.util.Scanner;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt_alpha, txt_m, txt_V, txt_t, str;
        final double g = 9.8;
        txt_alpha = showInputDialog("Введите угол: ");
        double alpha = Double.parseDouble(txt_alpha);
        txt_m = showInputDialog("Введите массу: ");
        double m = Double.parseDouble(txt_m);
        double gamma = 0.1;
        txt_V = showInputDialog("Введите скорость: ");
        double V = Double.parseDouble(txt_V);
        txt_t = showInputDialog("Введите время: ");
        double t = Double.parseDouble(txt_t);
        double x, y;
        alpha /= 180/PI;
        x = V*m*cos(alpha)/gamma*(1-exp(-gamma*t/m));
        y = (V*sin(alpha)*gamma+m*g)/gamma/gamma*(1-exp(-gamma*t/m))-m*g*t/gamma;
        str = "Угол: " + alpha + "\n";
        str += "Mасса: " + m + "\n";
        str += "Скорость: " + V + "\n";
        str += "Время: " + t + "\n";
        str += "Координаты: " + x + " ";
        str += y;
        showMessageDialog(null, str);
    }
}