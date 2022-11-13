package net.danh.storage.api.Gui.Button;

import net.danh.storage.api.Events.AutoType;
import net.danh.storage.api.Gui.Icon;
import net.danh.storage.api.Gui.PapiItemStack;
import org.bukkit.inventory.ItemStack;

/**
 * This class in one of default buttons by api
 */
@SuppressWarnings("unused")
public interface AutoButton extends Icon.Button {
    enum Auto {

    }
    @Override
    default PapiItemStack getItem() {
        /*Ignore*/
        return null;
    }
    @Override
    default void setItem(ItemStack item) {
        /*Ignore*/
    }

    /**
     * Get the normal Papi ItemStack by the status of auto mode
     * @param status Status of auto mode to get
     * @param type Type of auto mode to get
     * @return PlaceholderAPI ItemStack
     */
    PapiItemStack getNormalItem(Boolean status, AutoType type);

    /**
     * Get the cooldown Papi ItemStack by the status of auto mode
     * @param status Status of auto mode to get
     * @param type Type of auto mode to get
     * @return PlaceholderAPI ItemStack
     */
    PapiItemStack getCooldownItem(Boolean status, AutoType type);

    /**
     * Set the normal Papi ItemStack by the status of auto mode
     * @param item PlaceholderAPI ItemStack will be set
     * @param status Status of auto mode to set
     * @param type Type of auto mode to set
     */
    void setNormalItem(ItemStack item, Boolean status, AutoType type);

    /**
     * Set the cooldown Papi ItemStack by the status of auto mode
     * @param item PlaceholderAPI ItemStack will be set
     * @param status Status of auto mode to set
     * @param type Type of auto mode to set
     */
    void setCooldownItem(ItemStack item, Boolean status, AutoType type);

    /**
     * Check if this status of auto mode is cooldown or not
     * @param status Status of auto mode to check
     * @param type Type of auto mode to check
     * @return True or false
     */
    boolean isCooldown(Boolean status, AutoType type);

    /**
     * Get the cooldown time of this status of auto mode
     * @param type Type of auto mode to check
     * @param status Status of auto mode to check
     * @return Time as long (-1 if not in cooldown)
     */
    long getCooldown(Boolean status, AutoType type);

    /**
     * Set the cooldown time of this status of auto mode
     * @param time Time as long to set
     * @param status Status of auto mode to check
     * @param type Type of auto mode to check
     */
    void setCooldown(Long time, Boolean status, AutoType type);
}
