package gagetman.pimod.proxy;

import gagetman.pimod.tileentity.TileEntityPi;
import gagetman.pimod.tileentity.render.TileEntityPiRender;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
	public void registerProxies(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPi.class, new TileEntityPiRender());
		System.out.println("Render Render Render Render Render Render Render");
	}
}
