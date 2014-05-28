package gagetman.pimod.item;

import net.minecraft.item.Item;

public class ItemRegistry {
	
	public Item raspi;
	
	public ItemRegistry(){
		raspi = new ItemRaspPi("pi", "raspberryPi");
	}
}
