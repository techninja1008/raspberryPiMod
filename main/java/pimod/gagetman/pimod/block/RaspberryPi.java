package gagetman.pimod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import gagetman.pimod.tileentity.TileEntityPi;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RaspberryPi extends Block {

	public RaspberryPi(String id) {
		super(Material.iron);
		GameRegistry.registerBlock(this, id);
	}
	
	public TileEntity createTileEntity(World word, int metadata){
		return new TileEntityPi();
	}
	public boolean isOpaqueCube(){
		return false;
	}
	public boolean renderAsNormalBlock(){
		return false;
	}
	public int getRenderType(){
		return -1;
	}
}
