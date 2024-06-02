package de.merix.lobbysystem.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class PlayerHungerListener implements Listener {

    @EventHandler
    public void onPlayerHunger(FoodLevelChangeEvent event) {

            event.setCancelled(true);
    }

}
