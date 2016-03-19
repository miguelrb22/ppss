/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss.estudiandostubs2;

/**
 *
 * @author ppss
 */
public class GestorLlamadasTestable extends GestorLlamadas {
    
    public Calendario c;
    
    @Override
    public Calendario getCalendario(){
        return c;
    }
    
    public void setCalendario(Calendario cs){
    
        this.c = cs;
    }
}
