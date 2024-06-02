package de.merix.lobbysystem.listeners;

import de.merix.lobbysystem.LobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(null);
        player.getInventory().clear();
        player.setHealth(20);
        player.setSaturation(20);
        player.setFoodLevel(20);
        player.setLevel(0);
        player.setGameMode(GameMode.SURVIVAL);

        Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), 0, 87, 20);
        spawnLocation.setYaw((float) 180);
        spawnLocation.setPitch((float) 0);
        player.teleport(spawnLocation);

        ItemStack item1 = new ItemStack(Material.COMPASS);
        ItemMeta itemMeta1 = item1.getItemMeta();
        itemMeta1.setUnbreakable(true);
        itemMeta1.setDisplayName("Navigator");
        item1.setItemMeta(itemMeta1);

        ItemStack item2 = new ItemStack(Material.BLAZE_ROD);
        ItemMeta itemMeta2 = item2.getItemMeta();
        itemMeta2.setUnbreakable(true);
        itemMeta2.setDisplayName("Player Hider");
        item2.setItemMeta(itemMeta2);

        player.getInventory().setItem(3, item1);
        player.getInventory().setItem(5, item2);

    }

}
