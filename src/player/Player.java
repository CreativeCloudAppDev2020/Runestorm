package player;

import heroes.Team;
import org.apfloat.Apfloat;

import java.util.UUID;

/**
 * This class contains attributes of the player in this game.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Player {
    private String playerID;
    private String name;
    private int level;
    private Apfloat EXP;
    private Apfloat requiredEXP;
    private Apfloat coins;
    private int arenaWins;
    private int arenaDraws;
    private int arenaLoses;
    private int arenaPoints;
    public enum Rank {
        BEGINNER,
        CHALLENGER,
        FIGHTER,
        CONQUEROR,
        GUARDIAN,
        LEGEND
    }
    private transient Rank rank;
    private Team battleTeam;

    /**
     * Creating constructor of Player class.
     * */

    public Player(String name){
        // Generate random player ID
        playerID = UUID.randomUUID().toString();

        this.name = name;
        level = 1;
        EXP = new Apfloat("0");
        requiredEXP = new Apfloat("1e6");
        coins = new Apfloat("0");
        arenaWins = 0;
        arenaDraws = 0;
        arenaLoses = 0;
        arenaPoints = 1000; // initial value
        rank = Rank.BEGINNER;
        battleTeam = new Team();
    }

    public void updateRank(){
        // TODO: update player's rank based on number of arena points
    }
}
