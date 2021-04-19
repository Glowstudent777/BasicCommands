package glow.tut.commands;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players Can Use That Command");
            return true;
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                double maxhealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                player.setHealth(maxhealth);
                sender.sendMessage("§e§l(!) You Have Healed Yourself");
                return true;
            } else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    double maxhealth = target.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                    target.setHealth(maxhealth);
                    target.sendMessage("§e§l(!) You Have Been Healed");
                    sender.sendMessage("§e§l(!) You Have Healed " + target.getDisplayName());
                } else {
                    player.sendMessage("§e§l(!) That Player Does Not Exist");

                }
            }


            return true;
        }
        return true;
    }
}