package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when api and player sell resources from storage
 */
@SuppressWarnings("unused")
public class StorageSell extends StoragePlayerEvent implements Cancellable {
    private String name;
    private int amount;
    private final int price;
    private final boolean all;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player will be sold resources
     * @param name Name of storage that resources will be sold
     * @param amount Amount of resources will be sold
     * @param price Price of resources material will be sold
     * @param all Is this event sell all or not
     */
    public StorageSell(Player player, String name, Integer amount, Integer price, Boolean all) {
        super(player);
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.all = all;
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
     * Get the price for material of this event
     * @return Price of material
     */
    public int getPrice() {
        return price;
    }

    /**
     * Get the status of sell all mode
     * @return True or false
     */
    public boolean isAll() {
        return all;
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
