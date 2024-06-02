package de.merix.lobbysystem.utils;

import de.merix.lobbysystem.LobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class NavigatorInteraction implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        try {
            if (event.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("Navigator")) {
                if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

                    Inventory inventory = Bukkit.createInventory(null, InventoryType.CHEST, "Navigator");

                    ItemStack item1 = new ItemStack(Material.NETHER_STAR);
                    ItemMeta itemMeta1 = item1.getItemMeta();
                    itemMeta1.setUnbreakable(true);
                    itemMeta1.setDisplayName("Spawn");
                    item1.setItemMeta(itemMeta1);

                    ItemStack item2 = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta itemMeta2 = item2.getItemMeta();
                    itemMeta2.setUnbreakable(true);
                    itemMeta2.setDisplayName("BuildFFA");
                    item2.setItemMeta(itemMeta2);

                    ItemStack item3 = new ItemStack(Material.STICK);
                    ItemMeta itemMeta3 = item3.getItemMeta();
                    itemMeta3.setUnbreakable(true);
                    itemMeta3.setDisplayName("MLGRush");
                    item3.setItemMeta(itemMeta3);

                    ItemStack item4 = new ItemStack(Material.WOODEN_AXE);
                    ItemMeta itemMeta4 = item4.getItemMeta();
                    itemMeta4.setUnbreakable(true);
                    itemMeta4.setDisplayName("GunGame");
                    item4.setItemMeta(itemMeta4);

                    ItemStack item5 = new ItemStack(Material.RED_BED);
                    ItemMeta itemMeta5 = item5.getItemMeta();
                    itemMeta5.setUnbreakable(true);
                    itemMeta5.setDisplayName("Bedwars");
                    item5.setItemMeta(itemMeta5);

                    ItemStack item6 = new ItemStack(Material.WOODEN_SWORD);
                    ItemMeta itemMeta6 = item6.getItemMeta();
                    itemMeta6.setUnbreakable(true);
                    itemMeta6.setDisplayName("Survivalgames");
                    item6.setItemMeta(itemMeta6);

                    inventory.setItem(8+1, item1);
                    inventory.setItem(8+3, item2);
                    inventory.setItem(8+5, item3);
                    inventory.setItem(8+7, item4);
                    inventory.setItem(8+9, item5);
                    inventory.setItem(9+1, item6);

                    player.openInventory(inventory);

                }
            }
        } catch (Exception ex) {

        }

    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.NETHER_STAR) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Spawn")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), 0, 87, 20);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);

                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }

    //---------------------------------------------------------------
    @EventHandler
    public void onClick1(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("BuildFFA")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), -2, 86, -8);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);
                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }

    //-----------------------------------------------------------------
    @EventHandler
    public void onClick2(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.STICK) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("MLGRush")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), 3, 86, -8);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);
                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }

    //-----------------------------------------------------------------------
    @EventHandler
    public void onClick3(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.WOODEN_AXE) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("GunGame")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), -5, 86, -6);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);
                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }

    //-----------------------------------------------------------------------
    @EventHandler
    public void onClick4(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.RED_BED) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Bedwars")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), 0, 86, -9);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);
                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }

    //----------------------------------------------------

    @EventHandler
    public void onClick5(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        try {
            if (event.getView().getTitle().equalsIgnoreCase("Navigator")) {
                event.setCancelled(true);
                try {

                    if (event.getCurrentItem().getType() == Material.WOODEN_SWORD) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Survivalgames")) {

                            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), -7, 86, 20);
                            spawnLocation.setYaw((float) 180);
                            spawnLocation.setPitch((float) 0);
                            player.teleport(spawnLocation);

                            player.closeInventory();

                        }
                    }

                }  catch (Exception ex2) {

                }
            }
        } catch (Exception ex1) {

        }
    }
}
