package me.yourname.pluginname.cmds;

import me.yourname.pluginname.util.game.LoggerUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)) { // if the command sender is not a player
            LoggerUtil.logMessage("&cYou must be a player to run this command!"); // put this in console
            return true; // return
        }
        Player player = (Player) sender; // Casts the sender to a player so we have access to shit tons of stuff about the player, since we previously checked if the sender was the console then return means this is 100% safe as the entity can only be a player
        if (player.isOnGround()) {
            LoggerUtil.sendMessage(player, "You are on the ground");
            return true;
        } else {
            LoggerUtil.sendMessage(player, "You aren't on the ground");
            return true;
        }
    }

}
