/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioLab;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese su Nombre");
         String Nombre = sc.nextLine();
         
         System.out.println("ingrese su Edad");
         int Edad = sc.nextInt();
         
         System.out.println("Ingrese su Sexo");
         String Sexo = sc.next();
         
         System.out.println("Ingrese su peso");
         float Peso = sc.nextFloat();
         
         System.out.println("Ingrese su Altura");
         float Altura = sc.nextFloat();
         
         Persona Persona1 = new Persona (Nombre, Edad, Sexo, Peso, Altura);
         
         Persona Persona2 = new Persona (Persona1.getNombre(), Persona1.getEdad(), Persona1.getSexo());
         
         Persona Persona3 = new Persona();
         Persona3.setNombre(Nombre);
         Persona3.setEdad(Edad);
         Persona3.setSexo(Sexo);
         Persona3.setPeso(Peso);
         Persona3.setAltura(Altura);
         
//         Imprimir datos

         System.out.println(Persona1.EsMayorDeEdad());
         System.out.println(Persona1.Persona1());
         
         System.out.println();
         
         System.out.println(Persona2.EsMayorDeEdad());
         System.out.println(Persona2.Persona2());
         
         System.out.println();
         
         System.out.println(Persona3.EsMayorDeEdad());
         System.err.println(Persona3.Persona1());
         
    }
    
  
   
    
    
    
    
    
    
    
}
