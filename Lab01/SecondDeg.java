import javax.swing.JOptionPane;

public class SecondDeg {

    public static void main(String[] args){
        String strA, strB, strC;

        strA = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the a",
        JOptionPane.INFORMATION_MESSAGE);

        strB = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the b",
        JOptionPane.INFORMATION_MESSAGE);
        
        strC = JOptionPane.showInputDialog(null,
        "Please input the first number:", "Input the c",
        JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        if (a != 0) {
            double delta = b*b-4*a*c;
            if (delta > 0){
                double sol1 = (-b-Math.sqrt(delta))/(2*a);
                double sol2 = (-b+Math.sqrt(delta))/(2*a);

                JOptionPane.showMessageDialog(null, "sol1 : " + sol1 + "\nsol2: " + sol2,
                "Solutions", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }
            else if (delta == 0){
                double sol = (-b)/(2*a);
                JOptionPane.showMessageDialog(null, "One sol found : " + sol,
                "Solutions", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }
            else {
                String strDelta = String.valueOf(Math.sqrt(Math.abs(delta)));
                String mau = String.valueOf(2*a);
                String sol1 = "(-"+strB+"-"+strDelta+"*i"+")/" + mau;
                String sol2 = "(-"+strB+"+"+strDelta+"*i"+")/" + mau;
                JOptionPane.showMessageDialog(null, "sol1 : " + sol1 + "\nsol2 : "+ sol2,
                "Solutions", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }
        }
        else {
            if (b != 0) {
                double sol = -c/b;
                JOptionPane.showMessageDialog(null, "sol : " + sol,
                "Solutions", JOptionPane.INFORMATION_MESSAGE);
    
                System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null, "No Solution Found!",
                "Solutions", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}
