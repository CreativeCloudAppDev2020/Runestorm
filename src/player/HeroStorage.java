package player;


import heroes.Hero;

import java.util.ArrayList;

/**
 * This class contains attributes of player's storage containing heroes.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class HeroStorage {
    // Class attributes
    private final int MIN_HEROES = 0;
    private final int MAX_HEROES = 1000;
    private ArrayList<Hero> heroes;

    /**
     * Creating constructor of HeroStorage class.
     * */

    public HeroStorage(){
        heroes = new ArrayList<>();
    }
}
