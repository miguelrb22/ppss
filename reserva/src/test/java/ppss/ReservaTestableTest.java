/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppss;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ppss.excepciones.ReservaException;

/**
 *
 * @author ppss
 */
@RunWith(Parameterized.class)
public class ReservaTestableTest {

    @Parameterized.Parameters(name = "")

    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
            {"xxxx", "xxxx", "Luis", true, new String[]{"11111"}, "ERROR de permisos; "},
            {"ppss", "ppss", "Luis", true, new String[]{"11111"}, "No se lanza excep"},
            {"ppss", "ppss", "Luis", true, new String[]{"33333"}, "ISBN invalido:33333; "},
            {"ppss", "ppss", "Pepe", true, new String[]{"11111"}, "SOCIO invalido; "},
            {"ppss", "ppss", "Luis", false, new String[]{"11111"}, "CONEXION invalida; "}

        });
    }

    String[] isbns;
    String login;
    String password;
    String socio;
    boolean bd;
    String expected;
    I0PerationFactory ifa = new I0PerationFactory();
    OperacionStub os = new OperacionStub();
    ReservaTestable rt = new ReservaTestable();

    public ReservaTestableTest(String login, String password, String socio, boolean bd, String[] isbns, String expected) {

        this.isbns = isbns;
        this.login = login;
        this.password = password;
        this.socio = socio;
        this.bd = bd;
        this.expected = expected;

    }

    @Test
    public void testCompruebaPermisos() {

        os.setBD(bd);
        ifa.setIOPeracionBO(os);

        try {
            rt.realizaReserva(login, password, socio, isbns);
            assertEquals(expected, "No se lanza excep");
        } catch (ReservaException e) {

            assertEquals(expected, e.getMessage());

        } catch (Exception ex) {

            fail(ex.getMessage());
        }

    }

    
    
}
