package de.merix.lobbysystem.commands;

import de.merix.lobbysystem.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SocialsCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Data data = new Data();
            Player player = (Player) sender;

            String message = data.prefix + "§e---Our Socials---\n"
                                         + "§9Discord » https://discord.gg/ggj4ZnnjmQ\n"
                                         + "§9Our Website » https://craftercrew.net.pages.dev/\n"
                                         + "§9Our TikTok » https://tiktok.com/craftercrew/\n"
                                         + "§e---------------------------------------------";

            player.sendMessage(message);
        }

        return true;
    }
}
