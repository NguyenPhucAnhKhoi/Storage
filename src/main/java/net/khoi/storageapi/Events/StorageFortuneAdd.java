package net.khoi.storageapi.Events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * This event will be called when player break the block with material can be stored in storage
 * with tool has fortune enchantment
 */
@SuppressWarnings("unused")
public class StorageFortuneAdd extends StorageNaturalAdd {
    private int level;

    /**
     * Constructor method
     *
     * @param player Player broke block and will be received resources
     * @param name   Name of storage that resources will be stored in
     * @param amount Amount of resources will be stored in
     * @param broken The block was broken by player
     * @param level The level of fortune enchantments
     */
    public StorageFortuneAdd(Player player, String name, Integer amount, Block broken, Integer level) {
        super(player, name, amount, broken);
        this.level = level;
    }

    /**
     * Get the level fortune to be executed
     * @return The level of fortune as integer
     */
    public int getLevel() {
        return level;
    }

    /**
     * Set the level fortune to execute
     * <br>It won't change the level fortune enchantment of the player's tool
     * @param level Level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
}
