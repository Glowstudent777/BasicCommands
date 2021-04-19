package glow.tut.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Smite implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.getWorld().strikeLightningEffect(player.getLocation());
                player.damage(6);
                sender.sendMessage("§e§l(!) You Have Smited Yourself");
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    target.getWorld().strikeLightningEffect(target.getLocation());
                    target.damage(6);
                    target.sendMessage("§e§l(!) You Have Been Smited");
                    sender.sendMessage("§e§l(!) You Have Smited " + target.getDisplayName());
                } else {
                    player.sendMessage("§e§l(!) That Player Does Not Exist");

                }
            }


            return true;
        }
    return true;
    }
}