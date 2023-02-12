package net.khoi.storageapi.Events;

import net.khoi.storageapi.Gui.MainGui.Menu;
import org.bukkit.entity.Player;

/**
 * This event will be called when player close menu
 */
@SuppressWarnings("unused")
public class MenuClose extends MenuEvent {
    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu will be closed
     */
    public MenuClose(Player player, Menu menu) {
        super(player, menu);
    }
}
