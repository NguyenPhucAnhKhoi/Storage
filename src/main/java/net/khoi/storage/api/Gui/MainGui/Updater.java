package net.khoi.storage.api.Gui.MainGui;

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
     */
    void startUpdate();

    /**
     * Stop update process forever
     */
    void stopUpdate();

    /**
     * Pause update process for a certain interval
     * @param interval Update freeze interval
     */
    void pauseUpdate(long interval);
}
