package net.khoi.storage.api.Gui.MainGui;

import net.khoi.storage.api.Gui.Action.Action;
import net.khoi.storage.api.Gui.MenuOptions;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

import java.util.HashMap;
import java.util.List;

/**
 * Menu API Class
 */
@SuppressWarnings("unused")
public interface MenuAPI {
    /**
     * Load custom menu from a file config and by path
     * @param config Config file to load menu
     * @param options Options of loader
     * @return Menu was loaded
     */
    Menu loadMenu(YamlConfiguration config, MenuOptions options);

    /**
     * Save the specific menu to a config file
     * @param config Config file to paste
     * @param options Options of paster
     * @param menu Menu will be pasted
     */
    void saveMenu(YamlConfiguration config, MenuOptions options, Menu menu);

    /**
     * Get custom default menu for all players
     * @return The default menu
     */
    Menu getDefaultMenu();

    /**
     * Get custom default menu for specific player
     * @param player Player to get default menu
     * @return Get the default menu of specific player
     */
    Menu getPlayerMenu(Player player);

    /**
     * Set custom default menu for all players
     * @param menu Menu will be set as default
     */
    void setDefaultMenu(Menu menu);

    /**
     * Create new updater instance with custom interval
     * @param interval The interval time between every process
     * @return New updater was created
     */
    Updater createUpdater(long interval);

    /**
     * Create new menu instance
     * @return New menu was created
     */
    Menu createMenu();

    /**
     * Create new menu instance with custom size
     * @param size Size as integer to create
     * @return New menu was created
     */
    Menu createMenu(Integer size);

    /**
     * Create new menu instance with custom inventory type
     * @param type Bukkit inventory type to create
     * @return New menu was created
     */
    Menu createMenu(InventoryType type);

    /**
     * Create new menu instance with custom title
     * @param title Title to create
     * @return New menu was created
     */
    Menu createMenu(String title);

    /**
     * Create new menu instance with custom size and title
     * @param size Size as integer to create
     * @param title Title to create
     * @return New menu was created
     */
    Menu createMenu(Integer size, String title);

    /**
     * Create new menu instance with custom size and title
     * @param type Bukkit inventory type to create
     * @param title Title to create
     * @return New menu was created
     */
    Menu createMenu(InventoryType type, String title);

    /**
     * Create new normal icon instance with custom material
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @return New normal icon was created
     */
    Icon.Normal createNormalIcon(Material material, Integer slot);

    /**
     * Create new normal icon instance with custom material
     * <br>Note: variables can contain placeholders
     * @param material Bukkit material as string to create
     * @param slot Slot as string to create
     * @return New normal icon was created
     */
    Icon.Normal createNormalIcon(String material, String slot);

    /**
     * Create new decorate icon instance with custom material
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @return New decorate icon was created
     */
    Icon.Decorate createDecorateIcon(Material material, Integer slot);

    /**
     * Create new button icon instance with custom material
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    Icon.Button createButtonIcon(Material material, Integer slot, HashMap<Icon.Click, List<Action>> actions);

    /**
     * Create new button icon instance with custom material
     * <br>Note: variables can contain placeholders
     * @param material Bukkit material  to create
     * @param slot Slot as integer to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    Icon.Button createButtonIcon(String material, String slot, HashMap<Icon.Click, List<Action>> actions);

    /**
     * Create new normal icon instance with custom material, amount
     * <br>Note: variables can contain placeholders
     * @param material Bukkit material as string to create
     * @param slot Slot as string to create
     * @param amount Amount as string to create
     * @return New normal icon was created
     */
    Icon.Normal createNormalIcon(String material, String slot, String amount);

    /**
     * Create new normal icon instance with custom material, amount
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @return New normal icon was created
     */
    Icon.Normal createNormalIcon(Material material, Integer slot, Integer amount);

    /**
     * Create new decorate icon instance with custom material, amount
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @return New decorate icon was created
     */
    Icon.Decorate createDecorateIcon(Material material, Integer slot, Integer amount);

    /**
     * Create new button icon instance with custom material, amount
     * <br>Note: variables can contain placeholders
     * @param material Bukkit material as string to create
     * @param slot Slot as string to create
     * @param amount Amount as string to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    Icon.Button createButtonIcon(String material, String slot, String amount, HashMap<Icon.Click, List<Action>> actions);

    /**
     * Create new button icon instance with custom material, amount
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    Icon.Button createButtonIcon(Material material, Integer slot, Integer amount, HashMap<Icon.Click, List<Action>> actions);

    /**
     * Create new normal icon instance with custom material, amount and damage
     * <br>Note: - variables can contain placeholders
     * <br>      - only use in legacy versions, it can cause error if use in newer versions
     * @param material Bukkit material as string to create
     * @param slot Slot as string to create
     * @param amount Amount as string to create
     * @param damage Damage as string to create
     * @return New normal icon was created
     */
    @Deprecated()
    Icon.Normal createNormalIcon(String material, String slot, String amount, String damage);

    /**
     * Create new normal icon instance with custom material, amount and damage
     * <br>Note: Only use in legacy versions, it can cause error if use in newer versions
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @param damage Damage as short to create
     * @return New normal icon was created
     */
    @Deprecated()
    Icon.Normal createNormalIcon(Material material, Integer slot, Integer amount, Short damage);

    /**
     * Create new decorate icon instance with custom material, amount and damage
     * <br>Note: Only use in legacy versions, it can cause error if use in newer versions
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @param damage Damage as short to create
     * @return New decorate icon was created
     */
    @Deprecated()
    Icon.Decorate createDecorateIcon(Material material, Integer slot, Integer amount, Short damage);

    /**
     * Create new button icon instance with custom material, amount and damage
     * <br>Note: - variables can contain placeholders
     * <br>      - only use in legacy versions, it can cause error if use in newer versions
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @param damage Damage as short to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    @Deprecated()
    Icon.Button createButtonIcon(String material, String slot, String amount, String damage, HashMap<Icon.Click, List<Action>> actions);

    /**
     * Create new button icon instance with custom material, amount and damage
     * <br>Note: Only use in legacy versions, it can cause error if use in newer versions
     * @param material Bukkit material to create
     * @param slot Slot as integer to create
     * @param amount Amount as integer to create
     * @param damage Damage as short to create
     * @param actions Actions executor to create
     * @return New button icon was created
     */
    @Deprecated()
    Icon.Button createButtonIcon(Material material, Integer slot, Integer amount, Short damage, HashMap<Icon.Click, List<Action>> actions);
}
