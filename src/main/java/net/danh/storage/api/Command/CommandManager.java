package net.danh.storage.api.Command;

import java.util.List;

@SuppressWarnings("unused")
public interface CommandManager {
    /**
     * Register custom command
     * @param command Database to register
     */
    void register(Command command);

    /**
     * Unregister custom command
     * @param command Command to unregister
     * if it duplicates this will be replaced
     */
    void unRegister(Command command);

    /**
     * Unregister custom command with specific name
     * @param name Name of command to unregister
     */
    void unRegister(String name);

    /**
     * Unregister all registered commands
     */
    void unRegisterAll();

    /**
     * Get list of registered commands
     * @return List of all commands
     */
    List<Command> getRegistered();

    /**
     * Get list of name of registered commands
     * @return List of name of all commands
     */
    List<String> getNames();
}
