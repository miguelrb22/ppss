/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ppss
 */
@RunWith(Parameterized.class)
public class MatriculaParametrizadoTest {

    @Parameterized.Parameters(name = "")
     

    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
            {20,false,true,2000f},
            {70,false,true, 250f}
        });
    }
    
    public int edad;
    public boolean familia_numerosa;
    public boolean repetidor;
    public float resultado_esperado;
    public Matricula matricula = new Matricula();
    
    public MatriculaParametrizadoTest(int edad, boolean familia, boolean repetidor, float resultado_esperado){
        
        this.edad = edad;
        this.familia_numerosa = familia;
        this.repetidor = repetidor;
        this.resultado_esperado = resultado_esperado;
    }
    
    @Test
    public void TestMAtricula(){
    
        assertEquals(resultado_esperado, matricula.calculaTasaMatricula(edad, familia_numerosa, repetidor), 0.01f);
        
    }

}
