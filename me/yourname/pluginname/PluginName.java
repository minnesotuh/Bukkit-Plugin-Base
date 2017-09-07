package me.yourname.pluginname;

import me.yourname.pluginname.cmds.ExampleCommand;
import me.yourname.pluginname.listeners.ExampleListener;
import me.yourname.pluginname.util.game.RegisterUtil;
import me.yourname.pluginname.util.game.LoggerUtil;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Your main class for your plugin.
 */
public class PluginName extends JavaPlugin { // Must extend JavaPlugin from org.bukkit

    public Permission perm = new Permission("pluginname.permission");

    /**
     * Void that gets called on plugin startup.
     * This can be used to register listeners and commands.
     */
    @Override
    public void onEnable() {
        LoggerUtil.logMessage("Plugin has been enabled!");
        registerCmds();
        registerListeners();
        registerPermissions();
    }

    public void registerPermissions() {
        RegisterUtil.registerPermission(perm);
    }

    public void registerListeners() {
        // Registers all class that listen for events, the class must implement Listener at org.bukkit
        RegisterUtil.registerListener(new ExampleListener());
    }

    public void registerCmds() {
        // Registers all the commands and sets their executor class
        RegisterUtil.registerCommand("example", new ExampleCommand());
    }

    /**
     * Void that gets called on plugin shutdown.
     */
    @Override
    public void onDisable() {
        LoggerUtil.logMessage("Plugin has been disabled!");
    }

}
