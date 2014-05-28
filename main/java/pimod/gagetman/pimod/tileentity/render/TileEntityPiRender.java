package gagetman.pimod.tileentity.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPiRender extends TileEntitySpecialRenderer{
	
	public TileEntityPiRender(){
		System.out.println("Registered");
	}
	
	public void renderTileEntityAt(TileEntity var1, double var2, double var4,double var6, float var8) {
		System.out.println("YOLO");
	}
}
