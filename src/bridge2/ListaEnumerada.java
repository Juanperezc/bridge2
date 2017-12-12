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
public class ListaEnumerada extends ListaBase{
    
    @Override
    public String obtenerItem(int index){
        return (index + 1) + ". " + super.obtenerItem(index);
    }
}
