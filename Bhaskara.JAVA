package bhaskara;

import javax.swing.JOptionPane;


public class Bhaskara {

    public static void main(String[] args) {
        
        int a, b, c;
        double delta;
        double valorfinalp, valorfinaln;
        String resposta1 = JOptionPane.showInputDialog("Você tem o delta 's/n'");
        String sim = "s";
        String não = "n";
       
        if (resposta1.equals(sim)){
        delta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do delta:"));
         
        if (delta >= 0){
             
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        valorfinalp = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        valorfinaln = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
        JOptionPane.showMessageDialog(null,"o valor final da bhaskara positivo será de: "+valorfinalp+", já o valor final negativo será de: "+valorfinaln);
         }
        
         else {
         
         JOptionPane.showMessageDialog(null,"Delta não possui raiz");
    }
        }
       else if (resposta1.equals(não)) {
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));        
       c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C:"));
       delta = (b * b) + (-4 * (a * c));
       if (delta >= 0){
       valorfinalp = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
       valorfinaln = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
       JOptionPane.showMessageDialog(null,"O valor de delta será de "+delta);
       JOptionPane.showMessageDialog(null,"o valor final da bhaskara positivo será de: "+valorfinalp+", já o valor final negativo será de: "+valorfinaln);
       }   
       else {
       JOptionPane.showMessageDialog(null,"Delta nào possui raiz");
       }
       }
       //não sei se tá tudo certo. Ainda nào fiz os calculos no papel. Mas em tese está certo.
}
}    