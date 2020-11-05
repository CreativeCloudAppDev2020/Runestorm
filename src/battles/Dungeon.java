package battles;


/**
 * This class contains attributes of dungeons in this game.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Dungeon extends BattleArea {
    public enum DungeonType {
        ITEM,
        ELEMENTAL,
        EXP,
        COIN,
        SECONDARY_AWAKEN_EXP
    }
    private transient final DungeonType dungeonType;

    /**
     * Creating constructor of Dungeon class.
     * */

    public Dungeon(DungeonType dungeonType) {
        this.dungeonType = dungeonType;
    }
}
