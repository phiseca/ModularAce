package io.github.phiseca;

import io.github.phiseca.inventoryMenu.ModularModifierMenu;
import io.github.phiseca.listeners.InventoryListener;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModularAce  extends JavaPlugin{
	
	public ModularModifierMenu modularModifierMenu;
	
	@Override
	public void onEnable(){
		try{
			modularModifierMenu= new ModularModifierMenu();
			registerEvents();
		}
		catch (Throwable t){
			getLogger().severe("There was an error while enabling ModularAce");
			
			if(!(t instanceof ExceptionInInitializerError)){
				t.printStackTrace();
			}
			else{
			getLogger().info("Please do not replace ModularAce jar while server is running.");
			
			}
			getServer().getPluginManager().disablePlugin(this);
				
		}
	}
	
	@Override
	public void onDisable(){
		
	}

	public void registerEvents(){
		PluginManager pluginManager = getServer().getPluginManager();
		
		pluginManager.registerEvents(new InventoryListener(this), this);
	}
}
