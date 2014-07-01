package tcc.OZ.armor;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import tcc.OZ.Config.OZConfiguration;
import tcc.OZ.lib.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModArmor {
    public static Item silverSlippers;
    public static Item dressTop;
    public static Item dressBottom;

    public static EnumArmorMaterial dorothysMaterial = EnumHelper.addArmorMaterial("DorothysOutfit", 6, new int[] { 0, 3, 2, 1 }, 45);

    public static void init() {
        defArmor();
        initGameRegistry();
        initCrafting();
        initLanguageRegistry();
    }

    public static void defArmor() {
    	dressTop = new ItemDressTop(OZConfiguration.dressTopID, dorothysMaterial, 0, 1, null);
        dressBottom = new ItemDressBottom(OZConfiguration.dressBottomID, dorothysMaterial, 0, 2, null);
        silverSlippers = new ItemSilverSlippers(OZConfiguration.silverSlippersID, dorothysMaterial, 0, 3, null);
    }

    public static void initGameRegistry() {
    }

    public static void initCrafting() {
        GameRegistry.addRecipe(ItemStacks.dresstop, "w w", "www", "bbb", 'w', ItemStacks.whitewool, 'b', ItemStacks.lightbluewool);
        GameRegistry.addRecipe(ItemStacks.dressbottom, "bbb", "bbb", 'b', ItemStacks.lightbluewool);
        GameRegistry.addRecipe(ItemStacks.silverslippers, "w w", "i i", 'w', ItemStacks.whitewool, 'i', ItemStacks.iron);
    }

    public static void initLanguageRegistry() {
        LanguageRegistry.addName(dressTop, "Dorothy's Dress (Top)");
        LanguageRegistry.addName(dressBottom, "Dorothy's Dress (Bottom)");
        LanguageRegistry.addName(silverSlippers, "Dorothy's Silver Slippers");
    }

}
