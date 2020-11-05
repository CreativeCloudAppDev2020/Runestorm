package battles;


/**
 * This class contains attributes of actions to be carried out during battles.
 *
 * @author DtjiSoftwareDeveloper
 * */

public class Action {
    public enum ActionName {
        NORMAL_ATTACK,
        NORMAL_HEAL,
        USE_SKILL
    }

    private final transient ActionName actionName;

    /**
     * Creating constructor of Action class.
     * */

    public Action(ActionName actionName) {
        this.actionName = actionName;
    }
}
