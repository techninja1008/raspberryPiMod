package gagetman.pimod.block;

import net.minecraft.block.Block;

public class BlockRegistry {
	
	public Block raspi;
	
	public BlockRegistry(){
		raspi = new RaspberryPi("piBlock").setBlockName("raspberryPi");
	}
}
