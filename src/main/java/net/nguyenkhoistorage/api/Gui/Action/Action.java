package net.nguyenkhoistorage.api.Gui.Action;

import org.bukkit.entity.Player;

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
