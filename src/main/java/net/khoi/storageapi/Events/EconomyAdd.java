package net.khoi.storageapi.Events;

import org.bukkit.entity.Player;

/**
 * This event will be call when api or player add money though Economy Manager
 */
@SuppressWarnings("unused")
public class EconomyAdd extends EconomyEvent {
    /**
     * Constructor method
     * @param player Player causes this event
     * @param amount Amount will be changed
     */
    public EconomyAdd(Player player, Long amount) {
        super(player, amount);
    }
}
