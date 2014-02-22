package io.github.phiseca.multiblock;
//import java.awt.Event;
//import java.util.ArrayList;
//import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.block.Block;
//import org.bukkit.entity.Player;
//import org.bukkit.event.player.PlayerInteractEvent;
//import org.bukkit.plugin.Plugin;


public class ModularMultiBlock {

//	public boolean multiblock(Block block,int y,Material M1,Material M2,Material M3,Material M4,Material M5,Material M6,Material M7,Material M8,Material M9)
//	 {
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
//		 
//	 }
	
	
	public boolean multiblockcustom(Block block,int wide1,int wide2,int height,int offsetx,int offsetz,int offsety,String blocks)
	{
		blocks = blocks.replace(" ", "");
		String[] blocklist =  blocks.split("\\|");
		wide1 = wide1 - 1;
		wide2 = wide2 - 1;
		height = height - 1;
		int xavg = wide1 - offsetx;
		int zavg = wide2 - offsetz;
		int yavg = height - offsety;
		boolean MB = false;
		int o = 0;
		boolean scan = true;
		
		for (int i = yavg - height; i <= height; i++)
		{
			for (int j = wide2 - zavg ; j <= wide2; j++)
			{
				for (int k = wide1 - xavg; k <= wide1; k++)
				{
					Block blockscan = block.getRelative(k, i, j);
					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
					{
						MB = true;
					}
					else
					{
						MB = false;
						scan = false;
						break;
					}
					if (o < (blocklist.length - 1))
					o=o+1 ;
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
		
		
		
		//180
//		o = 0;
//		scan = true;
//		if (MB == false)
//		{	
//		for (int i = yavg - height; i <= height; i++)
//		{
//			for (int j = zavg - wide2; j >= wide2; j--)
//			{
//				for (int k = xavg - wide1; k >= wide1; k--)
//				{
//					Block blockscan = block.getRelative(k, i, j);
//					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
//					{
//						MB = true;
//					}
//					else
//					{
//						MB = false;
//						break;
//					}
//					if (o < (blocklist.length - 1))
//						o=o+1 ;
//				}	
//				if (scan == false)
//				{
//					break;
//				}
//			}	
//			if (scan == false)
//			{
//				break;
//			}
//		}	
//		}  
//		
//		//90
//		o = 0;
//		scan = true;
//		if (MB==false)
//		{
//		for (int i = yavg - height; i <= height; i++)
//		{
//			for (int k = xavg - wide1; k >= wide1; k--)
//			{
//				for (int j = wide2 - zavg ; j <= wide2; j++)
//				{
//					Block blockscan = block.getRelative(k, i, j);
//					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
//					{
//						MB = true;
//					}
//					else
//					{
//						MB = false;
//						break;
//					}
//					if (o < (blocklist.length - 1))
//						o=o+1 ;
//				}	
//				if (scan == false)
//				{
//					break;
//				}
//			}	
//			if (scan == false)
//			{
//				break;
//			}
//		}	
//		}
//		
//		//270
//		o = 0;
//		scan = true;
//		if (MB==false)
//		{
//		for (int i = yavg - height; i <= height; i++)
//		{
//			for (int k = wide1 - xavg; k <= wide1; k++)
//			{
//				for (int j = zavg - wide2 ; j >= wide2; j--)
//				{
//					Block blockscan = block.getRelative(k, i, j);
//					if (blockscan.getType() == Material.getMaterial(blocklist[o]))
//					{
//						MB = true;
//					}
//					else
//					{
//						MB = false;
//						break;
//					}
//					if (o < (blocklist.length - 1))
//						o=o+1 ;
//				}	
//				if (scan == false)
//				{
//					break;
//				}
//			}	
//			if (scan == false)
//			{
//				break;
//			}
//		}	
//		}
		
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
