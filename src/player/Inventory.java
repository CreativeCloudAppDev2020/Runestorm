package player;


import items.Item;

import java.util.ArrayList;

/**
 * This class contains attributes of the inventory containing items.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Inventory {
    // Class attributes
    private ArrayList<Item> items;

    /**
     * Creating constructor of Inventory class.
     * */

    public Inventory(){
        items = new ArrayList<>();
    }
}
