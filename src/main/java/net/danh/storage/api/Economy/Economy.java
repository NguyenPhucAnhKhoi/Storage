package net.danh.storage.api.Economy;

import org.bukkit.entity.Player;

@SuppressWarnings("unused")
public interface Economy {
    /**
     * Get the money this player has
     * @param player Player to get information
     * @return Amount of money as integer
     */
    long getMoney(Player player);

    /**
     * Set a custom amount money for this player
     * @param player Player to get information
     * @param amount Amount of money to set
     */
    void setMoney(Player player, Long amount);

    /**
     * Add a custom amount money to this player
     * @param player Player to add money
     * @param amount Amount of money to add
     */
    void addMoney(Player player, Long amount);

    /**
     * Remove a custom amount money from this player
     * @param player Player to remove money
     * @param amount Amount of money to remove
     */
    void removeMoney(Player player, Long amount);

    /**
     * Get the unique name of economy
     * @return Unique Name
     */
    String getName();

    /**
     * Run code for this economy when plugin is reloading
     */
    void onReload();
}
