package com.sondeos;

import java.util.HashSet;
import java.util.Set;

public class Battleship {
    private Set<Integer> locations;
    private Set<Integer> hits = new HashSet<>();

 //   private int hits = 0;
    public void setLocations(Set<Integer> locations) {
        this.locations = locations;
    }

    public String shot(int userShot) {
        String ret = "";
        if (locations.contains(userShot)) {
            hits.add(userShot);
            ret = "hit";

        } else {
            ret = "miss";
        }

        if (hits.size() == 3) {
            ret = "sunk";
        }

        return ret;
    }
}
