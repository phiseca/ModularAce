package io.github.phiseca.inventoryMenu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ModularModifierMenu {
public  Inventory ModularModifierMenu = Bukkit.createInventory(null, 27, "Modular Modifier Menu");
	
	
	
	public ModularModifierMenu()
	{
		for (int i =0;i<27;i++)
		{
			if(i!=8){
			ModularModifierMenu.setItem(i, new ItemStack(Material.THIN_GLASS, 1,(short) 15));
			}
			
			
			
		}
		
	}

}
