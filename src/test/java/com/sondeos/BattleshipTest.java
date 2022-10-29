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

    @Test
    public void test02() {

        Battleship battleship = new Battleship();
        int[] locations = {2,3,4};
        battleship.setLocations(locations);
        int userShot = 2;

        String result = battleship.shot(userShot);

        assertEquals("hit", result);

    }

    @Test
    public void test03() {

        Battleship battleship = new Battleship();
        int[] locations = {2,3,4};
        battleship.setLocations(locations);
        int userShot = 3;

        String result = battleship.shot(userShot);

        assertEquals("hit", result);

    }

    @Test
    public void test04() {

        Battleship battleship = new Battleship();
        int[] locations = {1,2,3};
        battleship.setLocations(locations);
        int userShot = 1;

        String result = battleship.shot(userShot);

        assertEquals("hit", result);

    }

    @Test
    public void test05() {

        Battleship battleship = new Battleship();
        int[] locations = {1,2,3};
        battleship.setLocations(locations);
        int userShot1 = 1;
        int userShot2 = 2;
        int userShot3 = 3;

        String result = battleship.shot(userShot1);
        result = battleship.shot(userShot2);
        result = battleship.shot(userShot3);

        assertEquals("sunk", result);

    }
    
}