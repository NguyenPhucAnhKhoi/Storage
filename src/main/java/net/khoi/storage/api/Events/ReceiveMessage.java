package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * This event will be called when player received any type of message
 */
@SuppressWarnings("unused")
public class ReceiveMessage extends StoragePlayerEvent implements Cancellable {
    private String message;
    private String subMessage;
    private final MessageType type;
    private final HandlerList HANDLERS = new HandlerList();
    private boolean cancel;

    /**
     * Constructor method
     * @param receiver Player will be received message
     * @param message Message will be sent
     * @param subMessage Sub Message will be sent smaller and under than the message.
     * @param type Message Type
     */
    public ReceiveMessage(Player receiver, String message, String subMessage, MessageType type) {
        super(receiver);
        this.message = message;
        this.subMessage = subMessage;
        this.type = type;
    }

    /**
     * @return Get the message of this event
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Get the sub message of this event
     */
    public String getSubMessage() {
        return type == MessageType.TITLE ? subMessage : null;
    }

    /**
     * @return Get the message type of this event
     */
    public MessageType getType() {
        return type;
    }

    /**
     * Set the message for this event
     * @param message Message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Set the sub message for this event
     * <br>Sub message only available with title type
     * @param subMessage Sub message to set
     */
    public void setSubMessage(String subMessage) {
        this.subMessage = subMessage;
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
