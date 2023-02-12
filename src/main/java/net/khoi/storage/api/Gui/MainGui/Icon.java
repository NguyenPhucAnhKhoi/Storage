package net.khoi.storage.api.Gui.MainGui;

import net.khoi.storage.api.Gui.Action.Action;
import net.khoi.storage.api.Gui.PapiItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

/**
 * This class represent item stack contain in inventory (menu)
 */
@SuppressWarnings("unused")
public interface Icon {

    /**
     * The method to confirm type of icon (can not be overridden)
     * @param icon Icon to get type
     * @return Final type of icon
     */
    static Type getType(Icon icon) {
        if (icon instanceof Normal) return Type.NORMAL;
        if (icon instanceof Decorate) return Type.DECORATE;
        if (icon instanceof Button) return Type.BUTTON;
        return null;
    }
    /**
     * Normal icon class support papi
     */
    interface Normal extends Icon {
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
         * The hashmap contains click and actions will be executed for each click
         * @return HashMap of actions and clicks
         */
        HashMap<Click, List<Action>> getActions();

        /**
         * Set actions will be executed for this click
         * @param click Click to set
         * @param action Actions will be executed
         */
        void setAction(Click click, List<Action> action);

        /**
         * Set the hashmap contains click and actions will be executed
         * @param actions Hashmap of actions and clicks
         */
        void setAction(HashMap<Click, List<Action>> actions);

        /**
         * Executed instantly actions by this click
         * @param click Click
         */
        void executeAction(Click click);

        /**
         * Set update status for this icon
         * @param status True or false
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
         * The hashmap contains click and actions will be execute for each click
         * @return HashMap of actions and clicks
         */
        HashMap<Click, List<Action>> getActions();

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
         * @param item Item to set
         */
        void setItem(ItemStack item);

        /**
         * Set update status for this icon
         * @param status True or false
         */
        void setUpdate(Boolean status);
    }

    /**
     * List of icon types
     */
    enum Type {
        /**
         * Normal icon, can contains placeholderapi and execute actions when click
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
    }

    /**
     * List of icon click types
     */
    enum Click {
        /**
         * Press key drop while holding control
         */
        CONTROL_DROP,

        /**
         * Press the left mouse button twice in quick succession.
         */
        DOUBLE_CLICK,

        /**
         * Press key drop (default is Q)
         */
        DROP,

        /**
         * Left click (normal click)
         */
        LEFT,

        /**
         * Press middle click (Scroll-wheel click) [Untested]
         */
        @SuppressWarnings("untested")
        MIDDLE,

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
         * Right click
         */
        RIGHT,

        /**
         * Press left click while holding shift
         */
        SHIFT_LEFT,

        /**
         * Press right click while holding shift
         */
        SHIFT_RIGHT,

        /**
         * Press the offhand switch button (default is F)
         */
        SWAP_OFFHAND,

        /**
         * Other click don't list above
         */
        UNKNOWN
    }
}