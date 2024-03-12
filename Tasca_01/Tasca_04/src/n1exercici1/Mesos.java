package n1exercici1;

public class Mesos {
   List<String> mesos = new ArrayList<>();
    mesos.addAll(List.of("gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre"));

}

@Test 
public void mesosTest(){
    Mesos mes = new Mesos();
    assertEquals(12,mes.size());
    assertNotNull(mes);
    assertEquals("agost",mes.getClass(7));
    
}
