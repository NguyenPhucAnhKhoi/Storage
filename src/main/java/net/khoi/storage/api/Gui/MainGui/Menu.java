package net.khoi.storage.api.Gui.MainGui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

import java.util.Iterator;

/**
 * This class represent bukkit inventory
 */
@SuppressWarnings("unused")
public interface Menu extends Cloneable, Iterable<Icon> {
    /**
     * Open this menu for player
     * @param player Player will be viewed
     */
    void open(Player player);

    /**
     * Close this menu for player
     * <br>Only work if player is viewing this menu
     * @param player Player will be closed
     */
    void close(Player player);

    /**
     * Get the title of gui
     * @return Title as string
     */
    String getTitle();

    /**
     * Set the title for this gui
     * @param title Title to set
     */
    void setTitle(String title);

    /**
     * Get the rows of gui
     * @return rows
     */
    int getRows();

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
     * Set update status for this gui
     * @param status Status to set
     */
    void setUpdate(boolean status);

    /**
     * Get the updater this menu hold
     * @return Updater was held by this menu
     */
    Updater getUpdater();

    /**
     * Check if the menu contains any icon matching the given this icon
     * @param icon Icon to check
     * @return True or false
     */
    boolean contains(Icon icon);

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
     * Get a hashmap contains all icons in this menu
     * <br>The key is slot, value is the icon
     * @return HashMap represent the menu
     */
    IconContainer getIcons();

    /**
     * Replace current menu's icons with another
     * @param icons New icons HashMap
     */
    void setIcons(IconContainer icons);

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
    Iterator<Icon> iterator();
}
