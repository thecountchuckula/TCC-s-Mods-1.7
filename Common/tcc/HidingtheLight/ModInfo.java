package tcc.HidingtheLight;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModInfo {

	public static final String NAME = "Hiding the Light";
	public static final String MOD_ID = "htl";
	public static final String version = "v1.4-1.6.4";

	public static Block glowair;
	public static Item wandlighting;
		
	public static final ItemStack glow = new ItemStack(Item.glowstone, 1, 0);
	public static final ItemStack stick = new ItemStack(Item.stick, 1, 0);
	public static final ItemStack gnugget = new ItemStack(Item.goldNugget, 1, 0);
	public static final ItemStack hblaze = new ItemStack(Item.blazeRod, 1, 0);
	public static final ItemStack hglow = new ItemStack(Block.glowStone, 1, 0);
	public static final ItemStack hgold = new ItemStack(Item.ingotGold, 1, 0);
	
	
	// Block Information Section  - Thanks to travi1997 on MinecraftForums.com for helping me figure out my BlockIDs problems.
	public static void initItems(){
		wandlighting = new WandLighting(ModMain.wandlightingID);
	}
	public static void initBlock(){
		
		glowair = new GlowAir(ModMain.glowairID);
		MinecraftForge.setBlockHarvestLevel(glowair, null, 0);
		GameRegistry.registerBlock(glowair, "glowair");
		
	}
	
	public static void languageRegistry() {
		LanguageRegistry.addName(glowair, "Glowing Air");
		LanguageRegistry.addName(wandlighting, "Wand of Hidden Light");
	}
	
	public static void crafting() {
		if(ModMain.enableHardcore == false) {
        	GameRegistry.addRecipe(new ItemStack(wandlighting, 1),
    				"  g", 
    				" s ", 
    				"n  ",
    				'g', glow,
    				's', stick,
    				'n', gnugget);
		}
		if(ModMain.enableHardcore == true) {
			GameRegistry.addRecipe(new ItemStack(wandlighting, 1), 
					"  g", 
					" s ", 
					"n  ",
					'g', hglow,
					's', hblaze,
					'n', hgold);
		}
	}
}
