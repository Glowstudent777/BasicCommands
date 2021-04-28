package glow.tut;

import glow.tut.commands.*;
import glow.tut.events.Events;
import glow.tut.events.VanishEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Main extends JavaPlugin {


    public ArrayList<Player> invis_list = new ArrayList<>();
    public ArrayList<Player> fly_list = new ArrayList<>();

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getPluginManager().registerEvents(new VanishEvent(this), this);

        getCommand("vanish").setExecutor(new Vanish(this));
        getCommand("fly").setExecutor(new Fly(this));

        Feed feed = new Feed();
        getCommand("feed").setExecutor(feed);

        Smite smite = new Smite();
        getCommand("smite").setExecutor(smite);

        Heal heal = new Heal();
        getCommand("heal").setExecutor(heal);

        Supporters supporters = new Supporters();
        getCommand("supporters").setExecutor(supporters);



        getLogger().info("\n" +

        "   _____ _             _   _                    \n" +
                "  / ____| |           | | (_)                   \n" +
                " | (___ | |_ __ _ _ __| |_ _ _ __   __ _        \n" +
                "  \\___ \\| __/ _` | '__| __| | '_ \\ / _` |       \n" +
                "  ____) | || (_| | |  | |_| | | | | (_| |       \n" +
                " |_____/ \\__\\__,_|_|   \\__|_|_| |_|\\__, |       \n" +
                "                                    __/ |       \n" +
                "  ____            _         _____ _|___/ _____  \n" +
                " |  _ \\          (_)       / ____|  \\/  |  __ \\ \n" +
                " | |_) | __ _ ___ _  ___  | |    | \\  / | |  | |\n" +
                " |  _ < / _` / __| |/ __| | |    | |\\/| | |  | |\n" +
                " | |_) | (_| \\__ \\ | (__  | |____| |  | | |__| |\n" +
                " |____/ \\__,_|___/_|\\___|  \\_____|_|  |_|_____/ \n" +
                "                                                \n" +
                "                                                "

        );

        getLogger().info( "Special Thanks To Our Plugin Supporters!");

    }

    @Override
    public void onDisable() {
        getLogger().info("\n" +
                        "   _____ _                    _                 \n" +
                        "  / ____| |                  (_)                \n" +
                        " | (___ | |_ ___  _ __  _ __  _ _ __   __ _     \n" +
                        "  \\___ \\| __/ _ \\| '_ \\| '_ \\| | '_ \\ / _` |    \n" +
                        "  ____) | || (_) | |_) | |_) | | | | | (_| |    \n" +
                        " |_____/ \\__\\___/| .__/| .__/|_|_| |_|\\__, |    \n" +
                        "                 | |   | |             __/ |    \n" +
                        "  ____           |_|   |_|  _____ __  |___/___  \n" +
                        " |  _ \\          (_)       / ____|  \\/  |  __ \\ \n" +
                        " | |_) | __ _ ___ _  ___  | |    | \\  / | |  | |\n" +
                        " |  _ < / _` / __| |/ __| | |    | |\\/| | |  | |\n" +
                        " | |_) | (_| \\__ \\ | (__  | |____| |  | | |__| |\n" +
                        " |____/ \\__,_|___/_|\\___|  \\_____|_|  |_|_____/ \n" +
                        "                                                \n" +
                        "                                                "



                );
    }
}
