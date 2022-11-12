package net.danh.storage.api.Gui;

import net.danh.storage.api.Storage;
import net.danh.storage.api.StorageAPI;
import net.danh.storage.api.Utils.InputCatcher;
import org.bukkit.entity.Player;

/**
 * Action types class instance
 */
@SuppressWarnings("unused")
public class Action implements ActionExecute {
    private static final StorageAPI INSTANCE = Storage.getStorageAPI();
    private static final InputCatcher CATCHER = Storage.getCatcher();

    /**
     * Default method, Ignored
     * @param player Ignored
     * @param name Ignored
     */
    @Override
    public void run(Player player, String name) {
        /* Ignore */
    }

    /**
     * Custom action, declare by users
     */
    public static abstract class Custom extends Action implements ActionExecute {
        public abstract void run(Player player);
    }

    /**
     * Take 1 resource from storage
     */
    public static class Take extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.takeIStorage(player, name, 1);
        }
    }

    /**
     * Take custom amount resources from storage
     */
    public static class TakeAmount extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            CATCHER.catchInput(player, (p, amount) -> INSTANCE.takeIStorage(p, name, amount));
        }
    }

    /**
     * Take all resuorces from storage
     */
    public static class TakeAll extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.takeIAllStorage(player, name);
        }
    }

    /**
     * Add 1 resource from storage
     */
    public static class Add extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.addIStorage(player, name, 1);
        }
    }

    /**
     * Add custom amount resources from storage
     */
    public static class AddAmount extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            CATCHER.catchInput(player, (p, amount) -> INSTANCE.addIStorage(p, name, amount));
        }
    }

    /**
     * Add all resuorces from storage
     */
    public static class AddAll extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.addIAllStorage(player, name);
        }
    }

    /**
     * Sell 1 resource from storage
     */
    public static class Sell extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.sellStorage(player, name, 1);
        }
    }

    /**
     * Sell custom amount resources from storage
     */
    public static class SellAmount extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            CATCHER.catchInput(player, (p, amount) -> INSTANCE.sellStorage(p, name, amount));
        }
    }

    /**
     * Sell all resuorces from storage
     */
    public static class SellAll extends Action implements ActionExecute {
        @Override
        public void run(Player player, String name) {
            INSTANCE.selllAllStorage(player, name);
        }
    }
}

/**
 * Interface for class Action
 */
@SuppressWarnings("unused")
interface ActionExecute {
    void run(Player player, String name);
}
