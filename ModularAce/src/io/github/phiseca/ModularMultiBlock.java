package io.github.phiseca;
import org.bukkit.Material;
import org.bukkit.block.Block;


public class ModularMultiBlock {

	public boolean multiblock(Block block,int y,Material M1,Material M2,Material M3,Material M4,Material M5,Material M6,Material M7,Material M8,Material M9)
	 {
		Block block1 = block.getRelative(-1, 0+y, -1);
		Block block2 = block.getRelative(-1, 0+y, 0);
		Block block3 = block.getRelative(-1, 0+y, 1);
		Block block4 = block.getRelative(0, 0+y, -1);
		Block block5 = block.getRelative(0, 0+y, 0);
		Block block6 = block.getRelative(0, 0+y, 1);
		Block block7 = block.getRelative(1, 0+y, -1);
		Block block8 = block.getRelative(1, 0+y, 0);
		Block block9 = block.getRelative(1, 0+y, 1);
		 if ((block1.getType() == M1)&&
			 (block2.getType() == M2)&&
			 (block3.getType() == M3)&&
		     (block4.getType() == M4)&&
		     (block5.getType() == M5)&&
			 (block6.getType() == M6)&&
			 (block7.getType() == M7)&&
			 (block8.getType() == M8)&&
			 (block9.getType() == M9))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
}
