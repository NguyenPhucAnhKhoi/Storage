package net.nguyenkhoistorage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player add resources to storage
 */
@SuppressWarnings("unused")
public class StorageAdd extends StoragePlayerEvent {
    private String name;
    private int amount;
    private boolean all;
    private boolean inv;

    /**
     * Constructor method
     * @param player Player will be received resources
     * @param name Name of storage that resources will be stored in
     * @param amount Amount of resources will be stored in
     * @param all Is this event add all or not
     * @param inv Is this event take resources from inventory to
     * add or not
     */
    public StorageAdd(Player player, String name, Integer amount, Boolean all, Boolean inv) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.all = all;
        this.inv = inv;
    }

    /**
     * Get the storage name of this event
     * @return Storage name to add
     */
    public String getName() {
        return name;
    }

    /**
     * Get the amount of this event
     * @return Amount will be added
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Get the status of add all mode
     * @return True or false
     */
    public boolean isAll() {
        return all;
    }

    /**
     * Get the status of add inventory mode
     * @return True or false
     */
    public boolean isInv() {
        return inv;
    }

    /**
     * Set the storage name of this event
     * @param name Storage name to add
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the amount of this event
     * @param amount Amount to add
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Add by take item from player inventory or not
     * @param inv True or false
     */
    public void setInv(boolean inv) {
        this.inv = inv;
    }

    /**
     * Add all to storage or not
     * @param all True or false
     */
    public void setAll(boolean all) {
        this.all = all;
    }
}
