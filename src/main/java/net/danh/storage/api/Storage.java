package net.danh.storage.api;

import net.danh.storage.api.Database.Database;
import net.danh.storage.api.Database.DatabaseManager;
import net.danh.storage.api.Economy.Economy;
import net.danh.storage.api.Economy.EconomyManager;
import net.danh.storage.api.Utils.InputCatcher;
import org.bukkit.Bukkit;

/**
 * Class link plugin and api
 */
@SuppressWarnings("unused")
public final class Storage {
    /**
     * Storage API initialized
     */
    private static StorageAPI api;

    /**
     * Database Manager initialized
     */
    private static DatabaseManager database;

    /**
     * Economy Manager initialized
     */
    private static EconomyManager economy;

    /**
     * Input Catcher initialized
     */
    private static InputCatcher catcher;

    /**
     * Default databases (It is final, don't change that)
     */
    private static Database SQLITE;

    /**
     * Default economy (It is final, don't change that)
     */
    private static Economy VAULT;
    private static Economy PLAYER_POINTS;
    private static Economy TOKEN_MANAGER;


    /**
     * Initialize default databases and economy (System only)
     * @param sqlite Sqlite instance
     * @param vault Vault instance
     * @param player_points Player Points instance
     * @param token_manager Token Manager instance
     */
    private static void initializeDefault(Database sqlite, Economy vault, Economy player_points, Economy token_manager) {
        if (SQLITE == null) SQLITE = sqlite;
        if (VAULT == null) VAULT = vault;
        if (PLAYER_POINTS == null) PLAYER_POINTS = player_points;
        if (TOKEN_MANAGER == null) TOKEN_MANAGER = token_manager;
    }

    /**
     * Initialized storage api (System use only)
     * @param api Api to initialize
     */
    private static void setStorageAPI(StorageAPI api) {
        if (Storage.api == null) {
            Storage.api = api;
        }
    }

    /**
     * Initialized database manager (System use only)
     * @param database Database to initialize
     */
    private static void setDatabaseManager(DatabaseManager database) {
        if (Storage.database == null) {
            Storage.database = database;
        }
    }

    /**
     * Initialized input catcher (System use only)
     * @param catcher Input Catcher to initialize
     */
    private static void setInputCatcher(InputCatcher catcher) {
        if (Storage.catcher == null) {
            Storage.catcher = catcher;
        }
    }

    /**
     * Initialized economy manager (System use only)
     * @param economy Economy to initialize
     */
    private static void setEconomyManager(EconomyManager economy) {
        if (Storage.economy == null) {
            Storage.economy = economy;
        }
    }

    /**
     * Check if API is initialized or not
     * @return True or false
     */
    private static boolean isInitialized() {
        return api != null && database != null && catcher != null && economy != null;
    }

    /**
     * Initialized API (System use only)
     * @param api StorageAPI to initialize
     * @param catcher Input Catcher to initialize
     * @param database Database Manager to initialize
     * @param economy Economy Manager to initialize
     * @param vault Default Vault Economy
     * @param points Default Player Points Economy
     * @param tokens Default Tokens Economy
     * @param sqlite Default SQLite Database
     */
    public static void initialize(StorageAPI api, InputCatcher catcher, DatabaseManager database, EconomyManager economy, Economy vault, Economy points, Economy tokens, Database sqlite) {
        if (Bukkit.getPluginManager().getPlugin("Storage") != null) {
            if (!isInitialized()) {
                setStorageAPI(api);
                setInputCatcher(catcher);
                setDatabaseManager(database);
                initializeDefault(sqlite, vault, points, tokens);
            } else throw new UnsupportedOperationException("Can not to initialize StorageAPI again");
        } else throw new UnsupportedOperationException("Can not find plugin Storage to setup API");
    }

    /**
     * Get storage api instance
     * @return Instance of StorageAPI
     */
    public static StorageAPI getStorageAPI() {
        return api;
    }

    /**
     * @return instance of economy vault
     */
    public static Economy vault() {
        return VAULT;
    }

    /**
     * @return instance of economy player points
     */
    public static Economy player_points() {
        return PLAYER_POINTS;
    }

    /**
     * @return instance of economy token manager
     */
    public static Economy token_manager() {
        return TOKEN_MANAGER;
    }

    /**
     * @return instance of database sqlite
     */
    public static Database sqlite() {
        return SQLITE;
    }

    /**
     * Get database manager instance
     * @return Instance of DatabaseManager
     */
    public static DatabaseManager getDatabaseManager() {
        return database;
    }

    /**
     * Get economy manager instance
     * @return Instance of EconomyManager
     */
    public static EconomyManager getEconomyManager() {
        return economy;
    }

    /**
     * Get the input catcher instance
     * @return Instance of InputCatcher
     */
    public static InputCatcher getCatcher() {
        return catcher;
    }

    /**
     * Get the parent command of api
     * @return Always is "storage"
     */
    public static String getParentCommand() {
        return "storage";
    }
}
