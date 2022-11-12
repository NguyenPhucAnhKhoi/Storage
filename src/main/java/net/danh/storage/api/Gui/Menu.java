package net.danh.storage.api.Gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

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
     * Set the title of gui
     * @param title The title to set
     */
    void setTitle(String title);

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
    boolean getUpdate();

    /**
     * Get The duration of a update cycle
     * @return Miliseconds
     */
    long getUpdateTime();

    /**
     * Get array contains all normal icons of gui
     * @return Icon array
     */
    Icon[] getNIcons();

    /**
     * Get array contains all decorate icons of gui
     * @return Icon array
     */
    Icon[] getDIcons();

    /**
     * Get array contains all button icons of gui
     * @return Icon array
     */
    Icon[] getBIcons();

    /**
     * Get array contains all papi icons of gui
     * @return Icon array
     */
    Icon[] getPIcons();

    /**
     * Get the item stack aray of normal icons for load the gui
     * @return Item stack array
     */
    ItemStack[] getNormal();

    /**
     * Get the item stack aray of decorate icons for load the gui
     * @return Item stack array
     */
    ItemStack[] getDecorate();

    /**
     * Get the item stack aray of papi icons for load the gui
     * @return Item stack array
     */
    ItemStack[] getPapi();

    /**
     * Get the item stack aray of button icons for load the gui
     * @return Item stack array
     */
    ItemStack[] getButton();

    /**
     * Implement method of iterator class
     * @return Iterator
     */
    @Override
    Iterator<Icon> iterator();
}
