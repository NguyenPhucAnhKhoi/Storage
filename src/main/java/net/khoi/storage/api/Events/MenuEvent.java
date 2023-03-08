package net.khoi.storage.api.Events;

import net.khoi.storage.api.Gui.MainGui.Menu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * This event will be called when player open or close menu
 */
@SuppressWarnings("unused")
public class MenuEvent extends StoragePlayerEvent {
    private final Inventory menu;

    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu as Inventory which player is interacting with
     */
    public MenuEvent(Player player, Inventory menu) {
        super(player);
        this.menu = menu;
    }

    /**
     * Get the target menu of this event
     * @return Menu
     */
    public Inventory getMenu() {
        return menu;
    }
}
