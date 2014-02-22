package io.github.phiseca;

import java.util.HashMap;
import java.util.Map;

import io.github.phiseca.inventoryMenu.ModularModifierMenu;
import io.github.phiseca.listeners.InventoryListener;
import io.github.phiseca.listeners.PlayerListener;
import io.github.phiseca.multiblock.ModularMultiBlock;

import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ModularAce  extends JavaPlugin{
	
	public static ModularAce p;
	public Map<Player, ModularModifierMenu> modularMenuMap = new HashMap<Player, ModularModifierMenu>();
	public ModularMultiBlock modularMultiBlock;
	
	@Override
	public void onEnable(){
		try{
			p=this;
			modularMultiBlock= new ModularMultiBlock();
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
		pluginManager.registerEvents(new PlayerListener(this), this);
	}
	
	public ModularModifierMenu registerModularModifier(Player player){
		modularMenuMap.put(player, new ModularModifierMenu());
		return modularMenuMap.get(player);
	}
	
	public ModularModifierMenu getModularModifier(Player player){
		return modularMenuMap.get(player);
	}
}
