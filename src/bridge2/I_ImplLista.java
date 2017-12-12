/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge2;

/**
 *
 * @author Juan
 */
public interface I_ImplLista {
    public void addItem(String item);
    public void remItem(String item);
    public int getCantidadDeItems();
    public String getItem(int index);
    public boolean soportaRepetidos();
}
