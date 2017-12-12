/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge2;

import java.util.Scanner;

/**
 *
 * @author Juan
 */

public class Bridge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        I_ImplLista implementacion;
        
        System.out.println("\n Digite el tipo de lista que desea: \n");
        System.out.println("1 = Items Repetidos, 2 = Items Unicos \n");
                opcion = entrada.nextInt();
        switch (opcion) {
            case 1:{
                System.out.println("Creando lista. Permite Repetidos \n");
                implementacion = new ImpListaRepetidos();
                break;
            }
            case 2:{
                System.out.println("Creando lista. Item unicos \n");
                implementacion = new ImpListaUnicos();
                break;
            }
            default:
                System.out.println("Error seleccione una opcion valida");
                return;
            
        }
        System.out.println("Creando presentacion Base . . . . .");
        ListaBase listaBase = new ListaBase();
        listaBase.setImplementacion(implementacion);
        System.out.println("Lista Base Creada!! \n ");
        System.out.println("Por favor digite 5 elementos de la lista: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + " : ");
            listaBase.agregarItem(entrada.next());
            
        }
        System.out.println();
        System.out.println("Creando Una lista enumerada . . . . .");
        ListaEnumerada listaenumerda = new ListaEnumerada();
        listaenumerda.setImplementacion(implementacion);
        System.out.println();
        System.out.println("Creando Una lista con viñetas . . . . .");
        ListaVineta listavineta = new ListaVineta();
        listavineta.setImplementacion(implementacion);
        System.out.println("Digite un simbolo para la viñeta");
        listavineta.setTipoItem((char) entrada.next().charAt(0));
        System.out.println();
        System.out.println("Imprimiendo las diferentes listas . . . . .");
        System.out.println("Lista Base:");
        for (int i = 0; i < listaBase.cuentaItems(); i++) {
            System.out.println("\t" + listaBase.obtenerItem(i));
        }
        System.out.println("Lista Enumerada:");
        for (int i = 0; i < listaBase.cuentaItems(); i++) {
            System.out.println("\t" + listaenumerda.obtenerItem(i));
        }
        System.out.println("Lista con Vinetas:");
        for (int i = 0; i < listaBase.cuentaItems(); i++) {
            System.out.println("\t" + listavineta.obtenerItem(i));
        }
        
    }
    
}
