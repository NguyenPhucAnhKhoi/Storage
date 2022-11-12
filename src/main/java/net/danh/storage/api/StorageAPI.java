package net.danh.storage.api;

import net.danh.storage.api.Command.Command;
import net.danh.storage.api.Database.Database;
import net.danh.storage.api.Files.ConfigManager;
import net.danh.storage.api.Gui.Icon;
import net.danh.storage.api.Gui.LoadOptions;
import net.danh.storage.api.Gui.Menu;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

import java.io.File;
import java.util.List;

/**
 * Main API Class
 */
@SuppressWarnings("unused")
public interface StorageAPI {
    /**
     * Load custom menu from a file config and by path
     * @param path Path to load menu
     * @param config Config file to load menu
     * @param options Options of loader
     * @return Menu was loaded
     */
    Menu loadMenu(String path, YamlConfiguration config, LoadOptions options);

    /**
     * Get custom default menu for all players
     */
    Menu getDefaultMenu();

    /**
     * Get custom default menu for specific player
     * @param player Player to get default menu
     */
    Menu getPlayerMenu(Player player);

    /**
     * Set custom default menu for all players
     * @param menu Menu will be setted as default
     */
    void setDefaultMenu(Menu menu);

    /**
     * Set custom default menu for specific player
     * @param player Player to set default menu
     * @param menu Menu will be setted as default
     */
    void setPlayerMenu(Player player, Menu menu);

    /**
     * Get Material of resources this storage store
     * @param name Name of storage to get informations
     * @return Bukkit Material
     */
    Material getMaterial(String name);

    /**
     * Get the amount used space of this storage
     * @param player Player to get informations
     * @param name Name of storage to get informations
     * @return Amount as integer
     */
    int getStorage(Player player, String name);

    /**
     * Get the percent used space of this storage
     * @param player Player to get informations
     * @param name Name of storage to get informations
     * @return Percent as integer
     */
    int getStoragePercent(Player player, String name);

    /**
     * Get the amount remaining empty space of this storage
     * @param player Player to get informations
     * @param name Name of storage to get informations
     * @return Amount as integer
     */
    int getEmpty(Player player, String name);

    /**
     * Get the percent remaining empty space of this storage
     * @param player Player to get informations
     * @param name Name of storage to get informations
     * @return Percent as integer
     */
    int getEmptyPercent(Player player, String name);

    /**
     * Get max amount of resources this storage can store
     * @param player Player to get informations
     * @param name Name of storage to get informations
     * @return Amount as integer
     */
    int getMaxStorage(Player player, String name);

    /**
     * Set custom amount resources for this player storage
     * @param player Player will be setted
     * @param name Name of storage to set
     * @param amount Amount to set
     */
    void setStorage(Player player, String name, Integer amount);

    /**
     * Direct add custom amount resources to this player storage
     * @param player Player will be added resources
     * @param name Name of storage to add
     */
    void addStorage(Player player, String name, Integer amount);

    /**
     * Direct add resources until reached the max storage
     * @param player Player will be added resources
     * @param name Name of storage to add
     */
    void addAllStorage(Player player, String name);

    /**
     * Add custom amount resources to storage by taken item from player inventory
     * @param player Player will be added resources
     * @param name Name of storage to add
     * @param amount Amount of resources to add
     */
    void addIStorage(Player player, String name, Integer amount);

    /**
     * Add all resources to storage by taken item from player inventory
     * @param player Player will be added all resources
     * @param name Name of storage to add all
     */
    void addIAllStorage(Player player, String name);

    /**
     * Direct remove custom amount resources out of this player storage
     * @param player Player will be removed resources
     * @param name Name of storage to remove
     * @param amount Amount of resources to remove
     */
    void removeStorage(Player player, String name, Integer amount);

    /**
     * Direct remove all resources out of this player storage
     * @param player Player will be removed all resources
     * @param name Name of storage to remove all
     */
    void removeAllStorage(Player player, String name);

    /**
     * Take custom amount resources from specific storage for this player
     * The amount will be limited by empty slot this player has
     * @param player Player will be taken resources
     * @param name Name of storage to take
     */
    void takeIStorage(Object player, String name, Object amount);

    /**
     * Take all resources from specific storage for this player
     * The amount will be limited by empty slot this player has
     * @param player Player will be taken resources
     * @param name Name of storage to take all
     */
    void takeIAllStorage(Player player, String name);

    /**
     * Sell custom amount resources in specific storage of this player
     * @param player Player will be sold resources
     * @param name Name of storage to sell
     */
    void sellStorage(Player player, String name, Integer amount);

    /**
     * Sell all resources in specific storage of this player
     * @param player Player will be sold resources
     * @param name Name of storage to sell all
     */
    void selllAllStorage(Player player, String name);

