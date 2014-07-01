package tcc.OZ.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import tcc.OZ.Config.OZConfiguration;
import tcc.OZ.blocks.ModBlocks;
import tcc.OZ.lib.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
    public static Item EmeraldDoor;


    public static void init() {
        defItems();
        initGameRegistry();
        initCrafting();
        initLanguageRegistry();
    }

    public static void defItems() {
    	EmeraldDoor = new ItemCustomDoor(OZConfiguration.EmeraldDoorItemID, ModBlocks.EmeraldStone).setUnlocalizedName("DoorEmerald");
    }

    public static void initGameRegistry() {
    }

    public static void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(EmeraldDoor, 1), "ee", "ee", "ee", 'e', ItemStacks.emeraldstone);
        GameRegistry.addRecipe(new ItemStack(EmeraldDoor, 1), "ee", "ee", "ee", 'e', ItemStacks.emeraldbrick);
        GameRegistry.addRecipe(new ItemStack(EmeraldDoor, 1), "ee", "ee", "ee", 'e', ItemStacks.emeraldcarved);
        GameRegistry.addRecipe(new ItemStack(EmeraldDoor, 1), "ee", "ee", "ee", 'e', ItemStacks.emeraldsmooth);
    }
    public static void initLanguageRegistry() {
        LanguageRegistry.addName(EmeraldDoor, "Emerald Door");
    }

}
