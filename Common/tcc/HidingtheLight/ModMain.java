package tcc.HidingtheLight;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.NAME, version = ModInfo.version)
@NetworkMod(channels = { ModInfo.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class ModMain {

	public static int glowairID;
	public static int wandlightingID;
	public static boolean enableCreativeAir;
	public static boolean enableHardcore;
	public static boolean newIcon;
	public static boolean lastsLonger;
	public static int lightlevel;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		glowairID = config.get(Configuration.CATEGORY_BLOCK, "Glowing Air", 501).getInt();
		wandlightingID = config.get(Configuration.CATEGORY_ITEM, "Wand of Hidden Light", 4200).getInt();
		enableCreativeAir = config.get(Configuration.CATEGORY_GENERAL, "Enable Glowing Air in Creative Tab", false).getBoolean(false);
		enableHardcore = config.get(Configuration.CATEGORY_GENERAL, "Enable Hardcore Mode", false).getBoolean(false);
		newIcon = config.get(Configuration.CATEGORY_GENERAL, "Use New Icon", true).getBoolean(true);
		lastsLonger = config.get(Configuration.CATEGORY_GENERAL, "Increased Durability", false).getBoolean(false);
		lightlevel = config.get(Configuration.CATEGORY_GENERAL, "Light Level for Glowing Air (1-10)", 10).getInt();
		
		config.save();
		
		
		
		
		ModInfo.initItems();
		ModInfo.initBlock();
		ModInfo.languageRegistry();
		ModInfo.crafting();

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}

}
