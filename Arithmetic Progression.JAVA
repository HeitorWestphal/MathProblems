package progressãoaritmética;

import java.util.Scanner;//importa o scanner 


public class ProgressãoAritmética {

   
    public static void main(String[] args) {
  
    Scanner entrada = new java.util.Scanner(System.in);
    System.out.println("Digite o primeiro termo");//vai pedir o primeiro termo "a1"
    float a1 = entrada.nextFloat();//float: pois pode ser um valor > 99 //o primeiro termo vai ser recebido pelo scanner na pergunta anterior
    System.out.println("Digite a razão");//vai pedir a razão "r"
    float r = entrada.nextFloat();//float: pois pode ser um número > 99 //a razão vai ser recebido pelo scanner na pergunta anterior 
    System.out.println("Digite a posição do enésimo termo");//vai pedir a posição do enésimo termo "n"
    float an = entrada.nextFloat();//o enésimo termo vai ser o valor recebido pelo scanner na pergunta anterior
    double valorfinal = (a1+(an-1)*r);//vai calcular o valor final "an"
    System.out.println("O valor total será de "+valorfinal);//vai exibir o valor final
       
    }
    
}

