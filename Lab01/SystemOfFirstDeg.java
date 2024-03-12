import javax.swing.JOptionPane;
public class SystemOfFirstDeg{
    public static void main(String[] args){
        String strA11, strA12, strB1, strA21, strA22, strB2;

        strA11 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a11",
        JOptionPane.INFORMATION_MESSAGE);

        strA12 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a12",
        JOptionPane.INFORMATION_MESSAGE);

        strB1 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the b1",
        JOptionPane.INFORMATION_MESSAGE);
        
        strA21 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a21",
        JOptionPane.INFORMATION_MESSAGE);

        strA22 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a22",
        JOptionPane.INFORMATION_MESSAGE);
        
        strB2 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the b2",
        JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);

        double d = a21*a12 - a22*a11;
        double d1 = a21*b1 - a11*b2;
        double d2 = a12*b1 - a12*b2;

        double sol1 = d1/d;
        double sol2 = d2/d;

        JOptionPane.showMessageDialog(null, "sol1 : " + sol1 + "\nsol2 : "+ sol2,
        "Solutions", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}