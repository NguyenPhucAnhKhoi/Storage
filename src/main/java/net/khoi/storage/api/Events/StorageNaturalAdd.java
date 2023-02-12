package net.khoi.storage.api.Events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * This event will be called when player break the block with material can be stored in storage
 */
@SuppressWarnings("unused")
public class StorageNaturalAdd extends StorageAdd {
    private final Block broken;

    /**
     * Constructor method
     * @param player Player broke block and will be received resources
     * @param name Name of storage that resources will be stored in
     * @param amount Amount of resources will be stored in
     * @param broken The block was broken by player
     */
    public StorageNaturalAdd(Player player, String name, Integer amount, Block broken) {
        super(player, name, amount, false, true);
        this.broken = broken;
    }

    /**
     * Get the Bukkit Block that player broke
     * @return Bukkit Block
     */
    public Block getBroken() {
        return broken;
    }
}
