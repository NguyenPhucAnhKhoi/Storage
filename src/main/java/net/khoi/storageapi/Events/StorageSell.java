package net.khoi.storageapi.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player sell resources from storage
 */
@SuppressWarnings("unused")
public class StorageSell extends StoragePlayerEvent {
    private String name;
    private int amount;
    private boolean all;
    private boolean inv;

    /**
     * Constructor method
     * @param player Player will be sold resources
     * @param name Name of storage that resources will be sold
     * @param amount Amount of resources will be sold
     * @param all Is this event sell all or not
     * @param inv Is this event take resources from storage to sell or not
     */
    public StorageSell(Player player, String name, Integer amount, Boolean all, Boolean inv) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.all = all;
        this.inv = inv;
    }

    /**
     * Get the storage name of this event
     * @return Storage name to sell
     */
    public String getName() {
        return name;
    }

    /**
     * Get the amount of this event
     * @return Amount will be sold
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Get the status of sell all mode
     * @return True or false
     */
    public boolean isAll() {
        return all;
    }

    /**
     * Get the status of sell inventory mode
     * @return True or false
     */
    public boolean isInv() {
        return inv;
    }

    /**
     * Set the storage name of this event
     * @param name Storage name to sell
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the amount of this event
     * @param amount Amount to sell
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Sell by take item from player storage or not
     * @param inv True or false
     */
    public void setInv(boolean inv) {
        this.inv = inv;
    }

    /**
     * Sell all to storage or not
     * @param all True or false
     */
    public void setAll(boolean all) {
        this.all = all;
    }
}
