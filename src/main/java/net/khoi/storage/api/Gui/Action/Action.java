package net.khoi.storage.api.Gui.Action;

import org.bukkit.entity.Player;

/**
 * This class represent of action will be executed when player click in icon hold this action
 */
@SuppressWarnings("unused")
public abstract class Action {
    private final String action;

    /**
     * Constructor method
     *
     * Create new instance of action for menu api
     * @param action Action identifier name
     */
    public Action(String action) {
        this.action = action;
    }

    /**
     * Get action type identifier of this action
     * @return Action identifier name
     */
    String getActionType() {
        return action;
    }

    /**
     * Execute this action for specific player
     * @param player Player to perform action
     * @param args Arguments to perform action
     */
    public abstract void execute(Player player, String[] args);
}
