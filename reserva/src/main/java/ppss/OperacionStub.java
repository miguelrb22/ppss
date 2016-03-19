/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

import ppss.excepciones.IsbnInvalidoException;
import ppss.excepciones.JDBCException;
import ppss.excepciones.SocioInvalidoException;

/**
 *
 * @author ppss
 */
public class OperacionStub implements IOperacionBO {

    public boolean bd = true;

    @Override
    public void operacionReserva(String socio, String isbn) throws IsbnInvalidoException, JDBCException, SocioInvalidoException {

        if (bd == true) {

            if (socio.equals("Luis")) {

                if (isbn.equals("33333")) {

                    throw new IsbnInvalidoException();
                }

            } else if (socio.equals("Pepe")) {

                throw new SocioInvalidoException();

            }
        } else {
            throw new JDBCException();
        }
    }

    public void setBD(boolean access) {
        this.bd = access;
    }

}
