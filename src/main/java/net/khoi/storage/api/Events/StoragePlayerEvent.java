package net.khoi.storage.api.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * This event will be called with event that cause by players
 */
@SuppressWarnings("unused")
public class StoragePlayerEvent extends PlayerEvent {
    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player causes this event
     */
    public StoragePlayerEvent(Player player) {
        super(player);
        this.cancel = false;
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
     * Require method from spigot events api
     * @return HandlerList
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
