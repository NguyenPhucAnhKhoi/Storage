package net.khoi.storage.api.Gui.MainGui;

/**
 * This class represent the place which store the icons of menu
 */
@SuppressWarnings("unused")
public interface IconContainer {
    /**
     * Get the icon this slot
     * @param slot Slot to get
     * @return Icon was stored
     */
    Icon get(int slot);

    /**
     * Check if menu contains this icon or not
     * @param icon Icon to check
     * @return True or false
     */
    boolean contains(Icon icon);

    /**
     * Set or replace this icon into this slot in menu
     * @param slot Slot to put or replace
     * @param icon Icon will be set into
     */
    void set(int slot, Icon icon);

    /**
     * Clear all icon was stored in this container
     */
    void clear();

    /**
     * Get the first empty index of this container
     * @return First empty index as integer
     */
    int firstEmpty();

    /**
     * Get the first index stored icon match given icon
     * @param icon Icon to match for
     * @return First index matched as integer
     */
    int first(Icon icon);
}
