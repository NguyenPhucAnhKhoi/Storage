package net.khoi.storage.api.Utils;

import org.bukkit.entity.Player;

/**
 * This class represent Input Catcher instance
 */
@SuppressWarnings("unused")
public interface InputCatcher {
    /**
     * Start catch input session fpr player
     * @param executor The code will be executed after player type input
     * @param player Player to catch input
     */
    void catchInput(Player player, InputExecute executor);

    /**
     * Execute after catch player's input
     */
    interface InputExecute {
        /**
         * Code execute
         * @param player Player type input
         * @param amount Amount of input player type
         */
        void execute(Player player, Integer amount);
    }
}
