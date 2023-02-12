package net.nguyenkhoistorage.api.Gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Class represent ItemStack but contains Papi
 */
@SuppressWarnings("unused")
public interface PapiItemStack {
    /**
     * Set the amount of item that icon represent
     * @param amount Amount to set
     */
    void setAmount(String amount);

    /**
     * Get amount of item that icon represent
     * @return Amount as string
     */
    String getAmount();

    /**
     * Amount of this icon contains papi or not
     * @return True or false
     */
    boolean amountHashPapi();

    /**
     * Set slot for this icon
     * @param slot Slot to set
     */
    void setSlot(String slot);

    /**
     * Get slot of this icon
     * @return Slot as string
     */
    String getSlot();

    /**
     * Slot of this icon contains papi or not
     * @return True or false
     */
    boolean slotHasPapi();

    /**
     * Set the durability of item this icon represent
     * @param durability Durability to set
     */
    void setDurability(String durability);

    /**
     * Get the durability of item this icon represent
     * @return Durability as string
     */
    String getDurability();

    /**
     * Durability of this icon contains papi or not
     * @return True or false
     */
    boolean durabilityHasPapi();

    /**
     * Set the material type of item this icon represent
     * @param material Bukkit Material Type to set
     */
    void setMaterial(String material);

    /**
     * Get the material type of item this icon represent
     * @return Bukkit Material Type
     */
    String getMaterial();

    /**
     * Material of this icon contains papi or not
     * @return True or false
     */
    boolean materialHasPapi();

    /**
     * Set the Bukkit ItemMeta of item this icon represent
     * @param itemMeta Bukkit ItemMeta to set
     */
    void setItemMeta(PapiItemMeta itemMeta);

    /**
     * Get Papi ItemMeta of item this icon represent
     * @return Papi ItemMeta
     */
    PapiItemMeta getItemMeta();

    /**
     * Parse this papi item stack's slot to integer slot
     * @param player Player to parse
     * @return Slot as integer
     */
    int parseSlot(Player player);

    /**
     * Parse this papi item stack to bukkit item stack
     * @param player Player to parse
     * @return Bukkit Item Stack
     */
    ItemStack parseItemStack(Player player);
}
