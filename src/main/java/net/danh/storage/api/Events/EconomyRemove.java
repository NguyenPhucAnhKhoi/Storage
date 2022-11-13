package net.danh.storage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be call when api or player remove money though Economy Manager
 */
@SuppressWarnings("unused")
public class EconomyRemove extends EconomyEvent {
    /**
     * Constructor method
     * @param player Player causes this event
     * @param amount Amount will be changed
     */
    public EconomyRemove(Player player, Long amount) {
        super(player, amount);
    }
}
