package net.danh.storage.api.Gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

/**
 * This class represent item stack contain in inventory (menu)
 */
@SuppressWarnings("unused")
public interface Icon {
    /**
     * Papi icon class
     */
    interface Papi extends Icon {
        /**
         * Parse papi for this icon
         * @param player Player to parse
         * @return Item was parsed papi
         */
         ItemStack parsePapi(Player player);

        /**
         * Set the item that icon represent
         */
         void setItem();

        /**
         * Get the item that icon represent
         * @return Bukkit item stack
         */
        PapiItemStack getItem();

        /**
         * The hashmap contains click and action execute
         * for each click
         * @return HashMap of actions and clicks
         */
        HashMap<Click, Action> getActions();

        /**
         * Set actions will be executed for this click
         * @param click Click to set
         * @param action Action will be executed
         */
        void setAction(Click click, Action action);

        /**
         * Set the hashmap contains click and action execute
         * @param actions Hashmap of actions and clicks
         */
        void setAction(HashMap<Click, Action> actions);

        /**
         * Executed instantly actions by this click
         * @param click Click
         */
        void executeAction(Click click);

        /**
         * Set update status for this icon
         * @param status True or flase
         */
        void setUpdate(Boolean status);

        /**
         * Set slot for this icon
         * @param slot Slot to set
         */
        void setSlot(int slot);

        /**
         * Set the storage name this icon represent
         * @param name The name of storage
         */
        void setName(String name);

        /**
         * Get current update status of this icon
         * @return True or false
         */
        boolean getUpdate();

        /**
         * Get current slot of this icon
         * @return Slot as integer
         */
        int getSlot();

        /**
         * Get storage name this icon represent
         * @return The name of storage
         */
        String getName();

        /**
         * The method to confirm type of icon (can not be ovveride)
         * @return Final type of icon
         */
        Type getType();
    }

    /**
     * Normal icon class
     */
    interface Normal extends Icon {
        /**
         * Set the item that icon represent
         */
        void setItem();

        /**
         * Get the item that icon represent
         * @return Bukkit item stack
         */
        ItemStack getItem();

        /**
         * The hashmap contains click and action execute
         * for each click
         * @return HashMap of actions and clicks
         */
        HashMap<Click, Action> getActions();

        /**
         * Set actions will be executed for this click
         * @param click Click to set
         * @param action Action will be executed
         */
        void setAction(Click click, Action action);

        /**
         * Set the hashmap contains click and action execute
         * @param actions Hashmap of actions and clicks
         */
        void setAction(HashMap<Click, Action> actions);

        /**
         * Executed instantly actions by this click
         * @param click Click
         */
        void executeAction(Click click);

        /**
         * Set slot for this icon
         * @param slot Slot to set
         */
        void setSlot(int slot);

        /**
         * Get current slot of this icon
         * @return Slot as integer
         */
        int getSlot();

        /**
         * The method to confirm type of icon (can not be ovveride)
         * @return Final type of icon
         */
        Type getType();
    }

    /**
     * Decorate icon class
     */
    interface Decorate extends Icon {
        /**
         * Set the item that icon represent
         */
        void setItem();

        /**
         * Get the item that icon represent
         * @return Bukkit item stack
         */
        ItemStack getItem();

        /**
         * Set slot for this icon
         * @param slot Slot to set
         */
        void setSlot(int slot);

        /**
         * Get current slot of this icon
         * @return Slot as integer
         */
        int getSlot();

        /**
         * The method to confirm type of icon (can not be ovveride)
         * @return Final type of icon
         */
        Type getType();
    }

    /**
     * Button icon class
     */
    interface Button extends Icon {
        /**
         * Get current slot of this icon
         * @return Slot as integer
         */
        int getSlot();

        /**
         * The hashmap contains click and action execute
         * for each click
         * @return HashMap of actions and clicks
         */
        HashMap<Click, Action> getActions();

        /**
         * Get the item that icon represent
         * @return Bukkit item stack
         */
        PapiItemStack getItem();

        /**
         * Get current update status of this icon
         * @return True or false
         */
        boolean getUpdate();

        /**
         * Set the item that icon represent
         */
        void setItem(ItemStack item);

        /**
         * Set update status for this icon
         * @param status True or flase
         */
        void setUpdate(Boolean status);

        /**
         * The method to confirm type of icon (can not be ovveride)
         * @return Final type of icon
         */
        Type getType();
    }

    enum Type {
        /**
         * Normal icon, execute actions when click
         */
        NORMAL,

        /**
         * Decorate icon, don't execute any actions
         */
        DECORATE,

        /**
         * Button icon, fixed function specified by the system
         */
        BUTTON,

        /**
         * PlaceholderAPI icon, like normal icon but contains
         * placeholderapi
         */
        PAPI
    }
    enum Click {
        /**
         * Left click (normal click)
         */
        LEFT,

        /**
         * Press left click while holding shift
         */
        SHIFT_LEFT,

        /**
         * Right click
         */
        RIGHT,

        /**
         * Press right click while holding shift
         */
        SHIFT_RIGHT,

        /**
         * Press key drop (default is Q)
         */
        DROP,

        /**
         * Press key drop while holding control
         */
        CONTROL_DROP,

        /**
         * Press the left mouse button twice in quick succession.
         */
        DOUBLE_CLICK,

        /**
         * Press the off hand switch button (default is F)
         */
        SWAP_OFFHAND,

        /**
         * Press the number key 1 (Default is 1)
         */
        NUMBER_1,

        /**
         * Press the number key 2 (Default is 2)
         */
        NUMBER_2,

        /**
         * Press the number key 3 (Default is 3)
         */
        NUMBER_3,

        /**
         * Press the number key 4 (Default is 4)
         */
        NUMBER_4,

        /**
         * Press the number key 5 (Default is 5)
         */
        NUMBER_5,

        /**
         * Press the number key 6 (Default is 6)
         */
        NUMBER_6,

        /**
         * Press the number key 7 (Default is 7)
         */
        NUMBER_7,

        /**
         * Press the number key 8 (Default is 8)
         */
        NUMBER_8,

        /**
         * Press the number key 9 (Default is 9)
         */
        NUMBER_9,

        /**
         * Press middle click (Scrollwheel click) [Untested]
         */
        @SuppressWarnings("untested")
        MIDDLE,

        /**
         * Other click don't list above
         */
        UNKNOWN
    }
}
