package de.merix.lobbysystem.commands;

import de.merix.lobbysystem.LobbySystem;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location spawnLocation = new Location(Bukkit.getWorld(LobbySystem.world), 0, 87, 20);
            spawnLocation.setYaw((float) 180);
            spawnLocation.setPitch((float) 0);
            player.teleport(spawnLocation);

        }

        return true;
    }
}
