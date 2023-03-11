package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when api and player switch status of auto mode
 */
@SuppressWarnings("unused")
public class SwitchAuto extends StoragePlayerEvent implements Cancellable {
    private boolean status;
    private final AutoType type;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player will be switched mode
     * @param status Status will be switched
     * @param type Type of auto (Pickup or Smelt)
     */
    public SwitchAuto(Player player, Boolean status, AutoType type) {
        super(player);
        this.status = status;
        this.type = type;
    }

    /**
     * Get the status of auto mode will be switched
     * @return True or false
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Get the type of mode will be switched
     * @return Auto type
     */
    public AutoType getType() {
        return type;
    }

    /**
     * Set the status mode will be switched
     * @param status True or false
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return The event is cancelled or not
     */
    @Override
    public boolean isCancelled() {
        return this.cancel;
    }

    /**
     * Set the cancel status for this event
     * @param cancel True or false
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
