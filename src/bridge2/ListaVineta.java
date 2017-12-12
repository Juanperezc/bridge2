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
public class ListaVineta extends ListaBase{
    
    private char tipoVineta;
    public void setTipoItem(char nuevoTipo){
        if (nuevoTipo > ' '){
            tipoVineta = nuevoTipo;
            
        }else{
            tipoVineta = '+';
        }
    }
    @Override
    public String obtenerItem(int index){
        return tipoVineta + " " + super.obtenerItem(index);
    }
}
