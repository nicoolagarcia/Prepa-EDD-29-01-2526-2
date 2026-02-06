/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Lista {

    int size;
    Nodo pFirst;
    public Nodo pLast;

    public Lista() {
        this.size = 0;
        this.pFirst = null;
        this.pLast = null;
    }

    public boolean isEmpty() {
        return this.pFirst == null;
    }

    public void Vaciar() {
        this.size = 0;
        this.pFirst = null;
        this.pLast = null;
    }

    public void insertarFinal(int val) {
        Nodo nuevo = new Nodo(val);
        if (this.isEmpty()) {
            this.pFirst = nuevo;
            this.pLast = nuevo;
        } else {
            this.pLast.pnext = nuevo;
            this.pLast = this.pLast.pnext;
        }
        size++;
    }

    public void insertarInicio(int val) {
        Nodo nuevo = new Nodo(val);
        if (this.isEmpty()) {
            this.pFirst = nuevo;
            this.pLast = nuevo;
        } else {
            nuevo.pnext = this.pFirst;
            this.pFirst = nuevo;
        }
        size++;
    }

    public void eliminarInicio() {
        if (!this.isEmpty()) {
            if (this.pFirst == this.pLast) {
                this.Vaciar();
            } else {
                Nodo aux = this.pFirst;
                this.pFirst = this.pFirst.pnext;
                aux.pnext = null;
                size--;
            }
        } else {
            System.out.println("La lista esta vacia");
        }

    }

    public void elimnarFinal() {
        if (!this.isEmpty()) {
            if (this.pFirst == this.pLast) {
                this.Vaciar();
            } else {
                Nodo aux = this.pFirst;

                while (aux.pnext != this.pLast) {
                    aux = aux.pnext;
                }
                aux.pnext = null;
                this.pLast = aux;
            }

        }

    }
    
        public void Recorrer(){
        if (this.isEmpty()) {
            System.out.println("La lista esta vacio");
        } else{
        Nodo aux = this.pFirst;
            while (aux!= null) {
                System.out.println(aux.data);
                aux = aux.pnext;
            }
        }
    
    }

}
