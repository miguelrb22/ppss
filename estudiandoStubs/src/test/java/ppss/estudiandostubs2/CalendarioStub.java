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
public class CalendarioStub extends Calendario {

    public int hora;

    @Override
    public int getHoraActual() {

        return hora;
    }

    public void setHora(int hr) {
        this.hora = hr;

    }

}
