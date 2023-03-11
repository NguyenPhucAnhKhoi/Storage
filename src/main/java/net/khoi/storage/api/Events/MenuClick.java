package net.khoi.storage.api.Events;

import net.khoi.storage.api.Gui.Action.Action;
import net.khoi.storage.api.Gui.MainGui.Icon;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.Inventory;

import java.util.List;

/**
 * This event will be called when player click in plugin menu
 */
@SuppressWarnings("unused")
public class MenuClick extends StoragePlayerEvent implements Cancellable {
    private final Inventory menu;
    private final int slot;
    private final Icon icon;
    private final Icon.Click click;
    private List<Action> action;
    private boolean cancel;

    /**
     * Constructor method
     * @param player Player clicked the menu
     * @param menu Menu as inventory was clicked by player
     * @param slot Slot was clicked by player
     * @param action Action will be executed when player click in icon
     * @param icon The icon was clicked by player
     * @param click Click type of this event
     */
    public MenuClick(Player player, Inventory menu, int slot, List<Action> action, Icon icon, Icon.Click click) {
        super(player);
        this.slot = slot;
        this.action = action;
        this.menu = menu;
        this.icon = icon;
        this.click = click;
    }

    /**
     * Get menu was clicked by player
     * @return Menu
     */
    public Inventory getMenu() {
        return menu;
    }

    /**
     * Get the slot was clicked by player
     * @return Slot as integer
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Get action will be executed
     * @return Action
     */
    public List<Action> getAction() {
        return action;
    }

    /**
     * Get icon was clicked by player
     * @return Icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Get the click type of this event
     * @return Icon Click
     */
    public Icon.Click getClick() {
        return click;
    }

    /**
     * Set the action will be executed
     * @param action Action to set
     */
    public void setAction(List<Action> action) {
        this.action = action;
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
