package io.papermc.homes;

import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class Broadcasting {

    public static final Sound MESSAGE_SOUND = Sound.BLOCK_NOTE_BLOCK_SNARE;

    public static void sendMessage(Player p, String message) {
        p.sendMessage(Component.text(message, NamedTextColor.GOLD));
        p.playSound(p.getLocation(), MESSAGE_SOUND, 1.0F, 1.0F);
    }

    public static void sendSuccessMessage(Player p, String message) {
        p.sendMessage(Component.text(message, NamedTextColor.GREEN));
        p.playSound(p.getLocation(), MESSAGE_SOUND, 1.0F, 1.0F);
    }
    
    public static void sendErrorMessage(Player p, String message) {
        p.sendMessage(Component.text(message, NamedTextColor.RED));
        p.playSound(p.getLocation(), MESSAGE_SOUND, 1.0F, 1.0F);
    }

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