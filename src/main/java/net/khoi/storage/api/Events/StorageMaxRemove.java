package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when api decrease max storage of player
 */
@SuppressWarnings("unused")
public class StorageMaxRemove extends StoragePlayerEvent implements Cancellable {
    private String name;
    private int amount;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player will be decreased max storage
     * @param name Name of storage to decrease max storage
     * @param amount Amount of max storage will be decreased
     */
    public StorageMaxRemove(Player player, String name, Integer amount) {
        super(player);
        this.name = name;
        this.amount = amount;
    }

    /**
     * Get the storage name of this event
     * @return Storage name to decrease
     */
    public String getName() {
        return name;
    }

    /**
     * Get the amount of this event
     * @return Number decreased
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set the storage name of this event
     * @param name Storage name to decrease
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the amount of this event
     * @param amount Number decrease
     */
    public void setAmount(int amount) {
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
