package net.khoi.storage.api.Events;

import net.khoi.storage.api.Gui.MainGui.Menu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * This event will be called when player open menu
 */
@SuppressWarnings("unused")
public class MenuOpen extends MenuEvent {
    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu as inventory will be opened
     */
    public MenuOpen(Player player, Inventory menu) {
        super(player, menu);
    }
}
