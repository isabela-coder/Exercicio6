
package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    
    public static void main(String[] args) {
        
      
 float base, altura, area;
        Scanner entrada;

entrada = new Scanner(System.in); 

System.out.println("Digite a base do Triângulo:");

base = entrada.nextFloat();

System.out.println("Digite a altura do Triângulo:");

altura = entrada.nextFloat();

area = (base * altura )/2;
  
  System.out.println("Área do Triângulo = "+ area);
 }
}
      
        
        
    
    


