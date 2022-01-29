package moonlyte.moonlyte;

import moonlyte.moonlyte.events.playerOnJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class MoonlyteLobby extends JavaPlugin {

    private static MoonlyteLobby plugin;

    @Override
    public void onEnable() {
        // start up
        Logger logger = getLogger();
        logger.info("Lift off!");
        //plugin manager
        loadResources();
        //config
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public void loadResources() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new playerOnJoinEvent(), this);
    }
    public static MoonlyteLobby getPlugin() {return plugin;}
}
