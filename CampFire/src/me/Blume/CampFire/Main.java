package me.Blume.CampFire;

import org.bukkit.plugin.java.JavaPlugin;

import me.Blume.CampFire.Listeners.duplicate;


public class Main extends JavaPlugin{
	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new duplicate(this), this);
	}
	@Override
	public void onDisable() {
		
	}
}
