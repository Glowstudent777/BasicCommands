package glow.tut.events;

import glow.tut.commands.Vanish;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Events implements Listener {


    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome " + player.getName());
    }


    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if(player.getInventory().getItemInMainHand().getType().equals(Material.SUGAR)) {
            if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15, 5));
            }
        }
    }
}