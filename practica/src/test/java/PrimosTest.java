import org.junit.Test;

import static org.junit.Assert.*;

public class PrimosTest {

    @Test
    public void is_primo_when_then_number_is_5() {
        Primos pri= new Primos();
        //assertSame(false, pri.verificar(5));
        assertSame("si", pri.verificar(5));
    }

    @Test
    public void not_primo_when_then_number_is_15() {
        Primos pri= new Primos();
        //assertSame(false, pri.verificar(5));
        assertSame("no", pri.verificar(15));
    }

    @Test
    public void prueba_assertTrue() {
        Primos pri=new Primos();
        assertTrue(pri.verificar(6));
    }
}