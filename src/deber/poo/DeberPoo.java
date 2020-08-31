package deber.poo;

import java.util.Scanner;

public class DeberPoo {

    public static void main(String[] args) {
        
        
        
        
        
        
        int opcion = 0;
      
          //opcion=Byte.parseByte(JOptionPane.showInputDialog(
          
            System.out.println(
                  "ELIJA LA OPERACION QUE VA A REALIZAR\n"
                + "1.SUMA\n" 
                + "2.RESTA\n" 
                + "3.DIVISIÓN\n");
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();    
                
        switch (opcion) {
            
            case 1:
                Scanner suma = new Scanner(System.in);
                System.out.println("Ingrese dos cantidades para sumar");
                Suma op = new Suma(suma.nextDouble(), suma.nextDouble());
                System.out.println("El resultado de la Suma es: " + op.suma());
                break;
                
            case 2:
                
                Scanner resta = new Scanner(System.in);
                System.out.println("Ingrese los valores para la resta");
                Resta res = new Resta(resta.nextDouble(), resta.nextDouble());
                System.out.println("El resultado de la resta es: " + res.restar());
                
                break;
            case 3:
                
                Scanner div = new Scanner(System.in);
                System.out.println("Ingrese dos valores para dividir");
                Division di = new Division(div.nextDouble(), div.nextDouble());
                System.out.println("El resultado de la division es: " + di.dividir());
                
                break;

            default:
                System.out.println("El caracter ingresado es incorrecto");
        }
       
    }
}


  
        
