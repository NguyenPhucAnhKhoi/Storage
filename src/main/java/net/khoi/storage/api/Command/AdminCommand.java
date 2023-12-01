package net.khoi.storage.api.Command;

import java.util.Collections;

/**
 * This class use to register custom admin command from predefined format
 */
@SuppressWarnings("unused")
public abstract class AdminCommand extends Command {

    /**
     * Constructor method
     *
     * This command instance represent as a sub admin command of main command "/storage"
     * You can add your custom sub command by register this interface in command manager
     *
     * @param command Identifier name of this command (must be unique)
     * @param use Guide/Usage for this command to help user know how to use this command
     * @param description Description of this command execution
     */
    public AdminCommand(String command, String use, CommandDescription description) {
        super(command, use, description, Collections.singletonList("storage." + command.toLowerCase()));
    }

    @Override
    public boolean isShowTabCompleter() {
        return true;
    }

    @Override
    public boolean isShowHelp() {
        return true;
    }
}
