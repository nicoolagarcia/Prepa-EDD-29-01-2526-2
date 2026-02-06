/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa29012526.pkg2;

import EDD.Lista;
import EDD.Nodo;
import EDD.Solucion;

/**
 *
 * @author Nicola
 */
public class Prepa290125262 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista milista1 = new Lista();
        
        milista1.insertarFinal(0);
        milista1.insertarFinal(1);
        milista1.insertarFinal(2);
        milista1.insertarFinal(3);
        
        Lista milista2 = new Lista();
        
        milista2.insertarFinal(0);
        milista2.insertarFinal(1);
        
        milista2.pLast.pnext= milista1.pLast;
        
        milista1.insertarFinal(4);
        milista1.insertarFinal(5);
        
        
        
        milista1.Recorrer();
        milista2.Recorrer();
        
        Solucion misolucion = new Solucion();
        
        Nodo respuesta = misolucion.interseccion(milista1, milista2);
        
        System.out.println(respuesta.data);
        
        
    }
    
}
