/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class Nodo {
    public int data;
    public Nodo pnext;

    public Nodo(int data) {
        this.data = data;
        this.pnext = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getPnext() {
        return pnext;
    }

    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }

    public Nodo(int data, Nodo pnext) {
        this.data = data;
        this.pnext = pnext;
    }
    

}
