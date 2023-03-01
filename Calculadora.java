package calculadora;

/**
 *
 * @author jhonney
 */
import java.util.Scanner;
public class Calculadora{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor1, valor2, resultado;
        int op;
        Scanner entrada = new Scanner(System.in);
        
             
          do {
         
         
           System.out.println("######SELECIONE UMA OPERACAO:######");
           System.out.println("[1]soma");
           System.out.println("[2]subtracao");
           System.out.println("[3]multiplicacao");
           System.out.println("[4]divisao");
           System.out.println("[5]elevar o primeiro numero ao quadrado");
           System.out.println("[0]encerrar");
         
           System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>DIGITAR OPCAO:");
           op = (int)entrada.nextInt();
           
           
          if(op == 0) {
               System.out.println("operacao encerrada!!!");
               System.exit(0);
           }
          
               
           switch (op) {
             case 1 ->  {
                 System.out.println("informe o numero1:");
                 valor1 = entrada.nextDouble();
                 System.out.println("informe o numero2:");
                 valor2 = entrada.nextDouble();
                 resultado = valor1+valor2;
                 System.out.println("A soma e:"+resultado);
                 break;
            }
         
             case 2 ->  {
                 System.out.println("informe o numero1:");
                 valor1 = entrada.nextDouble();
                 System.out.println("informe o numero2:");
                 valor2 = entrada.nextDouble();
                 resultado = valor1-valor2;
                 System.out.println("A subtracao e:"+resultado);
                 break;
             }
         
             case 3 ->  {
                 System.out.println("informe o numero1:");
                 valor1 = entrada.nextDouble();
                 System.out.println("informe o numero2:");
                 valor2 = entrada.nextDouble();
                 resultado = valor1*valor2;
                 System.out.println("A multiplicacao e:"+resultado);
                 break;
             }
         
             case 4 -> {
                 System.out.println("informe o numero1:");
                 valor1 = entrada.nextDouble();
                 System.out.println("informe o numero2:");
                 valor2 = entrada.nextDouble();
                 if(valor1<valor2){
                     System.out.println("Impossivel de realizar o calculo");
                     break;
                 }
                 else{
                     resultado = valor1/valor2;
                     System.out.println("A divisao e:"+resultado);
                     break;
                 }
             }
                 
             case 5 ->  {
                 System.out.println("informe o numero1:");
                 valor1 = entrada.nextDouble();
                 resultado = valor1*valor1;
                 System.out.println("O valor elevado ao quadrado e:"+resultado);
                 break;
                 
             }    
            
             default -> {
                 System.out.println("operacao invalida!!!");
                 break;    
             }
           }
          }
           while (op != 0);}
    
}
         
     
         
          
        
        // TODO code application logic here
    
    

