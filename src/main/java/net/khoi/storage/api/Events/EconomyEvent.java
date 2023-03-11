package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be call when api or player add, remove, set money though Economy Manager
 */
@SuppressWarnings("unused")
public class EconomyEvent extends StoragePlayerEvent implements Cancellable {
    private long amount;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player causes this event
     * @param amount Amount will be changed
     */
    public EconomyEvent(Player player, Long amount) {
        super(player);
        this.amount = amount;
    }

    /**
     * Get amount of money will be changed
     * @return Amount as long
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Set amount of money will be changed
     * @param amount Amount to set
     */
    public void setAmount(Long amount) {
        this.amount = amount;
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
