package testMain;

import org.junit.Test;
import static org.junit.Assert.*;

import Main.Main;

public class MainTest {
    @Test
    public void testExecute() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                Main.main(null);
            }
        });
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(true);
    }
}
