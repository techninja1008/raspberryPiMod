package cc.mod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import cc.mod.items.CCItem;


public class Items {
	public static Item metaReader;
	
	public static void instantateItems(){
		metaReader = new CCItem(){
			public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
				int m = world.getBlockMetadata(x, y, z);
				player.addChatMessage(new ChatComponentText("hi, the metadata of the block at X:"+x+" Y:"+y+" Z:"+z+" is "+m));
		        return true;
		    }
		};
	}
	public static void registerItems(){
		GameRegistry.registerItem(metaReader, "metaReader");
	}
}
