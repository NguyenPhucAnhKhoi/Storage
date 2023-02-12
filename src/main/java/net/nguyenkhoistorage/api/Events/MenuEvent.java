package net.nguyenkhoistorage.api.Events;

import net.nguyenkhoistorage.api.Gui.MainGui.Menu;
import org.bukkit.entity.Player;

/**
 * This event will be called when player open or close menu
 */
@SuppressWarnings("unused")
public class MenuEvent extends StoragePlayerEvent {
    private Menu menu;

    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu which player is interacting with
     */
    public MenuEvent(Player player, Menu menu) {
        super(player);
        this.menu = menu;
    }

    /**
     * Get the target menu of this event
     * @return Menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Set the target menu of this event
     * @param menu Menu to set
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
