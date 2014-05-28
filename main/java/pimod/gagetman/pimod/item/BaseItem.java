package gagetman.pimod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import gagetman.pimod.ValueReference;
import net.minecraft.item.Item;

public class BaseItem extends Item {
	public BaseItem(String id, String texture){
		this.setTextureName(ValueReference.TEXTURE_ID+":"+texture);
		this.setUnlocalizedName(id);
		GameRegistry.registerItem(this, id);
	}
}
