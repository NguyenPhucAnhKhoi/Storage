package net.khoi.storageapi.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * This event will be called when player received chat message
 */
@SuppressWarnings("unused")
public class ReceiveChat extends ReceiveMessage implements Cancellable {
    /**
     * Constructor method
     * @param receiver Player will be received message
     * @param message Message will be sent
     */
    public ReceiveChat(Player receiver, String message) {
        super(receiver, message, "", MessageType.CHAT);
    }
}
