
//testing for printer class


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer lvl6;

    @Before
    public void createNewPrinter(){
        lvl6 = new Printer(80, 50);
    }




    @Test
    public void printerHasPaperEighty(){
        assertEquals(80, lvl6.getPaper());
    }

    @Test
    public void printerPrintsOneSheet(){
        lvl6.print(1, 1);
        assertEquals(79, lvl6.getPaper());
    }

//    @Test
//    public void printerPrintsUptoMax(){
//        lvl6.print(100, 1);
//        assertEquals(0, lvl6.getPaper());
//    }

    @Test
    public void printerTenCopies(){
        lvl6.print(2, 10);
        assertEquals(60, lvl6.getPaper());
    }

    @Test
    public void printerHasTonerFifty(){
        assertEquals(50, lvl6.getToner());
    }

    @Test
    public void printerTonerReducesByOne(){
        lvl6.print(1, 1);
        assertEquals(49, lvl6.getToner());
    }

    @Test
    public void printerStopsWhenTonerRunsOut(){
        lvl6.print(10, 10);
        assertEquals(0, lvl6.getToner());
    }

    @Test
    public void printerDefaultSstatus(){
        assertEquals(false, lvl6.getStatus());
    }

    @Test
    public void printerRefillNotificationIsTrue(){
        lvl6.print(10, 10);
        assertEquals(true, lvl6.getStatus());
    }

}
