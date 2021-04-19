package glow.tut.commands;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players Can Use That Command");
            return true;
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.setFoodLevel(20);
                sender.sendMessage("§e§l(!) You Have Fed Yourself");
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    target.setFoodLevel(20);
                    target.sendMessage("§e§l(!) You Have Been Fed");
                    sender.sendMessage("§e§l(!) You Have Fed " + target.getDisplayName());
                } else {
                    player.sendMessage("§e§l(!) That Player Does Not Exist");

                }
            }


            return true;
        }
        return true;
    }
}