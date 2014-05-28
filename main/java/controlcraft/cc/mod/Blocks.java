package cc.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cc.mod.blocks.BlockCable;
import cc.mod.blocks.BlockServer;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	public static Block blockCable;
	public static Block blockServer;
	
	public static void instantateBlocks(){
		blockCable = new BlockCable(Material.circuits, "blockCable");
		blockServer = new BlockServer(Material.iron, "blockServer");
	}
	public static void registerBlocks(){
		GameRegistry.registerBlock(blockCable, "blockCable");
		GameRegistry.registerBlock(blockServer, "blockServer");
	}
}
