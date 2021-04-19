package glow.tut.events;

import glow.tut.Main;
import glow.tut.commands.Vanish;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VanishEvent implements Listener {

    Main plugin;

    public VanishEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        for (int i = 0; i < plugin.invis_list.size(); i++){
            player.hidePlayer(plugin, plugin.invis_list.get(i));
        }
    }

}
