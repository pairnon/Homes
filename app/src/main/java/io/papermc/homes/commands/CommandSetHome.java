package io.papermc.homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandSetHome implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        
        if (args.length == 0) {
            sender.sendMessage("You must specify a home name.");
            return true;
        }
        
        sender.sendMessage("Setting home...");
        
        return true;
    }
    
}