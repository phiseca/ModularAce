package io.github.phiseca.listeners;

import io.github.phiseca.ModularAce;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerListener implements Listener {
	private final ModularAce plugin;
	
	public PlayerListener(final ModularAce plugin){
		this.plugin=plugin;
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		Block block = event.getClickedBlock();
		
		switch(event.getAction()){
			case RIGHT_CLICK_BLOCK:
				Material type =block.getType();
				player.sendMessage("Material di klik adalah" +type.name());
				/* Check if Emerald */
				if(type== Material.EMERALD_BLOCK){
					player.sendMessage("Right click pada emerald block");
					player.openInventory(plugin.modularModifierMenu.ModularModifierMenu);
				}
				break;
			default:
				break;
		}
		
	}

}
