/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

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
public class MatriculaTest {
    
   
    public int edad;
    public boolean familia_numerosa;
    public boolean repetidor;
    public float resultado_esperado;
    public Matricula matricula = new Matricula();
    
    
    @Test
    public void C1calculaMatriculaTest(){
        
        edad = 20;
        familia_numerosa = false;
        repetidor = true;
        resultado_esperado = 2000f;
        Assert.assertEquals(resultado_esperado, matricula.calculaTasaMatricula(edad, familia_numerosa, repetidor),0.01);
    
    }
    
     @Test
    public void C2calculaMatriculaTest(){
        
        edad = 70;
        familia_numerosa = false;
        repetidor = true;
        resultado_esperado = 250f;
        Assert.assertEquals(resultado_esperado, matricula.calculaTasaMatricula(edad, familia_numerosa, repetidor),0.01);
    
    }
    
    
}
