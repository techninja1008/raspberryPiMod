package gagetman.pimod;

import gagetman.pimod.block.BlockRegistry;
import gagetman.pimod.item.ItemRegistry;
import gagetman.pimod.proxy.CommonProxy;
import gagetman.pimod.tileentity.TileEntityPi;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ValueReference.MODID, version = ValueReference.VERSION, name = ValueReference.MODID)
public class PiMod {
	@SidedProxy(clientSide="gagetman.pimod.proxy.ClientProxy", serverSide="gagetman.pimod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e){
		new ItemRegistry();
		new BlockRegistry();
	}
	@EventHandler
	public void init(FMLInitializationEvent e){
		proxy.registerProxies();
		GameRegistry.registerTileEntity(TileEntityPi.class, "RaspberryPiComputer");
	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent e){
		
	}
}
