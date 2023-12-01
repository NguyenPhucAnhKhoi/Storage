package net.khoi.storage.api.Command;

import org.bukkit.command.CommandSender;

/**
 * This class represent a command description in a command instance
 */
@SuppressWarnings("unused")
public abstract class CommandDescription {
    private String description;

    /**
     * Constructor method
     *
     * This description will be displayed with guide when sender hover in command guide
     * Example: "Send chat to player"
     * Note: Length of description should be kept to a minimum
     *       Use '\n' to break lines
     *       You can use color codes
     *
     * @param description Description of this command
     */
    public CommandDescription(String description) {
        this.description = description;
    }

    /**
     * Get this command's description
     * @return The description as string
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Change this command's description to another
     * @param description Description will be updated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method will be called when player click in the command guide
     * @param sender The sender who clicked in command guide
     */
    public abstract void onClick(CommandSender sender);
}
