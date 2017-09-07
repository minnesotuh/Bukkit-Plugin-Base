package me.yourname.pluginname.listeners;

import me.yourname.pluginname.util.game.LoggerUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExampleListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getMaterial() == Material.STONE_SWORD) {
            if (event.getPlayer().hasPermission("pluginname.permission")) {
                LoggerUtil.sendMessage(event.getPlayer(), "&eYou interacted with a stone sword and you have the pluginname.permission perm.");
            } else {
                LoggerUtil.sendMessage(event.getPlayer(), "&eYou interacted with a stone sword");
            }
        }
    }

}
