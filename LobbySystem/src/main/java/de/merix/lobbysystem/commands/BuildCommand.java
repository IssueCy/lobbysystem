package de.merix.lobbysystem.commands;

import de.merix.lobbysystem.Data;
import de.merix.lobbysystem.LobbySystem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuildCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Data data = new Data();

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("commands.build")) {
                if (args.length == 0) {
                    boolean inBuildMode = LobbySystem.buildcommand.contains(player);

                    if (inBuildMode) {
                        LobbySystem.buildcommand.remove(player);
                        player.sendMessage(data.prefix + "§eBuild disabled");
                    } else {
                        LobbySystem.buildcommand.add(player);
                        player.sendMessage(data.prefix + "§eBuild enabled");

                    }
                    return true;
                }
            } else {
                player.sendMessage(data.noPerms);
            }
        } else {
            sender.sendMessage(data.noPlayer);
        }

        return true;
    }
}

