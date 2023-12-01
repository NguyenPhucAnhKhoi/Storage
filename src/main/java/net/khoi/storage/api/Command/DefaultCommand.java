package net.khoi.storage.api.Command;

/**
 * This class use to register custom default command from predefined format
 */
@SuppressWarnings("unused")
public abstract class DefaultCommand extends Command {

    /**
     * Constructor method
     *
     * This command instance represent as a default sub command of main command "/storage"
     * You can add your custom sub command by register this interface in command manager
     *
     * @param command Identifier name of this command (must be unique)
     * @param use Guide/Usage for this command to help user know how to use this command
     * @param description Description of this command execution
     */
    public DefaultCommand(String command, String use, CommandDescription description) {
        super(command, use, description);
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
