package com.sondeos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BattleshipTest {
    @Test
    public void test01() {

        Battleship battleship = new Battleship();
        int[] locations = {2,3,4};
        battleship.setLocations(locations);
        int userShot = 1;

        String result = battleship.shot(userShot);

        assertEquals("miss", result);

    }

}