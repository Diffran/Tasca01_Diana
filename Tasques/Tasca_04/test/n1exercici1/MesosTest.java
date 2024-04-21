package n1exercici1;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MesosTest {
    @Test
    public void mesosSize(){
        assertEquals(12, Mesos.mesos.size());
    }
    @Test
    public void mesosAgost(){
        assertEquals("agost", Mesos.imprimirMes(7));
    }

    @Test
    public void noNull(){
        assertNotNull(Mesos.mesos);
    }
}
