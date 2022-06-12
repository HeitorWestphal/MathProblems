package jurossimples;

import java.util.Scanner;//importar o scanner

public class JurosSimples {

    
    public static void main(String[] args) {
      
        Scanner entrada = new java.util.Scanner(System.in); //vai trazer o scanner 
        System.out.println("Digite o capital"); //vai pedir para colocar o capital
        float capital = entrada.nextFloat();//float: pois pode ser um número > 99 //o valor do capital vai ser o valor recebido pelo scanner na pergunda da linha anterior 
        System.out.println("Digite a taxa dos juros");//float: pois pode ser um número > 99 //vai pedir a taxa dos juros
        float juros = entrada.nextFloat();//a taxa dos juros vai ser o valor recebido pelo scanner na pergunda da linha de cima
        System.out.println("Digite o tempo da aplicação em meses");//vai pedir para colocar o tempo da aplicação
        int meses = entrada.nextInt();//int: pois pode ser um n;umero < 99 //o tempo em meses vai ser o valor recebido pelo scanner na pergunta da linha anterior
        double valorfinal = ((capital * juros * meses)/100 + capital);//double: pois é basicammente um float com mais precisão, porem com 32 bits a mais de espaco //vai calcular os valores recebidos pelo scanner nas perguntas anteriores
        System.out.println("O valor total será de "+valorfinal);//vai exibir o valor final
        
        
    }
}
