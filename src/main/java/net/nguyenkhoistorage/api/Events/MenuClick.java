package net.nguyenkhoistorage.api.Events;

import net.nguyenkhoistorage.api.Gui.Icon;
import net.nguyenkhoistorage.api.Gui.Menu;
import org.bukkit.entity.Player;

/**
 * This event will be called when player click in plugin menu
 */
@SuppressWarnings("unused")
public class MenuClick extends StoragePlayerEvent {
    private final Menu menu;
    private Icon icon;
    private Icon.Click click;

    /**
     * Constructor method
     * @param player Player clicked the menu
     * @param menu Menu was clicked by player
     * @param icon The icon was clicked by player
     * @param click Click type of this event
     */
    public MenuClick(Player player, Menu menu, Icon icon, Icon.Click click) {
        super(player);
        this.menu = menu;
        this.icon = icon;
        this.click = click;
    }

    /**
     * Get menu was clicked by player
     * @return Menu
     */
    public Menu getMenu() {
        return menu;
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
     * Set the click type of this event
     * @param click Icon Click to set
     */
    public void setClick(Icon.Click click) {
        this.click = click;
    }
}
