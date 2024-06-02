package de.merix.lobbysystem.listeners;

import de.merix.lobbysystem.LobbySystem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {

        Player player = event.getPlayer();

        if (!player.hasPermission("commands.build")) {
            event.setCancelled(true);
        } else if (!LobbySystem.buildcommand.contains(player)) {
            event.setCancelled(true);
        }
    }

}
