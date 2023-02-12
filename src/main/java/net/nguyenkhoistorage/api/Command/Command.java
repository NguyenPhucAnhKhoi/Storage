package net.nguyenkhoistorage.api.Command;

import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * This class use to register custom command by parent command "/storage"
 */
@SuppressWarnings("unused")
public interface Command {
    /**
     * Get identifier name of this command
     * @return Command identifier name
     */
    String getCommand();

    /**
     * This command guide will be displayed when sender use /storage help
     * Example: "/storage example {argument 1} [argument 2]"
     * Note: Length of guide should be kept to a minimum
     *       You can not break lines in command guide
     *       You can use color codes
     *       {} is require; [] is optional
     * @return Command guide
     */
    String getCommandUse();

    /**
     * Get command description instance of this command
     * @return Command description instance
     */
    CommandDescription getCommandDescription();

    /**
     * Get the require permissions for sender to use this command
     * Note: sender has permission storage.* can use all command
     * include this command
     *       don't use color codes!
     * @return A list of all require permissions
     */
    List<String> getPermission();

    /**
     * The command executor, this method will be called when sender use command
     * @param sender The command sender
     * @param args Array of command arguments
     */
    void execute(CommandSender sender, String[] args);

    /**
     * The command tab completer, this method will be called when sender start
     * tab complete
     * @param sender The command sender
     * @param args Array of command arguments
     * @return List string of all contents will be display to sender
     */
     List<String> tabComplete(CommandSender sender, String[] args);

    /**
     * Check if command sender can use this command or not
     * @param sender Command sender to check
     * @return True or false
     */
     boolean canUse(CommandSender sender);

    /**
     * Check to show this command in parent command tab completer or not
     * Note: it irrelevant this command's tab completer
     * @param sender Command sender to check
     * @return Show if true and hide if false
     */
     boolean isShowTabCompleter(CommandSender sender);

    /**
     * Show this command in help list when sender use /storage help or not
     * @param sender Command sender to check
     * @return Show if true and hide if false
     */
     boolean isShowHelp(CommandSender sender);
}
