package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player set amount of resources for storage
 */
@SuppressWarnings("unused")
public class StorageSet extends StoragePlayerEvent {
    private String name;
    private int amount;
    private boolean max;

    /**
     * Constructor method
     * @param player Player will be received resources
     * @param name Name of storage that resources will be stored in
     * @param amount Amount of resources will be stored in
     * @param max Is this event add to max or not
     */
    public StorageSet(Player player, String name, Integer amount, Boolean max) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.max = max;
    }

    /**
     * Get the storage name of this event
     * @return Storage name to set
     */
    public String getName() {
        return name;
    }

    /**
     * Get the amount of this event
     * @return Amount will be set
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Get the status of set max mode
     * @return True or false
     */
    public boolean isAll() {
        return max;
    }

    /**
     * Set the storage name of this event
     * @param name Storage name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the amount of this event
     * @param amount Amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Set max for storage or not
     * @param max True or false
     */
    public void setAll(boolean max) {
        this.max = max;
    }
}
