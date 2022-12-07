package net.danh.storage.api.Files;

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
     * Format: Material;Amount
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
    int getAmount() {
        return this.amount;
    }

    /**
     * Get the bukkit material store in this pair
     * @return Bukkit material
     */
    Material getMaterial() {
        return this.material;
    }

    /**
     * Set the amount store in this pair
     * @param amount Amount to set
     */
    void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Set the material store in this pair
     * @param material Bukkit material to set
     */
    void setMaterial(Material material) {
        this.material = material;
    }
}
