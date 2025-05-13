

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    Double salario; //variável do tipo float
    Double descontoSindicato;
    Double descontoIR;
    Double salarioLiquido;
    Double salarioSindicato;
    
    System.out.println("Digite o valor do seu salário bruto no seguinte formato: xxxx.xx");
    Scanner entrada = new Scanner (System.in); //abrindo caixa de texto para usuário digitar 
    
    salario = entrada.nextDouble();
    
    //descontoSindicato é de 3% e independe do salario
    descontoSindicato = salario * 0.03;
    salarioSindicato = salario - descontoSindicato; 
    
    // Cálculo de descontos do IR dependente do salario
    if(salario <= 1200.00){
        System.out.println("IR isento, com desconto do sindicato, seu salario líquido é: R$" + salario);
    
    // IR de 5%    
    }else if(salario >= 1200.01 && salario <= 2500.00){
        descontoIR = salario*0.05;
        salarioLiquido = salarioSindicato - descontoIR;
        System.out.println("IR 5%, com desconto do sindicato, seu salario líquido é: R$" + salarioLiquido);
        
        // IR de 10%
    }else if(salario > 2500.01 && salario <=3500.00){
        descontoIR = salario*0.1;
        salarioLiquido = salarioSindicato - descontoIR;
        System.out.println("IR 10%, com desconto do sindicato, seu salario líquido é: R$" + salarioLiquido);
        
        // IR de 20% 
    }else if(salario> 3500.01 && salario <= 5500.00){
     descontoIR = salario*0.2;
        salarioLiquido = salarioSindicato - descontoIR;
        System.out.println("IR 20%, com desconto do sindicato, seu salario líquido é: R$" + salarioLiquido);
        
    }else {
        System.out.println("Não há dados de IR para calcular seu salário líquido");
    }
    
  }
}
