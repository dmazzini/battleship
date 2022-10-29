package com.sondeos;

import java.util.Set;

public class Battleship {
    private Set<Integer> locations;

    private int hits = 0;
    public void setLocations(Set<Integer> locations) {
        this.locations = locations;
    }

    public String shot(int userShot) {
        String ret = "";
        if (locations.contains(userShot)) {
            hits++;
            ret = "hit";
            if (hits == 3) {
                ret = "sunk";
            }
        } else {
            ret = "miss";
        }
        return ret;
    }
}
