package net.khoi.storage.api.Command;

import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This class use to register custom command by parent command "/storage"
 */
@SuppressWarnings("unused")
public abstract class Command {
    private final String command;
    private final String use;
    private final UUID uuid;
    private final CommandDescription description;
    private final List<String> permissions;

    /**
     * Constructor method
     *
     * This command instance represent as a sub command of main command "/storage"
     * You can add your custom sub command by register this interface in command manager
     *
     * @param command Identifier name of this command (must be unique)
     * @param use Guide/Usage for this command to help user know how to use this command
     * @param description Description of this command execution
     */
    public Command(String command, String use, CommandDescription description) {
        this.uuid = UUID.randomUUID();
        this.command = command;
        this.use = use;
        this.description = description;
        this.permissions = new ArrayList<>();
    }

    /**
     * Constructor method
     *
     * This command instance represent as a sub command of main command "/storage"
     * You can add your custom sub command by register this interface in command manager
     *
     * @param command Identifier name of this command (must be unique)
     * @param use Guide/Usage for this command to help user know how to use this command
     * @param description Description of this command execution
     * @param permissions Permissions require for user to use this command
     */
    public Command(String command, String use, CommandDescription description, List<String> permissions) {
        this.uuid = UUID.randomUUID();
        this.command = command;
        this.use = use;
        this.description = description;
        this.permissions = permissions;
    }

    /**
     * Get the unique id auto generated when create command
     * @return UUID of this command
     */
    public UUID getUUID() {
        return this.uuid;
    }

    /**
     * Get identifier name of this command
     * @return Command identifier name
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * This command guide will be displayed when sender use /storage help
     * Example: "/storage example {argument 1} [argument 2]"
     * Note: Length of guide should be kept to a minimum
     *       You can not break lines in command guide
     *       You can use color codes
     *       {} is require; [] is optional
     *       {} is require; [] is optional
     * @return Command guide
     */
    public String getCommandUse() {
        return this.use;
    }

    /**
     * Get command description instance of this command
     * @return Command description instance
     */
    public CommandDescription getCommandDescription() {
        return this.description;
    }

    /**
     * Get the require permissions for sender to use this command
     * Note: sender has permission storage.* can use all command
     * include this command
     * don't use color codes!
     * @return A list of all require permissions
     */
    public List<String> getPermission() {
        return this.permissions;
    }

    /**
     * The command executor, this method will be called when sender use command
     * @param sender The command sender
     * @param args Array of command arguments
     */
    public abstract void execute(CommandSender sender, String[] args);

    /**
     * The command tab completer, this method will be called when sender start
     * tab complete
     * @param sender The command sender
     * @param args Array of command arguments
     * @return List string of all contents will be display to sender
     */
     public abstract List<String> tabComplete(CommandSender sender, String[] args);

    /**
     * Show tab completer for this command or not
     * @return Show if true and hide if false
     */
     public abstract boolean isShowTabCompleter();

    /**
     * Show this command in help list when sender use /storage help or not
     * @return Show if true and hide if false
     */
     public abstract boolean isShowHelp();
}
