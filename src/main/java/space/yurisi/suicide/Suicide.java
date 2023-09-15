package space.yurisi.suicide;

import org.bukkit.plugin.java.JavaPlugin;
import space.yurisi.suicide.command.suCommand;

public final class Suicide extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("su").setExecutor(new suCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
