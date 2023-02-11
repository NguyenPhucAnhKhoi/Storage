package net.nguyenkhoistorage.api.Events;

import org.bukkit.entity.Player;

/**
 * This event will be called when api and player set amount of resources for storage
 */
@SuppressWarnings("unused")
public class StorageSet extends StoragePlayerEvent {
    private String name;
    private int amount;
    private boolean all;

    /**
     * Constructor method
     * @param player Player will be received resources
     * @param name Name of storage that resources will be stored in
     * @param amount Amount of resources will be stored in
     * @param all Is this event add all or not
     */
    public StorageSet(Player player, String name, Integer amount, Boolean all) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.all = all;
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
     * Get the status of set all mode
     * @return True or false
     */
    public boolean isAll() {
        return all;
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
     * Set all to storage or not
     * @param all True or false
     */
    public void setAll(boolean all) {
        this.all = all;
    }
}
