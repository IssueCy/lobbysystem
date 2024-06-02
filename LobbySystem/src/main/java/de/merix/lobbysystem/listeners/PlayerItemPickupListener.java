package de.merix.lobbysystem.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class PlayerItemPickupListener implements Listener{

    @EventHandler
    public void onItemPickup(EntityPickupItemEvent event) {
        Entity entity = event.getEntity();

        if(entity instanceof Player) {
            Player player = (Player) entity;
            if(!(player.getGameMode() == GameMode.CREATIVE)) {
                event.setCancelled(true);
            }
        }
    }
    
}

