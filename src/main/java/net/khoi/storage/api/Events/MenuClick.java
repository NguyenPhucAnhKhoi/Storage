package net.khoi.storage.api.Events;

import net.khoi.storage.api.Gui.Action.Action;
import net.khoi.storage.api.Gui.MainGui.Icon;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
/**
 * This event will be called when player click in plugin menu
 */
@SuppressWarnings("unused")
public class MenuClick extends StoragePlayerEvent {
    private final Inventory menu;
    private Icon icon;
    private Icon.Click click;
    private Action action;

    /**
     * Constructor method
     * @param player Player clicked the menu
     * @param menu Menu as inventory was clicked by player
     * @param action Action will be executed when player click in icon
     * @param icon The icon was clicked by player
     * @param click Click type of this event
     */
    public MenuClick(Player player, Inventory menu, Action action, Icon icon, Icon.Click click) {
        super(player);
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
     * Get action will be executed
     * @return Action
     */
    public Action getAction() {
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
     * Set the icon that player was clicked
     * @param icon Icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * Set the action will be executed
     * @param action Action to set
     */
    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * Set the click type of this event
     * @param click Icon Click to set
     */
    public void setClick(Icon.Click click) {
        this.click = click;
    }
}
