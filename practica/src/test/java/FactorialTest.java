import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial_5(){
        Factorial ver= new Factorial();
        assertSame(120,ver.verificar(5));
    }

    @Test
    public void factorial_0(){
        Factorial ver= new Factorial();
        assertSame(1,ver.verificar(0));
    }

    @Test
    public void factorial_3(){
        Factorial ver= new Factorial();
        assertEquals(6,ver.verificar(3));
    }
}