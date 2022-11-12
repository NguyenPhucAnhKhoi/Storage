package net.danh.storage.api.Database;

import org.bukkit.Material;

import java.util.List;

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
     * @param name Name of storage to get informations
     * @return Bukkit material
     */
    Material getMaterial(String name);

    /**
     * This method will be called when server start. Use it to set
     * up your custom database.
     */
    void initialize();

    /**
     * Get amount of material (storage name) player has
     * @param uuid Player's uuid
     * @param material Material (storage name)
     * @return Amount of material
     */
    int getAmount(String uuid, String material);

    /**
     * Get max amount of material (storage name) player has
     * @param uuid Player's uuid
     * @param material Material (storage name)
     * @return Max amount of material
     */
    int getMax(String uuid, String material);

    /**
     * Get auto smelt status of player
     * @param uuid Player's uuid
     * @return Status auto smelt
     */
    boolean getSmelt(String uuid);

    /**
     * Get auto pickup status of player
     * @param uuid Player's uuid
     * @return Status auto pickup
     */
    boolean getPickup(String uuid);

    /**
     * Get the list contains all uuids store in database
     * @return The uuid list
     */
    List<String> getUUIDS();

    /**
     * Get the list contains materials store in this uuid
     * @param uuid Player's uuid
     * @return the material list
     */
    List<String> getMaterials(String uuid);

    /**
     * Set the amount of this material (storage name) for this player
     * @param uuid Player's uuid
     * @param material Material (storage name)
     * @param amount Amount to set
     */
    void setAmount(String uuid, String material, Integer amount);

    /**
     * Set the max amount of this material (storage name) for this player
     * @param uuid Player's uuid
     * @param material Material (storage name)
     * @param amount Max amount to set
     */
    void setMax(String uuid, String material, Integer amount);

    /**
     * Set the status of smelt for this player
     * @param uuid Player's uuid
     * @param status Status
     */
    void setSmelt(String uuid, Boolean status);

    /**
     * Set the status of pickup for this player
     * @param uuid Player's uuid
     * @param status Status
     */
    void setPikup(String uuid, Boolean status);
}
