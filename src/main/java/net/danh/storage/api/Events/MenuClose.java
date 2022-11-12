package net.danh.storage.api.Events;

import net.danh.storage.api.Gui.Menu;
import org.bukkit.entity.Player;

/**
 * This event will be called when player close menu
 */
@SuppressWarnings("unused")
public class MenuClose extends MenuEvent {
    /**
     * Constructor method
     * @param player Player cause this event
     * @param menu Menu will be closed
     */
    public MenuClose(Player player, Menu menu) {
        super(player, menu);
    }
}
