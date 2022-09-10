package cubo;

import java.util.Scanner;

public class Cubo {

  
    public static void main(String[] args) {
        
        Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Digite 1 se você quer calcular a área do cubo ou digite 2 se você quer calcular o volume do cubo");
        int resposta = entrada.nextInt();
        
       if (resposta == 2){
            System.out.println("Digite a área do cubo");
            int area = entrada.nextInt();
            int valorfinal =(int) Math.pow(area,3);
            System.out.println("O volume do cubo é "+valorfinal);
            
        }
        else if (resposta == 1) {
            System.out.println("Digite 1 se você quer saber a área total do cubo, 2 para saber o área lateral do cubo ou 3 para saber a área da base do cubo");
            resposta = entrada.nextInt();
            
            if(resposta == 1) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areatotal = (int) (6*Math.pow (aresta,2));
                System.out.println("A área total do cubo é "+areatotal);
            }
            else if (resposta == 2) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int arealateral = (int) (4*Math.pow (aresta,2));
                System.out.println("A área lateral é "+arealateral);
            }
            else if (resposta == 3) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areabase = (int) Math.pow(aresta, 2);
                System.out.println("A área da base é "+areabase);
            }
        }
            else {
                System.out.println("1, 2 ou 3");
                System.out.println("Burro");
                System.out.println("Mais uma chance");
                System.out.println("Digite 1 se você quer saber a área total do cubo, 2 para saber o área lateral do cubo ou 3 para saber a área da base do cubo");
                int resposta2 = entrada.nextInt();
                
                if(resposta2 == 1) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areatotal = (int) (6*Math.pow (aresta,2));
                System.out.println("A área total do cubo é "+areatotal);
            }
            else if (resposta2 == 2) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int arealateral = (int) (4*Math.pow (aresta,2));
                System.out.println("A área lateral é "+arealateral);
            }
            else if (resposta2 == 3) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areabase = (int) Math.pow(aresta, 2);
                System.out.println("A área da base é "+areabase);
            }
                
                
                
                
     
        else {
            System.out.println("1 ou 2 seu tanço");
            System.out.println("Mais uma chance");
            System.out.println("Digite 1 se você quer calcular a área do cubo ou digite 2 se você quer calcular o volume do cubo, vê se não erra agora");
            int resposta3 = entrada.nextInt();
            
            if (resposta3 == 2){
            System.out.println("Digite a área do cubo");
            int area = entrada.nextInt();
            int valorfinal =(int) Math.pow(area,3);
            System.out.println("O volume do cubo é "+valorfinal);
            
        }
        else if (resposta3 == 1) {
            System.out.println("Digite 1 se você quer saber a área total do cubo, 2 para saber o área lateral do cubo ou 3 para saber a área da base do cubo");
            resposta = entrada.nextInt();
                }
            if(resposta3 == 1) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areatotal = (int) (6*Math.pow (aresta,2));
                System.out.println("A área total do cubo é "+areatotal);
            }
            else if (resposta3 == 2) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int arealateral = (int) (4*Math.pow (aresta,2));
                System.out.println("A área lateral é "+arealateral);
            }
            else if (resposta3 == 3) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areabase = (int) Math.pow(aresta, 2);
                System.out.println("A área da base é "+areabase);
            }
            else {
                System.out.println("1, 2 ou 3");
                System.out.println("Burro");
                System.out.println("Mais uma chance");
                System.out.println("Digite 1 se você quer saber a área total do cubo, 2 para saber o área lateral do cubo ou 3 para saber a área da base do cubo");
                int resposta4 = entrada.nextInt();
                
                if(resposta4 == 1) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areatotal = (int) (6*Math.pow (aresta,2));
                System.out.println("A área total do cubo é "+areatotal);
            }
            else if (resposta4 == 2) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int arealateral = (int) (4*Math.pow (aresta,2));
                System.out.println("A área lateral é "+arealateral);
            }
            else if (resposta4 == 3) {
                System.out.println("Digite o valor da aresta");
                int aresta = entrada.nextInt();
                int areabase = (int) Math.pow(aresta, 2);
                System.out.println("A área da base é "+areabase);
            }
                
        }
  
            }
        
      
    }
    }
                }
        
    
