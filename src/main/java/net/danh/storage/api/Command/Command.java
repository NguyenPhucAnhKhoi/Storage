package net.danh.storage.api.Command;

import org.bukkit.command.CommandSender;

/**
 * This class use to register custom command by parent command "/storage"
 */
@SuppressWarnings("unused")
public interface Command {
    /**
     * The default execute for all command sender
     * @param sender The command sender
     * @param args Array of command arguments
     */
    void execute(CommandSender sender, String[] args);
}
