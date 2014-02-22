package io.github.phiseca.listeners;

import io.github.phiseca.ModularAce;
import io.github.phiseca.inventoryMenu.ModularModifierMenu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {
	private final ModularAce plugin;
	
	
	
	public InventoryListener(final ModularAce plugin){
		this.plugin=plugin;
	}
	
	@EventHandler(ignoreCancelled = true)
	public void onInventoryClick(InventoryClickEvent event)
	{
		Player player= (Player) event.getWhoClicked();
		ItemStack clicked =event.getCurrentItem();
		Inventory inventory=event.getInventory();
		if(inventory.getName().equals(ModularModifierMenu.name)){
			if(clicked==null){
				event.setCancelled(true);
			}
				
			
			else if(clicked.getType()==Material.STAINED_GLASS_PANE && clicked.getDurability()==(byte)15){
				event.setCancelled(true);
				
				//player.closeInventory();
				//efek klik
			}
			else{
				player.sendMessage("hasil else");
				plugin.getModularModifier(player).refreshInventory();
				player.updateInventory();
				
			}
			
		
		}
		
		
	}

}
