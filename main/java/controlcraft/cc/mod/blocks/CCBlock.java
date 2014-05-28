package cc.mod.blocks;

import cc.mod.referance.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CCBlock extends Block {
	public CCBlock(Material material, String texture) {
		super(material);
		setBlockTextureName(Main.ASSETS_LOCATION+":"+texture);
		setBlockName(texture);
	}
}
