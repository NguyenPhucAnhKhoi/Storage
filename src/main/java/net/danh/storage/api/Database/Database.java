package net.danh.storage.api.Database;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

/**
 * Developers can use this class to create their own custom database
 */
@SuppressWarnings("unused")
public interface Database {
    /**
     * @return The database's name. This name should be exclusive
     */
    String getName();

    /**
     * Get the bukkit material this specific storage can store
     * @param name Name of storage to get information
     * @return Bukkit material
     */
    Material getMaterial(String name);

    /**
     * Initialize storage with names and materials
     * @param data The names correspond to the ingredients
     */
    void initialize(Map<String, Material> data);

    /**
     * Get amount of material (storage name) player has
     * @param player Player to get information
     * @param material Material (storage name)
     * @return Amount of material
     */
    int getAmount(Player player, String material);

    /**
     * Get max amount of material (storage name) player has
     * @param player Player to get information
     * @param material Material (storage name)
     * @return Max amount of material
     */
    int getMax(Player player, String material);

    /**
     * Get auto smelt status of player
     * @param player Player to get information
     * @return Status auto smelt
     */
    boolean getSmelt(Player player);

    /**
     * Get auto pickup status of player
     * @param player Player to get information
     * @return Status auto pickup
     */
    boolean getPickup(Player player);

    /**
     * Get the list contains all uuids store in database
     * @return The uuid list
     */
    List<Player> getPlayers();

    /**
     * Get the list contains materials store in this uuid
     * @param player Player to get information
     * @return the material list
     */
    List<String> getMaterials(Player player);

    /**
     * Set the amount of this material (storage name) for this player
     * @param player Player to get information
     * @param material Material (storage name)
     * @param amount Amount to set
     */
    void setAmount(Player player, String material, Integer amount);

    /**
     * Set the max amount of this material (storage name) for this player
     * @param player Player to get information
     * @param material Material (storage name)
     * @param amount Max amounts to set
     */
    void setMax(Player player, String material, Integer amount);

    /**
     * Set the status of smelt for this player
     * @param player Player to get information
     * @param status Status
     */
    void setSmelt(Player player, Boolean status);

    /**
     * Set the status of pickup for this player
     * @param player Player to get information
     * @param status Status
     */
    void setPickup(Player player, Boolean status);
}
