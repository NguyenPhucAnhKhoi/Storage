package net.khoi.storageapi.Files;

import org.bukkit.Material;

/**
 * This class represent a block pair store in a block section
 */
@SuppressWarnings("unused")
public class BlockPair {
    private Material material;
    private int amount;

    /**
     * Crate new instance by a string
     * <br>Syntax: {Material};{Amount}
     * @param string String to create
     */
    public BlockPair(String string) {
        try {
            String[] s = string.split(";");
            if (s.length >= 2) {
                material = Material.matchMaterial(s[0]);
                amount = Integer.parseInt(s[1]);
            } else {
                material = null;
                amount = -1;
            }
        } catch (Exception e) {
            material = null;
            amount = -1;
        }
    }

    /**
     * Create new instance directly
     * @param material Bukkit material
     * @param amount Amount as integer
     */
    public BlockPair(Material material, int amount) {
        this.material = material;
        this.amount = amount;
    }

    /**
     * Get the amount store in this pair
     * @return Amount as integer
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Get the bukkit material store in this pair
     * @return Bukkit material
     */
    public Material getMaterial() {
        return this.material;
    }

    /**
     * Set the amount store in this pair
     * @param amount Amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Set the material store in this pair
     * @param material Bukkit material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Override the to string method by object class
     * @return Object to string
     */
    @Override
    public String toString() {
        return this.material.toString() + ";" + this.amount;
    }
}
