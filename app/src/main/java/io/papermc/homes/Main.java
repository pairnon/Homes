package io.papermc.homes;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import io.papermc.homes.commands.CommandHome;
import io.papermc.homes.commands.CommandListHomes;
import io.papermc.homes.commands.CommandSetHome;

public class Main extends JavaPlugin implements Listener {

    private static Main plugin;

    public static Main getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        plugin = this;

        this.getCommand("sethome").setExecutor(new CommandSetHome());
        this.getCommand("home").setExecutor(new CommandHome());
        this.getCommand("listhomes").setExecutor(new CommandListHomes());

    }
    
}