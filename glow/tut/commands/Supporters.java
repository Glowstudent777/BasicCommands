package glow.tut.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Supporters implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage("§e§l(!) Plugin Supporters: DivineHyena");
        }

        if (!(sender instanceof Player)){
            sender.sendMessage("(!) Plugin Supporters: DivineHyena");
        }

        return true;
    }
}
