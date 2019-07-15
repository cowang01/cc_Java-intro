import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer lvl6;

    @Before
    public void createNewPrinter(){
        lvl6 = new Printer(80);
    }



    @Test
    public void printerHasPaperEighty(){
        assertEquals(80, lvl6.getPaper());
    }

    @Test
    public void printerPrintsOneSheet(){
        lvl6.print(1);
        assertEquals(79, lvl6.getPaper());
    }

    @Test
    public void printerPrintsUptoMax(){
        lvl6.print(100);
        assertEquals(0, lvl6.getPaper());
    }
    

}
