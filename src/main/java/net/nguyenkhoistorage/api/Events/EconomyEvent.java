package net.nguyenkhoistorage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be call when api or player add, remove, set money though Economy Manager
 */
@SuppressWarnings("unused")
public class EconomyEvent extends StoragePlayerEvent {
    private long amount;

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
}
