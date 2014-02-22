package io.github.phiseca.listeners;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.phiseca.ModularAce;
import io.github.phiseca.dataType.PointModular;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
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
		Location blockloc ;
		
		switch(event.getAction()){
			case RIGHT_CLICK_BLOCK:
				Material type =block.getType();
				blockloc = block.getLocation();
			    block.getLocation(blockloc) ;
			    if (plugin.modularMultiBlock.multiblockcustom(block,3, 
			    		  "LAPIS_BLOCK|LAPIS_BLOCK  |LAPIS_BLOCK|"
			    		+ "LAPIS_BLOCK|EMERALD_BLOCK|LAPIS_BLOCK|"
			    		+ "LAPIS_BLOCK|AIR          |LAPIS_BLOCK|"

			    		+ "LAPIS_BLOCK|LAPIS_BLOCK  |LAPIS_BLOCK|"
			    		+ "STEP       |AIR          |STEP       |"
			    		+ "STEP       |AIR          |STEP       |"
			    		
			    		+ "AIR        |COBBLE_WALL  |AIR        |"
			    		+ "AIR        |CAULDRON     |AIR        |"
			    		+ "AIR        |AIR          |AIR        |"
			    		
			    		+ "AIR        |COBBLE_WALL  |AIR        |"
			    		+ "AIR        |COBBLE_WALL  |AIR        |"
			    		+ "AIR        |AIR          |AIR        |"))
			    {
			    	player.openInventory(plugin.modularModifierMenu.ModularModifierMenu);
			    }
			    /*
			    if(plugin.modularMultiBlock.multiblockcustom(block, 1, 1, 1, 0, 0, 0, "EMERALD_BLOCK")==true)
			    {
			    	player.openInventory(plugin.modularModifierMenu.ModularModifierMenu);
			    }
			    */
				/* Check if Multi block */
			    
//				if(plugin.modularMultiBlock.multiblock(block,0,
//						Material.LAPIS_BLOCK,Material.LAPIS_BLOCK,Material.LAPIS_BLOCK,
//						Material.LAPIS_BLOCK,Material.EMERALD_BLOCK,Material.LAPIS_BLOCK,
//						Material.LAPIS_BLOCK,Material.AIR,Material.LAPIS_BLOCK) == true)	
//				{
//					if(plugin.modularMultiBlock.multiblock(block,1,
//							Material.LAPIS_BLOCK,Material.LAPIS_BLOCK,Material.LAPIS_BLOCK,
//							Material.STEP,Material.AIR,Material.STEP,
//							Material.STEP,Material.AIR,Material.STEP) == true)	
//					{
//						if(plugin.modularMultiBlock.multiblock(block,2,
//								Material.AIR,Material.COBBLE_WALL,Material.AIR,
//								Material.AIR,Material.CAULDRON,Material.AIR,
//								Material.AIR,Material.AIR,Material.AIR) == true)	
//						{
//							if(plugin.modularMultiBlock.multiblock(block,3,
//									Material.AIR,Material.COBBLE_WALL,Material.AIR,
//									Material.AIR,Material.COBBLE_WALL,Material.AIR,
//									Material.AIR,Material.AIR,Material.AIR) == true)	
//							{
//				               player.openInventory(plugin.modularModifierMenu.ModularModifierMenu);
//							}
//						}
//					}
//				}
				
			    //Cek apakah block core modifier yang di klik
			    /*if (plugin.modularModifierMenu.core==type){
			    	player.sendMessage("Mengeklik emerald");
			    	
			    	
			    	Boolean flag= true;
			    	BlockFace face=BlockFace.EAST;
			    	
			    	if(block.getRelative(BlockFace.SOUTH).getType()==plugin.modularModifierMenu.faceMaterial)
			    	{
			    		
			    		player.sendMessage("Udara Selatan");
			    		face=BlockFace.SOUTH;
			    		
			    	}
			    	else if(block.getRelative(BlockFace.NORTH).getType()==plugin.modularModifierMenu.faceMaterial){
			    		player.sendMessage("Udara Utara");
			    		face=BlockFace.NORTH;
			    	}
			    	else if(block.getRelative(BlockFace.WEST).getType()==plugin.modularModifierMenu.faceMaterial){
			    		player.sendMessage("Udara Barat");
			    		face=BlockFace.WEST;
			    	}
			    	else if(block.getRelative(BlockFace.EAST).getType()==plugin.modularModifierMenu.faceMaterial){
			    		player.sendMessage("Udara Timur");
			    		face=BlockFace.EAST;
			    	}
			    	
			    	Set<Entry<PointModular, Material>> entries=plugin.modularModifierMenu.getMap(face).entrySet();
			    	for(Entry<PointModular, Material> entry : entries){
			    		if(block.getRelative(entry.getKey().x, entry.getKey().y, entry.getKey().z).getType()!=entry.getValue()){
			    			flag=false;
			    			break;
			    			
			    		}
			    		
			    	}
			    	
			    	if(flag==true){
			    		event.setCancelled(true);
			    		player.openInventory(plugin.modularModifierMenu.ModularModifierMenu);
			    		
			    	}
			    	else{
			    		player.sendMessage("Bangunan salah");
			    	}
			    	
			    	
			    }
			   
				break;
			default:
				break;
				*/
				 
		}
		
	}

}
