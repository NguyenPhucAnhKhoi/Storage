package net.nguyenkhoistorage.api.Events;

/**
 * List types of message can be send to player by this plugin
 */
@SuppressWarnings("unused")
public enum MessageType {
    /**
     * Player will be received a chat text
     */
    CHAT,

    /**
     * Player will be received an action bar text
     */
    ACTION_BAR,

    /**
     * Player will be received a title text
     */
    TITLE
}
