package cc.mod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCable extends CCBlock {
	
	private World world;
	
	public BlockCable(Material material, String texture) {
		super(material, texture);
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		this.world = world;
		doMetaUpdate(world, x, y, z);
	}
	
    public void onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ){
    	doMetaUpdate(this.world, x, y, z);
    }
    
    public void doMetaUpdate(World world, int x, int y, int z){
    	System.out.println("meta update");
    	for(int x1 = 0; x1<2; x1++){
    		for(int y1 = 0; y1<2; y1++){
    			for(int z1 = 0; z1<2; z1++){
    	    		if(x+y+z==1){
    	    			if(world.getBlock(x+x1, y+y1, z+z1) instanceof BlockServer){
    	    				world.setBlockMetadataWithNotify(x, y, z, 1, 7);
    	    				return;
    	    			}
    	    		}
    	    	}
        	}
    	}
    	for(int x1 = 0; x1<2; x1++){
    		for(int y1 = 0; y1<2; y1++){
    			for(int z1 = 0; z1<2; z1++){
    	    		if(x+y+z==1){
    	    			if(world.getBlock(x+x1, y+y1, z+z1) instanceof BlockCable){
    	    				if(world.getBlockMetadata(x+x1, y+y1, z+z1) == 3){
    	    					world.setBlockMetadataWithNotify(x, y, z, 1, 7);
    	    					return;
    	    				}
    	    			}
    	    		}
    	    	}
        	}
    	}
    	for(int x1 = 0; x1<2; x1++){
    		for(int y1 = 0; y1<2; y1++){
    			for(int z1 = 0; z1<2; z1++){
    	    		if(x+y+z==1){
    	    			if(world.getBlock(x+x1, y+y1, z+z1) instanceof BlockCable){
    	    				if(world.getBlockMetadata(x+x1, y+y1, z+z1) == 2){
    	    					world.setBlockMetadataWithNotify(x, y, z, 3, 7);
    	    					return;
    	    				}
    	    			}
    	    		}
    	    	}
        	}
    	}
    	for(int x1 = 0; x1<2; x1++){
    		for(int y1 = 0; y1<2; y1++){
    			for(int z1 = 0; z1<2; z1++){
    	    		if(x+y+z==1){
    	    			if(world.getBlock(x+x1, y+y1, z+z1) instanceof BlockCable){
    	    				if(world.getBlockMetadata(x+x1, y+y1, z+z1) == 1){
    	    					world.setBlockMetadataWithNotify(x, y, z, 2, 7);
    	    					return;
    	    				}
    	    			}
    	    		}
    	    	}
        	}
    	}
    	
    }

}
