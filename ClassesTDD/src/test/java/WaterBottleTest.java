
//Testing of water bottle class

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle bottleOne;
    WaterBottle bottleTwo;

    @Before
    public void createNewWatterbottles(){
        bottleOne = new WaterBottle(0);
        bottleTwo = new WaterBottle(100);
    }


    @Test
    public void startVolumeOneIsZero(){
        assertEquals(0, bottleOne.getVolume());
    }

    @Test
    public void startVolumeTwoIsFull(){
        assertEquals(100, bottleTwo.getVolume());
    }

    @Test
    public void reduceVolumeToNinty(){
        bottleTwo.drinkOnce();
        assertEquals(90, bottleTwo.getVolume());
    }

    @Test
    public void emptyVolumeToZero(){
        bottleTwo.emptyAll();
        assertEquals(0, bottleTwo.getVolume());
    }

    @Test
    public void FillBottleToFull(){
        bottleOne.fillUp();
        assertEquals(100, bottleOne.getVolume());
    }

    @Test
    public void zeroIsMinimum(){
        bottleOne.drinkOnce();
        assertEquals(0, bottleOne.getVolume());
    }


}
