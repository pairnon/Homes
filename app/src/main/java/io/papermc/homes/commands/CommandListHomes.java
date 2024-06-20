package io.papermc.homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.homes.Broadcasting;

public class CommandListHomes implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Broadcasting.sendErrorResponse(sender, "You must be a player to execute this command.");
            return true;
        }

        Player player = (Player) sender;

        Broadcasting.sendMessage(player, "Listing your homes...");

        return true;
    }
    
}
