package net.danh.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event will be called with event that cause by players
 */
@SuppressWarnings("unused")
public class StoragePlayerEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancel;
    private Player player;

    /**
     * Constructor method
     * @param player Player causes this event
     */
    public StoragePlayerEvent(Player player) {
        this.player = player;
        this.cancel = false;
    }

    /**
     * Get the target player of this event
     * @return Player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Set the target player of this event
     * @param player Player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Implement method from bukkit event
     * @return HandlerList
     */
    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLERS;
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

    /**
     * Require method from spigot events api
     * @return HandlerList
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
