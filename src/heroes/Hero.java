package heroes;

import org.apfloat.Apfloat;
import others.Buff;
import others.Debuff;

import java.util.ArrayList;

/**
 * This class contains attributes of heroes in this game.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Hero {
    // Class attributes
    private final int MIN_LEVEL = 1;
    private final double MIN_CRIT_RATE = 0.15;
    private final double MAX_CRIT_RATE = 1;
    private final double MIN_CRIT_DAMAGE = 0.5;
    private final double MIN_RESISTANCE = 0.15;
    private final double MIN_ACCURACY = 0;
    private String heroID;
    private String name;
    public enum Element {
        FIRE,
        WATER,
        WIND,
        LIGHT,
        DARK,
        NEUTRAL
    }
    private final transient Element element;
    public enum Type {
        NORMAL,
        MINIBOSS,
        BOSS
    }
    private final transient Type type;
    private int level;
    private Apfloat EXP;
    private Apfloat requiredEXP;
    private Apfloat currHP;
    private Apfloat maxHP;
    private Apfloat currMagicPoints;
    private Apfloat maxMagicPoints;
    private Apfloat attackPower;
    private Apfloat defense;
    private double attackSpeed;
    private double critRate;
    private double critDamage;
    private double resistance;
    private double accuracy;
    private Apfloat magicPointsHealRate;
    private boolean hasAwakened;
    private boolean hasSecondaryAwakened;
    private ArrayList<Buff> buffs;
    private ArrayList<Debuff> debuffs;

    /**
     * Creating constructor of Hero class.
     * */

    public Hero(String heroID, String name, Element element, Type type, Apfloat maxHP, Apfloat maxMagicPoints,
                Apfloat attackPower, Apfloat defense, double attackSpeed){
        this.heroID = heroID;
        this.name = name;
        this.element = element;
        this.type = type;
        level = MIN_LEVEL;
        EXP = new Apfloat("0");
        requiredEXP = new Apfloat("1e6");
        this.maxHP = maxHP;
        currHP = maxHP;
        this.maxMagicPoints = maxMagicPoints;
        currMagicPoints = maxMagicPoints;
        this.attackPower = attackPower;
        this.defense = defense;
        this.attackSpeed = attackSpeed;
        this.critRate = MIN_CRIT_RATE;
        this.critDamage = MIN_CRIT_DAMAGE;
        this.resistance = MIN_RESISTANCE;
        this.accuracy = MIN_ACCURACY;
        magicPointsHealRate = maxMagicPoints.divide(new Apfloat("12"));
        hasAwakened = false;
        hasSecondaryAwakened = false;
        buffs = new ArrayList<>();
        debuffs = new ArrayList<>();
    }

    /***/
    public boolean isAlive(){
        return currHP.compareTo(new Apfloat("0")) > 0;
    }
}
