package n1exercici1;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MesosTest {
    @Test
    public void imprimirMesosTest(){
        assertEquals(12, Mesos.mesos.size());
        assertEquals("agost", Mesos.imprimirMes(7));
        assertNotNull(Mesos.mesos);
    }
}
