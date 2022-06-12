package progressão.geométrica;

import java.util.Scanner;//importa o scanner 
import java.lang.Math;//importa o Lang.Math

public class ProgressãoGeométrica {

    public static void main(String[] args) {
        
      Scanner entrada = new java.util.Scanner(System.in);//traz o scanner
      System.out.println("Digite o primeiro termo da progressão geométrica");//pergunta o a1
      float a1 = entrada.nextFloat();//o a1 vai ser o valor recebido pelo scanner na pergunta anterior
      System.out.println("Digite o quociente");//pergunta o q
      float q = entrada.nextFloat();//o q vai ser o valor recebido pelo scanner na pergunta anterior
      System.out.println("Digite qual a posição do enésimo termo");//pergunta o an
      float an = entrada.nextFloat();//o an vai ser o valor recebido pelo scanner na pergunta anterior
      double valorfinal = a1 * Math.pow( q, (an - 1) );//vai calcular o an
      System.out.println("O valor final será de "+valorfinal);//vai mostrar o valor final
    }
    
}
