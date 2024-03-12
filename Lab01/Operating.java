import javax.swing.JOptionPane;
public class Operating{
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the second number",
        JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sumation = num1 + num2;
        double diff = num1 - num2;

        double prod = num1 * num2;
        double quotient = num1 / num2;

        JOptionPane.showMessageDialog(null,"Sum : " + sumation + "\nDiff : " + diff + "\nProd : " + prod + "\nQuot : " + quotient,"Operating results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}