    /**
     * Set custom amount max space for this player
     * @param player Player will be setted
     * @param name Name of storage to set
     * @param amount Amount to set
     */
    void setMaxStorage(Player player, String name, Integer amount);

    /**
     * Add custom amount max space for this player
     * @param player Player will be added
     * @param name Name of storage to add
     * @param amount Amount to add
     */
    void addMaxStorage(Player player, String name, Integer amount);

    /**
     * Remove custom amount max space for this player
     * @param player Player will be removed
     * @param name Name of storage to remove
     * @param amount Amount to remove
     */
    void removeMaxStorage(Player player, String name, Integer amount);

    /**
     * Get amount of the total all storages used space
     * @param player Player to get informations
     * @return Amount as integer
     */
    int getTStorage(Player player);

    /**
     * Get amount of the total all storages max space
     * @param player Player to get informations
     * @return Amount as integer
     */
    int getTMaxStorage(Player player);

    /**
     * Get amount of the total  all storages remaining space
     * @param player Player to get informations
     * @return Amount as integer
     */
    int getTEmpty(Player player);

    /**
     * Get the percent of total all storages used space
     * @param player Player to get informations
     * @return Percent as integer
     */
    int getTStoragePercent(Player player);

    /**
     * Get the percent of total all storages remaining empty space
     * @param player Player to get informations
     * @return Percent as integer
     */
    int getTEmptyPercent(Player player);

    /**
     * Get auto smelt mode of this player
     * @param player Player to get
     * @return True or false
     */
    boolean getSmelt(Player player);

    /**
     * Get auto pickup mode of this player
     * @param player Player to get
     * @return True or false
     */
    boolean getPickup(Player player);

    /**
     * Set auto smelt mode for this player
     * @param player Player will be setted
     * @param status True or false
     */
    void setSmelt(Player player, Boolean status);

    /**
     * Set auto pickup mode for this player
     * @param player Player will be setted
     * @param status True or false
     */
    void setPickup(Player player, Boolean status);

    /**
     * Get all players list in databases
     * @return List of players
     */
    List<Player> getPlayers();

    /**
     * Check if server have plugin PlahceholderAPI or not
     * @return True or false
     */
    boolean getPapiStatus();

    /**
     * Calculate the amount of resource recieve by the material and fortune level
     * @param level Level of fortune enchantment
     * @param material Material to calculate
     * @return Amount of resource will be recieved as integer
     */
    int vanillaFortune(int level, Material material);

    /**
     * Send action bar message to player
     * @param player Player will be recieved action bar
     * @param message Message will be sent
     */
    void sendActionbar(Player player, String message);

    /**
     * Send title message to player
     * @param player Player will be recieved title
     * @param message Message will be sent
     * @param subMessage Sub message will be sent
     * @param fadeIn Time the title fade in
     * @param stay Time the title exist
     * @param fadeOut Time the title fade out
     */
    void sendTitle(Player player, String message, String subMessage, Integer fadeIn, Integer stay, Integer fadeOut);

    /**
     * Register custom database
     * @param database Database to register
     */
    void register(Database database);

    /**
     * Unregister custom command
     * @param command Command to unregister
     * @param name Unique name of custom command
     * if it duplicates this will be replaced
     */
    void unRegister(Command command, String name);

    /**
     * Unregister custom command with specific name
     * @param name Name of command to unregister
     */
    void unRegister(String name);

    /**
     * Unregister all registered commands
     */
    void unRegisterAll();

    /**
     * Get list of registered commands
     * @return List of all commands
     */
    List<Command> getRegistered();

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
     * Create new icon instance with custom material
     * @param material Bukkit material to create
     * @return New icon was created
     */
    Icon createIcon(Material material);

    /**
     * Create new icon instance with custom material, amount
     * @param material Bukkit material to create
     * @param amount Amount as integer to create
     * @return New icon was created
     */
    Icon createIcon(Material material, Integer amount);

    /**
     * Create new icon instance with custom material, amount and damage
     * @param material Bukkit material to create
     * @param amount Amount as integer to create
     * @param damage Danage as short to create
     * @return New icon was created
     */
    Icon createIcon(Material material, Integer amount, Short damage);

    /**
     * Create new config manager with custom path
     * @param path Path of file to create
     * @return New config manager was created
     */
    ConfigManager createConfig(String path);

    /**
     * Create new config manager with io file
     * @param file Java io file to create
     * @return New config manager was created
     */
    ConfigManager createConfig(File file);

    /**
     * Create new config manager with bukkit yaml config file
     * @param config Bukkit yaml config file to create
     * @return New config manager was created
     */
    ConfigManager createConfig(YamlConfiguration config);
}
