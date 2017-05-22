package redCable;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Game_Item {
	public static final Game_Item_Object BLOCK_REDCABLE = new Game_Item_Object();
	public static void setNameItem(Item item, String name)
	{
		item.setRegistryName(TheModid.MODID, name).setUnlocalizedName(TheModid.MODID + "." + name);
		
	}
	@SideOnly(Side.CLIENT)
	public static void registerItemsModels()
	{
		registerModel(BLOCK_REDCABLE, 0);
	}
	@SideOnly(Side.CLIENT)
	public static void registerModel(Item item, int metadata)
	{
		if (metadata < 0) metadata = 0;
		String resourceName = item.getUnlocalizedName().substring(5).replace('.', ':');
		if (metadata > 0) resourceName += "_m" + String.valueOf(metadata);
		
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(resourceName, "inventory"));
	}
}
