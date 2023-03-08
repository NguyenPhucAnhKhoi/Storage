package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * This event will be called when player close menu
 */
@SuppressWarnings("unused")
public class MenuClose extends MenuEvent {
    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu as inventory will be closed
     */
    public MenuClose(Player player, Inventory menu) {
        super(player, menu);
    }
}
