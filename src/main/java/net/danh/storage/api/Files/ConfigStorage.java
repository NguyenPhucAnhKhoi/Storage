package net.danh.storage.api.Files;

import java.util.Map;

@SuppressWarnings("unused")
public interface ConfigStorage {
    /**
     * Get the current blocks map of this manager
     * @return Map contains all blocks
     */
    Map<String, ConfigBlock> getBlocks();

    /**
     * Set the current blocks map for this manager
     * @param blocks Map blocks to set
     */
    void setBlocks(Map<String, ConfigBlock> blocks);

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
}
