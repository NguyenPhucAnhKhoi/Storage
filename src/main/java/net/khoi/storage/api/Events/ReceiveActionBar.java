package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when player received action bar message
 */
@SuppressWarnings("unused")
public class ReceiveActionBar extends ReceiveMessage implements Cancellable {
    /**
     * Constructor method
     * @param receiver Player will be received message
     * @param message Message will be sent
     */
    public ReceiveActionBar(Player receiver, String message) {
        super(receiver, message, "", MessageType.ACTION_BAR);
    }
}
