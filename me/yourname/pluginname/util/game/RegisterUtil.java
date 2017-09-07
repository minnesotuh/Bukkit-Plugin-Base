package me.yourname.pluginname.util.game;

import me.yourname.pluginname.PluginName;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permission;

public class RegisterUtil {

    public static void registerListener(Listener listener) {
        PluginName.getPlugin(PluginName.class).getServer().getPluginManager().registerEvents(listener, PluginName.getPlugin(PluginName.class));
    }

    public static void registerPermission(Permission perm) {
        PluginName.getPlugin(PluginName.class).getServer().getPluginManager().addPermission(perm);
    }

    public static void registerCommand(String commandName, CommandExecutor executor) {
        PluginName.getPlugin(PluginName.class).getCommand(commandName).setExecutor(executor);
    }

}
