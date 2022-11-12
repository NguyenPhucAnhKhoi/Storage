package net.danh.storage.api.Events;

import net.danh.storage.api.Gui.Menu;
import org.bukkit.entity.Player;

/**
 * This event will be called when player open menu
 */
@SuppressWarnings("unused")
public class MenuOpen extends MenuEvent {
    /**
     * Constructor method
     * @param player Player cause this event
     * @param menu Menu will be opened
     */
    public MenuOpen(Player player, Menu menu) {
        super(player, menu);
    }
}
