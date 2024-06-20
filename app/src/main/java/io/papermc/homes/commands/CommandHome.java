package io.papermc.homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.papermc.homes.Broadcasting;

public class CommandHome implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            Broadcasting.sendErrorResponse(sender, "You must specify a home.");
            return true;
        }

        Broadcasting.sendSuccessResponse(sender, "Teleporting you...");

        return true;
    }
    
}
