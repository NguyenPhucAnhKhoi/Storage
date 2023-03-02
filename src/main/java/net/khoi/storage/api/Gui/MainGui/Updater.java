package net.khoi.storage.api.Gui.MainGui;

import org.bukkit.entity.Player;

/**
 * This class represent update manager of a storage's menu object
 */
@SuppressWarnings("unused")
public interface Updater {
    /**
     * Get the interval between each update
     * @return Interval as long
     */
    long getInterval();

    /**
     * Set the interval between each update
     * @param interval Interval as long
     */
    void setInterval(long interval);

    /**
     * Get current status of update process
     * <br>Note: you can't start, stop or pause update if status is false
     * @return True or false
     */
    boolean getStatus();

    /**
     * Set the status of update process
     * <br>Note: you can't start, stop or pause update if status is false
     * @param status New status to replace
     */
    void setStatus(boolean status);

    /**
     * Start update process if it was stopped or paused
     * <br>Note: - This update section will be stopped when player close this menu
     * <br>      - This update section won't be started if player didn't open this menu
     * @param player Target player to start update section
     * @param period Time interval between each update
     */
    void startUpdate(Player player, long period);

    /**
     * Stop update process forever
     * <br>Note: - This update section will be stopped when player close this menu
     * <br>      - This update section won't be started if player didn't open this menu
     * @param player Target player to stop update section
     */
    void stopUpdate(Player player);

    /**
     * Pause update process for a certain interval
     * <br>Note: - This update section will be stopped when player close this menu
     * <br>      - This update section won't be started if player didn't open this menu
     * @param player Target player to pause update section
     * @param interval Update freeze interval
     */
    void pauseUpdate(Player player, long interval);
}
