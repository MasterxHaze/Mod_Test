package redCable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Game_Item_Object extends Item {
	
	public static final String NAME = "redCable_Item";
	
    public Game_Item_Object()
    {
        super();

        Game_Item.setNameItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(64);
    }
}
