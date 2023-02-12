package net.khoi.storage.api.Economy;

import java.util.List;

/**
 * Class use to manage economies
 */
@SuppressWarnings("unused")
public interface EconomyManager {
    /**
     * Register custom economy
     * @param economy Economy to register
     */
    void register(Economy economy);

    /**
     * Register custom economy by List of economies
     * @param economies Economies to register
     */
    void register(List<Economy> economies);

    /**
     * Unregister custom economy
     * @param economy Economy to unregister
     */
    void unRegister(Economy economy);

    /**
     * Unregister custom economy with specific name
     * @param name Name of economy to unregister
     */
    void unRegister(String name);

    /**
     * Unregister all registered economy
     */
    void unRegisterAll();

    /**
     * Get list of registered economy
     * @return List of all economy
     */
    List<Economy> getRegistered();

    /**
     * Get list of name of registered economy
     * @return List of name of all economy
     */
    List<String> getNames();

    /**
     * Get current economy in use
     * @return Using economy
     */
    Economy getUse();

    /**
     * Get name of current economy in use
     * @return Name of using economy
     */
    String getUseName();
}
