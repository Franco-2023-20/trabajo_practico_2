package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       List<Producto> prod = new ArrayList<Producto>();
       int opcion = 0;
       while (opcion != 4) {
    	   
       System.out.println("MENU DE OPCIONES");
       System.out.println("1-Crear Producto");
       System.out.println("2-Mostrar Procutos");
       System.out.println("3-Modificar Productos");
       System.out.println("4-SALIR");
       opcion=sc.nextInt();
       switch(opcion)
       {
       case 1:  System.out.println("Crear producto");
       
    	   break;
       case 2:  System.out.println("Mostrar Productos");
             
    	   break;
       case 3:  System.out.println("Modificar Porducto");
    	   break;
       case 4: System.out.println("SALIENDO..");
    	   break;
       default:System.out.println("No es ninguna opcion valida");
    	   break;
       }
       
       
       
       }    
	}

}
