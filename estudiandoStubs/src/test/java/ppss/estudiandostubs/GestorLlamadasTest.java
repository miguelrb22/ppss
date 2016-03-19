/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss.estudiandostubs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ppss
 */
public class GestorLlamadasTest {
    
   
    public int minutos;
    public int resultado_esperado;
    public GestorLlamadasTestable glt = new GestorLlamadasTestable();

    @Test
    public void testCalculaConsumo() {
        
        glt.setHora(22);
        this.minutos = 10;
        
        assertEquals(105,glt.calculaConsumo(minutos),0);
    }
    
}
