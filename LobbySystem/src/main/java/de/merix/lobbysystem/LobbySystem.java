package de.merix.lobbysystem;

import de.merix.lobbysystem.commands.*;
import de.merix.lobbysystem.listeners.*;
import de.merix.lobbysystem.utils.NavigatorInteraction;
import de.merix.lobbysystem.utils.PlayerHiderInteraction;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class LobbySystem extends JavaPlugin {

    public static String world = "World";

    public static ArrayList<Player> PlayerHiderInteraction = new ArrayList<>();
    public static ArrayList<Player> buildcommand = new ArrayList<>();

    @Override
    public void onEnable() {

        //Listeners
        getServer().getPluginManager().registerEvents(new PlayerHungerListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerBlockBreakListener(), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDropListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);
        getServer().getPluginManager().registerEvents(new NavigatorInteraction(), this);
        getServer().getPluginManager().registerEvents(new PlayerHiderInteraction(), this);
        getServer().getPluginManager().registerEvents(new PlayerDamageListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerItemPickupListener(), this);
        getServer().getPluginManager().registerEvents(new WeatherChangeListener(), this);

        //Commands
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("dc").setExecutor(new SocialsCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("build").setExecutor(new BuildCommand());

    }

    @Override
    public void onDisable() {

    }
}
