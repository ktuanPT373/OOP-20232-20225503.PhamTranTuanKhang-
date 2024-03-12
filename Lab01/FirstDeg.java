import javax.swing.JOptionPane;

public class FirstDeg {

    public static void main(String[] args){
        String strA, strB;

        strA = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a",
        JOptionPane.INFORMATION_MESSAGE);

        strB = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the b",
        JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        double sol = -b/a;

        JOptionPane.showMessageDialog(null, "sol : " + sol,
        "Solutions", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
