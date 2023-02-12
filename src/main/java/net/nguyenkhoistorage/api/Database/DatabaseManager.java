package net.nguyenkhoistorage.api.Database;

import java.util.List;

/**
 * Class use to manage databases
 */
@SuppressWarnings("unused")
public interface DatabaseManager {
    /**
     * Register custom database
     * @param database Database to register
     */
    void register(Database database);

    /**
     * Register custom database by List of databases
     * @param databases Databases to register
     */
    void register(List<Database> databases);

    /**
     * Unregister custom database
     * @param database Database to unregister
     */
    void unRegister(Database database);

    /**
     * Unregister custom database with specific name
     * @param name Name of database to unregister
     */
    void unRegister(String name);

    /**
     * Unregister all registered databases
     */
    void unRegisterAll();

    /**
     * Get list of registered databases
     * @return List of all databases
     */
    List<Database> getRegistered();

    /**
     * Get list of name of registered databases
     * @return List of name of all databases
     */
    List<String> getNames();

    /**
     * Get current database in use
     * @return Using database
     */
    Database getUse();

    /**
     * Get name of current database in use
     * @return Name of using database
     */
    String getUseName();
}
