package net.danh.storage.api.Files;

import org.bukkit.Material;

import java.util.List;

/**
 * This class represent to a block section store in config.yml file
 */
@SuppressWarnings("unused")
public class BlockSection {
    private String name;
    private Long price;
    private Material convert;
    private List<BlockPair> blocks;

    /**
     * Create new instance
     * @param name Name of block section
     * @param price Price of block section
     * @param convert Convert material of block section
     * @param blocks Blocks material of block section
     */
    public BlockSection(String name, Long price, Material convert, List<BlockPair> blocks) {
        this.name = name;
        this.price = price;
        this.convert = convert;
        this.blocks = blocks;
    }

    /**
     * Get the name of this config block section
     * @return Original name (with unconverted color code)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the price of this config block section
     * @return Price as long
     */
    public Long getPrice() {
        return price;
    }

    /**
     * Get the material this config block will convert into
     * @return The bukkit material
     */
    public Material getConvert() {
        return convert;
    }

    /**
     * Get the block pair of original blocks of this config
     * block section
     * @return The list of block pair
     */
    public List<BlockPair> getBlocks() {
        return blocks;
    }

    /**
     * Set the new name of this config block section
     * @param name New name to rename
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the new price of this config block section
     * @param price New price to reprice
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * Set the convert material of this config block section
     * @param material Bukkit material to set
     */
    public void setConvert(Material material) {
        this.convert = material;
    }

    /**
     * Set the block storage materials list of this config
     * block section
     * @param materials Bukkit materials list
     */
    public void setBlocks(List<BlockPair> materials) {
        this.blocks = materials;
    }
}
