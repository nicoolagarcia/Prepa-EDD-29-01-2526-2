/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Solucion {

    public  Nodo interseccion(Lista l1, Lista l2) {
        if (l1.isEmpty() || l2.isEmpty()) {
            return new Nodo(-1);
        }

        Nodo aux1 = l1.pFirst;
        Nodo aux2 = l2.pFirst;

        while (aux1 != aux2) {
            if (aux1 == null) {
                aux1 = l2.pFirst;
            } else if (aux2 == null) {
                aux2 = l1.pFirst;
            }

            aux1 = aux1.pnext;
            aux2 = aux2.pnext;
        }

        return aux1;
    }
}
