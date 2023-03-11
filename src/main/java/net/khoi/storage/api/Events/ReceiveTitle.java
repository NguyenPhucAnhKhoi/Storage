package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when player received title message
 */
@SuppressWarnings("unused")
public class ReceiveTitle extends ReceiveMessage {
    /**
     * Constructor method
     * @param receiver Player will be received message
     * @param message Message will be sent
     * @param subMessage Sub Message will be sent smaller and under than the message.
     */
    public ReceiveTitle(Player receiver, String message, String subMessage) {
        super(receiver, message, subMessage, MessageType.TITLE);
    }
}
