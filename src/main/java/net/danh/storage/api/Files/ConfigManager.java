package net.danh.storage.api.Files;

import org.bukkit.Material;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public interface ConfigManager {
    /**
     * Get the current blocks map of this manager
     * @return Map contains all blocks
     */
    Map<String, BlockSection> getBlocks();

    /**
     * Set the current blocks map for this manager
     * @param blocks Map blocks to set
     */
    void setBlocks(Map<String, BlockSection> blocks);

    /**
     * Merge map blocks of this manager to config file
     * Note: It will change the data stored in config
     * so make sure you want to merge
     */
    void mergeFromConfig();

    /**
     * Load map blocks from config to this manager
     * Note: It will replace the map blocks stored in
     * this manager so make sure you want to merge
     */
    void mergeToConfig();

    /**
     * Get the block name of a block section
     * @param block Block section to get
     * @return Name as String
     */
    String getName(BlockSection block);

    /**
     * Get the block name by material
     * @param material Bukkit material to get
     * @return Name as String
     */
    String getName(Material material);

    /**
     * Get the block names by material
     * @param material Bukkit material to get
     * @return Name as List String
     */
    List<String> getNames(Material material);

    /**
     * Get the block section by name
     * @param name Name to get
     * @return Block Section
     */
    BlockSection getBlockSection(String name);

    /**
     * Get the bukkit material by name
     * @param name Name to get
     * @return Bukkit material
     */
    Material getConvert(String name);

    /**
     * Get the bukkit materials by name
     * @param name Name to get
     * @return List Bukkit material
     */
    List<Material> getConverts(String name);

    /**
     * Get the price of block by block section
     * @param block Block section to get
     * @return Price as Long
     */
    Long getPrice(BlockSection block);

    /**
     * Get the price of block by name
     * @param name Name to get
     * @return Price as Long
     */
    Long getPrice(String name);

    /**
     * Get the block material by name
     * @param name Name to get
     * @return Bukkit material
     */
    Material getBlock(String name);

    /**
     * Get the block material by block section
     * @param block Block section to get
     * @return Bukkit material
     */
    Material getBlock(BlockSection block);

    /**
     * Get the block materials by name
     * @param name Name to get
     * @return List Bukkit material
     */
    List<Material> getBlocks(String name);

    /**
     * Get the block materials by block section
     * @param block Block section to get
     * @return List Bukkit material
     */
    List<Material> getBlocks(BlockSection block);
}
