package io.github.phiseca.multiblock;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;


public class ModularMultiBlock {

//	public boolean multiblock(Block block,int height,Material M1,Material M2,Material M3,Material M4,Material M5,Material M6,Material M7,Material M8,Material M9)
//	 {
//		for (int i = 0;i<=height-1;i++)
//		{
//		Block block1 = block.getRelative(-1, 0+y, -1);
//		Block block2 = block.getRelative(-1, 0+y, 0);
//		Block block3 = block.getRelative(-1, 0+y, 1);
//		Block block4 = block.getRelative(0, 0+y, -1);
//		Block block5 = block.getRelative(0, 0+y, 0);
//		Block block6 = block.getRelative(0, 0+y, 1);
//		Block block7 = block.getRelative(1, 0+y, -1);
//		Block block8 = block.getRelative(1, 0+y, 0);
//		Block block9 = block.getRelative(1, 0+y, 1);
//		 if ((block1.getType() == M1)&&
//			 (block2.getType() == M2)&&
//			 (block3.getType() == M3)&&
//		     (block4.getType() == M4)&&
//		     (block5.getType() == M5)&&
//			 (block6.getType() == M6)&&
//			 (block7.getType() == M7)&&
//			 (block8.getType() == M8)&&
//			 (block9.getType() == M9))
//		 {
//			 return true;
//		 }
//		 else
//		 {
//			 return false;
//		 }
//		}
//	 }
	
	public boolean multiblockcustom(Block block,int height,String blocks)
	{
		blocks = blocks.replace(" ", "");
		String[] blocklist =  blocks.split("\\|");
		height = height - 1;
		boolean MB = false;
		boolean scan = true;
		int o = 0;
		
		for (int y = 0; y <= height; y++)
		{
			for (int z = -1; z <= 1; z++)
			{
				for (int x = -1; x <= 1; x++)
				{
					Block blockscan = block.getRelative(x, y, z);
					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
					{
						MB = true;
						scan = true;
					}
					else
					{
						MB = false;
						scan = false;
						break;
					}
					o=o+1;
					if (scan == false)
					{
						break;
					}
				}	
				if (scan == false)
				{
					break;
				}
			}	
			if (scan == false)
			{
				break;
			}
		}	
		
		//90
		o=0;
		scan = true;
		if (MB == false)
		{
		for (int y = 0; y <= height; y++)
		{
			for (int x = -1; x <= 1; x++)
			{
				for (int z = 1; z >= -1; z--)
				{
					Block blockscan = block.getRelative(x, y, z);
					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
					{
						MB = true;
						scan = true;
					}
					else
					{
						MB = false;
						scan = false;
						break;
					}
					o=o+1;
					if (scan == false)
					{
						break;
					}
				}	
				if (scan == false)
				{
					break;
				}
			}	
			if (scan == false)
			{
				break;
			}
		}	
		}

		
		//180
		o=0;
	    scan = true;
		if (MB == false)
		{
		for (int y = 0; y <= height; y++)
		{
			for (int x = 1; x >= -1; x--)
			{
				for (int z = -1; z <= 1; z++)
				{
					Block blockscan = block.getRelative(x, y, z);
					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
					{
						MB = true;
						scan = true;
					}
					else
					{
						MB = false;
						scan = false;
						break;
					}
					o=o+1;
					if (scan == false)
					{
						break;
					}
				}	
				if (scan == false)
				{
					break;
				}
			}	
			if (scan == false)
			{
				break;
			}
		}	
		}


		//270
		o=0;
		scan = true;
		if (MB == false)
		{
		for (int y = 0; y <= height; y++)
		{
			for (int z = 1; z >= -1; z--)
			{
				for (int x = 1; x >= -1; x--)
				{
					Block blockscan = block.getRelative(x, y, z);
					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
					{
						MB = true;
						scan = true;
					}
					else
					{
						MB = false;
						scan = false;
						break;
					}
					o=o+1;
					if (scan == false)
					{
						break;
					}
				}	
				if (scan == false)
				{
					break;
				}
			}	
			if (scan == false)
			{
				break;
			}
		}	
		}

		
		if(MB == true)
		{
		    return true;
		}
		else
		{
			return false;
		}
	}

}
