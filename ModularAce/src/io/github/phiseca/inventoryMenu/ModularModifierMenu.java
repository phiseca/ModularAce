package io.github.phiseca.inventoryMenu;

import io.github.phiseca.ModularAce;
import io.github.phiseca.dataType.PointModular;

import java.awt.Point;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ModularModifierMenu{
	
public static String name="Modular Modifier Menu";
public  Inventory inventory = Bukkit.createInventory(null, 27, "Modular Modifier Menu");

Material[] list= new Material[]{
		Material.LAPIS_BLOCK,
		Material.STEP,
		Material.COBBLE_WALL,
		Material.CAULDRON
};

List<Material> check = Arrays.asList(list);

public Map<PointModular, Material> ModularModifierCoor = new HashMap<PointModular, Material>();

public Material core = Material.EMERALD_BLOCK;

public BlockFace defaultFace =BlockFace.EAST;
public Material faceMaterial= Material.AIR;



	
	
	public ModularModifierMenu()
	{
		for (int i =0;i<27;i++)
		{
			if(i!=9){
			inventory.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1,(byte) 15));
			}
		}
		/*
		//paling bawah layer 1
		ModularModifierCoor.put(new PointModular(-1, 0, -1), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(-1, 0, 0), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(-1, 0, 1), Material.LAPIS_BLOCK);
		
		ModularModifierCoor.put(new PointModular(0, 0, -1), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(0, 0, 0), Material.EMERALD_BLOCK);
		ModularModifierCoor.put(new PointModular(0, 0, 1), Material.LAPIS_BLOCK);
		
		ModularModifierCoor.put(new PointModular(1, 0, -1), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(1, 0, 0), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 0, 1), Material.LAPIS_BLOCK);

		//layer 2
		ModularModifierCoor.put(new PointModular(-1, 1, -1), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(-1, 1, 0), Material.LAPIS_BLOCK);
		ModularModifierCoor.put(new PointModular(-1, 1, 1), Material.LAPIS_BLOCK);
		
		ModularModifierCoor.put(new PointModular(0, 1, -1), Material.STEP);
		ModularModifierCoor.put(new PointModular(0, 1, 0), Material.AIR);
		ModularModifierCoor.put(new PointModular(0, 1, 1), Material.STEP);
		
		ModularModifierCoor.put(new PointModular(1, 1, -1), Material.STEP);
		ModularModifierCoor.put(new PointModular(1, 1, 0), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 1, 1), Material.STEP);
		
		//layer 3
		ModularModifierCoor.put(new PointModular(-1, 2, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(-1, 2, 0), Material.COBBLE_WALL);
		ModularModifierCoor.put(new PointModular(-1, 2, 1), Material.AIR);
		
		ModularModifierCoor.put(new PointModular(0, 2, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(0, 2, 0), Material.CAULDRON);
		ModularModifierCoor.put(new PointModular(0, 2, 1), Material.AIR);
		
		ModularModifierCoor.put(new PointModular(1, 2, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 2, 0), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 2, 1), Material.AIR);
		
		//layer 4
		ModularModifierCoor.put(new PointModular(-1, 3, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(-1, 3, 0), Material.COBBLE_WALL);
		ModularModifierCoor.put(new PointModular(-1, 3, 1), Material.AIR);
		
		ModularModifierCoor.put(new PointModular(0, 3, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(0, 3, 0), Material.COBBLE_WALL);
		ModularModifierCoor.put(new PointModular(0, 3, 1), Material.AIR);
		
		ModularModifierCoor.put(new PointModular(1, 3, -1), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 3, 0), Material.AIR);
		ModularModifierCoor.put(new PointModular(1, 3, 1), Material.AIR);
		
		
	}
	
	 public Map<PointModular, Material> getMap(BlockFace blockFace){
		Map<PointModular, Material> relativeMap = new HashMap<PointModular, Material>();
		if(blockFace==BlockFace.WEST){
			for(Entry<PointModular, Material> entry : ModularModifierCoor.entrySet()){
				PointModular point = entry.getKey();
				PointModular pointRelative= new PointModular((point.x*-1),point.y,(point.z*-1));
				relativeMap.put(pointRelative, entry.getValue());
			
			}	
		}
		else if(blockFace==BlockFace.NORTH){
			for(Entry<PointModular, Material> entry : ModularModifierCoor.entrySet()){
				PointModular point = entry.getKey();
				PointModular pointRelative= new PointModular(point.z,point.y,(point.x*-1));
				relativeMap.put(pointRelative, entry.getValue());
			
			}	
			
		}
		else if(blockFace==BlockFace.SOUTH){
			for(Entry<PointModular, Material> entry : ModularModifierCoor.entrySet()){
				PointModular point = entry.getKey();
				PointModular pointRelative= new PointModular((point.z*-1),point.y,point.x);
				relativeMap.put(pointRelative, entry.getValue());
			
			}	
			
		}
		else{
			for(Entry<PointModular, Material> entry : ModularModifierCoor.entrySet()){
				PointModular point = entry.getKey();
				PointModular pointRelative= new PointModular(point.x,point.y,point.z);
				relativeMap.put(pointRelative, entry.getValue());
			
			}	
			
		}
		
		return relativeMap;
		
		*/
		
	}
	
	public void refreshInventory(){
		
		if(inventory.getItem(9)!=null){
			for(int i =10;i<=16;i++){
				inventory.setItem(i, new ItemStack(Material.SIGN));
			}
		}
		else{
			for(int i =10;i<=16;i++){
				inventory.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1,(byte) 15));
			}
		}
		
	}

}
