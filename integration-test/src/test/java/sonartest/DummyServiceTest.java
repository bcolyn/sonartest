package sonartest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DummyServiceTest {

    DummyService service = new DummyService();

    @Test
    public void testShout(){
        assertEquals("CAN YOU HEAR ME?", service.shout("can you hear me?"));
    }
}
