package cc.mod;

import cc.mod.referance.Main;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//@Mod(modid = Main.MOD_ID, version = Main.VERSION, name = Main.NICE_NAME)
public class CC {
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e){
		Blocks.instantateBlocks();
		Items.instantateItems();
		Blocks.registerBlocks();
		Items.registerItems();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent e){
		
	}
}
