package io.papermc.homes;

import org.bukkit.Sound;
import org.bukkit.command.CommandSender;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class Broadcasting {

    public static final Sound MESSAGE_SOUND = Sound.BLOCK_NOTE_BLOCK_SNARE;

    public static void sendMessageResponse(CommandSender c, String message) {
        c.sendMessage(Component.text(message, NamedTextColor.GOLD));
    }

    public static void sendSuccessResponse(CommandSender c, String message) {
        c.sendMessage(Component.text(message, NamedTextColor.GREEN));
    }
    
    public static void sendErrorResponse(CommandSender c, String message) {
        c.sendMessage(Component.text(message, NamedTextColor.RED));
    }

}