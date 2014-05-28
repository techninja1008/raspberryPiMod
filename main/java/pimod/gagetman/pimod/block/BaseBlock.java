package gagetman.pimod.block;

import gagetman.pimod.ValueReference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block {

	protected BaseBlock(Material material, String id, String texture) {
		super(material);
		this.setBlockTextureName(ValueReference.TEXTURE_ID+":"+texture);
		GameRegistry.registerBlock(this, id);
	}

}
