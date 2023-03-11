package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when api and player take resources from storage
 */
@SuppressWarnings("unused")
public class StorageTake extends StoragePlayerEvent implements Cancellable {
    private String name;
    private int amount;
    private boolean all;
    private boolean inv;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player will be taken resources
     * @param name Name of storage that resources will be taken in
     * @param amount Amount of resources will be taken in
     * @param all Is this event take all or not
     * @param inv Is this event take resources from storage or not
     */
    public StorageTake(Player player, String name, Integer amount, Boolean all, Boolean inv) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.all = all;
        this.inv = inv;
    }

    /**
     * Get the storage name of this event
     * @return Storage name to take
     */
    public String getName() {
        return name;
    }

    /**
     * Get the amount of this event
     * @return Amount will be taken
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Get the status of take all mode
     * @return True or false
     */
    public boolean isAll() {
        return all;
    }

    /**
     * Get the status of take inventory mode
     * @return True or false
     */
    public boolean isInv() {
        return inv;
    }

    /**
     * Set the storage name of this event
     * @param name Storage name to take
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the amount of this event
     * @param amount Amount to take
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Take by add item to player inventory or not
     * @param inv True or false
     */
    public void setInv(boolean inv) {
        this.inv = inv;
    }

    /**
     * Take all to storage or not
     * @param all True or false
     */
    public void setAll(boolean all) {
        this.all = all;
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
