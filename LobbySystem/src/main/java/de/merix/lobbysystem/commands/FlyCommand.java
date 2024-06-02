package de.merix.lobbysystem.commands;

import de.merix.lobbysystem.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Data data = new Data();

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("commands.fly")) {
               if (player.getAllowFlight()) {
                   player.setAllowFlight(false);
                   player.setFlying(false);
                   player.sendMessage(data.prefix + "§eFly disabled");
                   return true;
                } else {
                   player.setAllowFlight(true);
                   player.setFlying(true);
                   player.sendMessage(data.prefix + "§eFly enabled");
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
