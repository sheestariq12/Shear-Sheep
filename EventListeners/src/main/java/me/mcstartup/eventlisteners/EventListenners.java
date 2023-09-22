package me.mcstartup.eventlisteners;

import org.bukkit.plugin.java.JavaPlugin;

public final class EventListeners extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
