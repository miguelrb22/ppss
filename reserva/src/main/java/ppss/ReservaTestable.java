/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

/**
 *
 * @author ppss
 */
public class ReservaTestable extends Reserva{
    
    @Override
    public boolean compruebaPermisos(String login, String password, Usuario tipoUsu) {
        
        return login.equals("ppss") && password.equals("ppss") && tipoUsu.equals(Usuario.BIBLIOTECARIO);
}
    
}
