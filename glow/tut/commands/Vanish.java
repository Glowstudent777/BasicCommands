package glow.tut.commands;

import glow.tut.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Vanish implements CommandExecutor {


    Main plugin;

    public Vanish(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (plugin.invis_list.contains(player)){
                for (Player people : Bukkit.getOnlinePlayers()){
                    people.showPlayer(plugin, player);
                }
                plugin.invis_list.remove(player);
                player.sendMessage("§e§l(!) You Have UnVanished");
            }else if(!plugin.invis_list.contains(player)){
                for (Player people : Bukkit.getOnlinePlayers()){
                    people.hidePlayer(plugin, player);
                }
                plugin.invis_list.add(player);
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("§e§l(!) You Have Vanished");
            }
        }

        return true;
    }
}