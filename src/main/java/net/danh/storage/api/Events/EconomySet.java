package net.danh.storage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be call when api or player set money though Economy Manager
 */
@SuppressWarnings("unused")
public class EconomySet extends EconomyEvent {
    /**
     * Constructor method
     * @param player Player cause this event
     * @param amount Amount will be changed
     */
    public EconomySet(Player player, Long amount) {
        super(player, amount);
    }
}
