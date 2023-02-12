package net.khoi.storage.api.Gui.Action;

import org.bukkit.entity.Player;

/**
 * This class represent of action will be executed when player click in icon hold this action
 */
@SuppressWarnings("unused")
public interface Action {
    /**
     * Get action type identifier of this action
     * @return Action identifier name
     */
    String getActionType();

    /**
     * Execute this action for specific player
     * @param player Player to perform action
     * @param args Arguments to perform action
     */
    void execute(Player player, String[] args);
}
