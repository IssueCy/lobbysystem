package de.merix.lobbysystem.utils;

import de.merix.lobbysystem.Data;
import de.merix.lobbysystem.LobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerHiderInteraction implements Listener {

    @EventHandler
    public void onInteraction(PlayerInteractEvent event) {
        Data data = new Data();
        Player player = event.getPlayer();

        if ((event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) && event.getItem().getType() == Material.BLAZE_ROD) {
            if (LobbySystem.PlayerHiderInteraction.contains(player)) {
                LobbySystem.PlayerHiderInteraction.remove(player);
                player.sendMessage(data.prefix + "§ePlayers shown");
                for (Player all : Bukkit.getOnlinePlayers()) {
                    player.showPlayer(all);
                }
            } else {
                LobbySystem.PlayerHiderInteraction.add(player);
                player.sendMessage(data.prefix + "§ePlayers hidden");
                for (Player all : Bukkit.getOnlinePlayers()) {
                    player.hidePlayer(all);
                }
            }
        }
    }
}
