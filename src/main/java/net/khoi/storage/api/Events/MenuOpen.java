package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.Inventory;

/**
 * This event will be called when player open menu
 */
@SuppressWarnings("unused")
public class MenuOpen extends MenuEvent implements Cancellable {
    private boolean cancel;
    /**
     * Constructor method
     * @param player Player causes this event
     * @param menu Menu as inventory will be opened
     */
    public MenuOpen(Player player, Inventory menu) {
        super(player, menu);
    }

    /**
     * @return The event is cancelled or not
     */
    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    /**
     * Set the cancel status for this event
     * @param cancel True or false
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
