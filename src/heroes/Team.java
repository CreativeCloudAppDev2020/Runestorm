package heroes;


import java.util.ArrayList;

/**
 * This class contains attributes of teams of heroes brought to battles.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Team {
    // Class attributes
    private final int MIN_HEROES = 0;
    private final int MAX_HEROES = 5;
    private ArrayList<Hero> heroes;

    /**
     * Creating constructor of Team class.
     * */

    public Team(){
        heroes = new ArrayList<>();
    }
}
