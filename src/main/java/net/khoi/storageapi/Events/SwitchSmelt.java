package net.khoi.storageapi.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player switch status of auto smelt
 */
@SuppressWarnings("unused")
public class SwitchSmelt extends SwitchAuto {

    /**
     * Constructor method
     * @param player Player will be switched mode
     * @param status Status will be switched
     */
    public SwitchSmelt(Player player, Boolean status) {
        super(player, status, AutoType.SMELT);
    }
}
