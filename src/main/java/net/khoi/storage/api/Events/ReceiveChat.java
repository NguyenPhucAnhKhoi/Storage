package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when player received chat message
 */
@SuppressWarnings("unused")
public class ReceiveChat extends ReceiveMessage {
    /**
     * Constructor method
     * @param receiver Player will be received message
     * @param message Message will be sent
     */
    public ReceiveChat(Player receiver, String message) {
        super(receiver, message, "", MessageType.CHAT);
    }
}
