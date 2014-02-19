package io.github.phiseca.listeners;

import io.github.phiseca.ModularAce;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {
	private final ModularAce plugin;
	
	public static Inventory ModularModifierMenu = Bukkit.createInventory(null, 27, "Modular Modifier Menu");
	
	static{
		for (int i =0;i<=27;i++)
		{
			if(i!=8){
			ModularModifierMenu.setItem(i, new ItemStack(Material.THIN_GLASS, 1,(short) 15));
			}
			
			
			
		}
		
	}
	
	public InventoryListener(final ModularAce plugin){
		this.plugin=plugin;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event)
	{
		Player player= (Player) event.getWhoClicked();
		ItemStack clicked =event.getCurrentItem();
		Inventory inventory=event.getInventory();
		
		if(inventory.getName().equals(ModularModifierMenu.getName())){
			if(clicked.getType()==Material.THIN_GLASS && clicked.getDurability()==(short)15){
				event.setCancelled(true);
				player.closeInventory();
				//efek klik
			}
			
		
		}
		
		
	}

}
