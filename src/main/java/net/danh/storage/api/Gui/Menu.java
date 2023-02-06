package net.danh.storage.api.Gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This class represent bukkit inventory
 */
@SuppressWarnings("unused")
public interface Menu extends Cloneable, Iterable<Icon> {

    /**
     * Update Type Enum
     */
    enum UpdateType {
        /**
         * Update all icons and the title of menu
         */
        TITLE,

        /**
         * Only update all icons of menu
         */
        NORMAL
    }

    /**
     * Open this menu for player
     * @param player Player will be viewed
     */
    void open(Player player);

    /**
     * Get the title of gui
     * @return Title as string
     */
    String getTitle();

    /**
     * Get the size of gui
     * @return Size
     */
    int getSize();

    /**
     * Get the Bukkit InventoryType of gui
     * @return Bukkit InventoryType
     */
    InventoryType getType();

    /**
     * Update gui or not
     * @return Boolean status
     */
    boolean allowUpdate();

    /**
     * Get The duration of an update cycle
     * @return Milliseconds
     */
    long getUpdateTime();

    /**
     * Get the update type of this menu
     * @return Update Type
     */
    UpdateType getUpdateType();

    /**
     * Check if the menu contains any icon matching the given this icon
     * @param icon Icon to check
     * @return True or false
     */
    boolean contains(Icon icon);

    /**
     * Check if the menu contains any icon has material matching the given
     * material
     * @param material Material to check
     * @return True or false
     */
    boolean contains(Material material);

    /**
     * Return the first empty slot of menu
     * @return The first empty slot
     */
    int firstEmpty();

    /**
     * Find the first slot has icon matching the given icon
     * @param icon Icon to find
     * @return The slot was found
     */
    int first(Icon icon);

    /**
     * Find the first slot has icon with material matching the given material
     * @param material Material to find
     * @return The material was found
     */
    int first(Material material);

    /**
     * Get a hashmap contains all icons in this menu
     * The key is slot, value is the icon
     * @return HashMap represent the menu
     */
    HashMap<Integer, Icon> getIcons();

    /**
     * Replace current menu's icons with another
     * @param icons New icons HashMap
     */
    void setIcons(HashMap<Integer, Icon> icons);

    /**
     * Get the icon in specific slot
     * @param slot Slot to get
     * @return Icon stored in given slot
     */
    Icon getIcon(int slot);

    /**
     * Change the icon in specific slot to the given icon
     * @param slot Slot to change
     * @param icon Icon to change
     */
    void setIcon(int slot, Icon icon);

    /**
     * Add given icon to the first empty slot in menu
     * @param icon Icon to add
     */
    void addIcon(Icon icon);

    /**
     * Remove the first icon matching given icon in menu
     * @param icon Icon to remove
     */
    void removeIcon(Icon icon);

    /**
     * Implement method of iterator class
     * @return Iterator
     */
    @Override
    Iterator<Icon> iterator();
}
