/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss.estudiandostubs;

/**
 *
 * @author ppss
 */
public class GestorLlamadasTestable extends GestorLlamadas {

    public int hora;

    @Override
    public int getHoraActual() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
