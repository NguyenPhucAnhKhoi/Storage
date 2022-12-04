package net.danh.storage.api.Files;

import org.bukkit.Material;

import java.util.List;

@SuppressWarnings("unused")
public interface ConfigBlock {
    /**
     * Get the name of this config block section
     * @return Original name (with unconverted color code)
     */
    String getName();

    /**
     * Get the price of this config block section
     * @return Price as long
     */
    Long getPrice();

    /**
     * Get the material this config block will convert into
     * @return The bukkit material
     */
    Material getConvert();

    /**
     * Get the materials of original blocks of this config
     * block section
     * @return The list of bukkit material
     */
    List<Material> getBlocks();

    /**
     * Set the new name of this config block section
     * @param name New name to rename
     */
    void setName(String name);

    /**
     * Set the new price of this config block section
     * @param price New price to reprice
     */
    void setPrice(int price);

    /**
     * Set the convert material of this config block section
     * @param material Bukkit material to set
     */
    void setConvert(Material material);

    /**
     * Set the block storage materials list of this config
     * block section
     * @param materials Bukkit materials list
     */
    void setBlocks(List<Material> materials);
}
