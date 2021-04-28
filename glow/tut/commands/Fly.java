package glow.tut.commands;

import glow.tut.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Fly implements CommandExecutor {


    Main plugin;

    public Fly(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (plugin.fly_list.contains(player)){
                for (Player people : Bukkit.getOnlinePlayers()){
                }
                plugin.fly_list.remove(player);
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendMessage("§e§l(!) You Can No Longer Fly");
            }else if(!plugin.fly_list.contains(player)){
                for (Player people : Bukkit.getOnlinePlayers()){
                }
                plugin.fly_list.add(player);
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage("§e§l(!) You Can Now Fly");
            }
        }

        return true;
    }
}