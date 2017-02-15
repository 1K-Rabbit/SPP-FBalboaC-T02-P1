
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.fbalboac.t03;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class SPPFBalboaCT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        menu();
        
                
    }
    
    
    public static void menu() { 
    
     Scanner kb = new Scanner (System.in);
        double sue, he, pago;
        int cate;
        System.out.println("Calculadora de pagos.");
        
        System.out.println("//////////*****///////////");
        System.out.println("Categoria de trabajador:");
        cate = kb.nextInt();
        
        
        if ( cate >8) {   
        
        salir();
        
        
        }
        
        
        
        switch (cate){
        
            case 1:
                  System.out.println("Usted es un colaborador de categoria : " + cate);
        System.out.println("¿Cual es su sueldo base?");
        sue = kb.nextDouble();
            System.out.println("¿Cuantas horas extras trabajo este periodo?  ");  
        he = kb.nextDouble();
       pago = sue + (he*30);
                System.out.println("Su seuldo total es de: " +pago);
                break;
                
            case 2:
                
                  System.out.println("Usted es un colaborador de categoria : " + cate);
        System.out.println("¿Cual es su sueldo base?");
        sue = kb.nextDouble();
            System.out.println("¿Cuantas horas extras trabajo este periodo?  ");  
        he = kb.nextDouble();
       pago = sue + (he*38);
       System.out.println("Su seuldo total es de: " +pago);
       break;
    
            case 3:
                  System.out.println("Usted es un colaborador de categoria : " + cate);
        System.out.println("¿Cual es su sueldo base?");
        sue = kb.nextDouble();
            System.out.println("¿Cuantas horas extras trabajo este periodo?  ");  
        he = kb.nextDouble();
       pago = sue + (he*50);
    System.out.println("Su seuldo total es de: " +pago);
    break;
                
            case 4:
        
                  System.out.println("Usted es un colaborador de categoria : " + cate);
        System.out.println("¿Cual es su sueldo base?");
        sue = kb.nextDouble();
            System.out.println("¿Cuantas horas extras trabajo este periodo?  ");  
        he = kb.nextDouble();
       pago = sue + (he*70);
    System.out.println("Su sueldo total es de: " +pago);
    break;
                
            default: 
                regresar();
        
        
        }
        
        
    }
    
    public static void salir() {
        
        Scanner kb = new Scanner (System.in);
        System.out.println("No existe esa categoria, por favor introduzca una valida.");
        menu();
        
    
    }
    public static void regresar() {
Scanner kb = new Scanner (System.in);
            System.out.println("Gracias por usar.");
            menu();



}
    
    
}
