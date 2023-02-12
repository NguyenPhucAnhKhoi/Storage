package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player switch status of auto pickup
 */
@SuppressWarnings("unused")
public class SwitchPickup extends SwitchAuto {

    /**
     * Constructor method
     * @param player Player will be switched mode
     * @param status Status will be switched
     */
    public SwitchPickup(Player player, Boolean status) {
        super(player, status, AutoType.PICKUP);
    }
}
