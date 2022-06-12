package juroscomposto;

import java.util.Scanner;//importar o scanner
import java.lang.Math;//importar Lang.Math


public class JurosComposto {
          
    public static void main(String[] args) {
        
        Scanner entrada = new java.util.Scanner(System.in);//trazer o scanner
        System.out.println("Digite o capital aplicado");//vai pedir o capital
        float capital = entrada.nextFloat();//float: pois é um número > 99 //o capital vai ser o valor recebido pelo scanner na pergunta anterior
        System.out.println("Digite a taxa de juros composta");//vai pedir a taxa de juros composta
        float juros = entrada.nextFloat();//float: pois é um número > 99 ou com vírgula //o juros vai ser o valor recebido pelo scanner na pergunta anterior 
        System.out.println("Digite o tempo da aplicação em meses");//vai pedir o tempo em meses 
        int meses = entrada.nextInt();//int: pois é um número < 99 //os meses vão ser o valor recebido pelo scanner na pergunta anterior
        double montante = capital *Math.pow((1 + juros/100),meses);//calculo com os valores recebidos pelo scanner para calcular o montante //NÃO TÄ PRONTO
        System.out.println("O montante será de "+montante);//vai mostrar o montante
    }
    
    }