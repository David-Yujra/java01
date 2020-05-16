import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void is_equals_() {
        Persona per=new Persona();
        per.setNombre("David");
        per.setApellido("Yujra");
        Persona per2=new Persona();
        per2.setNombre("David");
        per2.setApellido("Yujra");
       // assertEquals("hello",per,per2);
//assertTrue();
    }
}