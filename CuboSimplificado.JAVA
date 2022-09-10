        Scanner entrada =new java.util.Scanner(System.in);
        
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
