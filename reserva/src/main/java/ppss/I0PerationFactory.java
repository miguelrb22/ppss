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
public class I0PerationFactory {
    
    public static IOperacionBO io = null;
    
    public static IOperacionBO create(){
    
        if(io == null){ return new Operacion();}
        else return io;
   
    }
    
    public void setIOPeracionBO(IOperacionBO io){
        I0PerationFactory.io = io;
    }
       
}
