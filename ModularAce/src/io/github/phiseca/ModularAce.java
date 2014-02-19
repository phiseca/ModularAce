package io.github.phiseca;

import io.github.phiseca.inventoryMenu.ModularModifierMenu;
import io.github.phiseca.listeners.InventoryListener;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModularAce  extends JavaPlugin{
	
	public ModularModifierMenu modularModifierMenu;
	
	@Override
	public void onEnable(){
	
		modularModifierMenu= new ModularModifierMenu();
		registerEvents();
	}
	
	@Override
	public void onDisable(){
		
	}

	public void registerEvents(){
		PluginManager pluginManager = getServer().getPluginManager();
		
		pluginManager.registerEvents(new InventoryListener(this), this);
	}
}
