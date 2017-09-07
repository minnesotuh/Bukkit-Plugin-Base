package me.yourname.pluginname.util.game;

import me.yourname.pluginname.PluginName;
import org.bukkit.entity.Player;

public class LoggerUtil {

    /**
     * Sends a certain player a message.
     * @param player, msg
     */
    public static void sendMessage(Player player, String msg) {
        player.sendMessage(msg.replace("&", "§"));
    }

    /**
     * Sends a message to the console
     * @param msg
     */
    public static void logMessage(String msg) {
        PluginName.getPlugin(PluginName.class).getLogger().info(msg.replace("&", "§"));
    }

}
