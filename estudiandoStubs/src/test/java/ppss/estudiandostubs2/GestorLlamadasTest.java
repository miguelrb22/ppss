/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss.estudiandostubs2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ppss
 */
public class GestorLlamadasTest {
    
    
    int minutos;
    int resultado_esperado;
   
    @Test
    public void testCalculaConsumo() {
        
        minutos = 10;
        resultado_esperado = 208;
        CalendarioStub cs = new CalendarioStub();
        cs.setHora(15);
        GestorLlamadasTestable glt = new GestorLlamadasTestable();
        glt.setCalendario(cs);
        
        assertEquals(resultado_esperado, glt.calculaConsumo(minutos),0);
        
    }
    
}
