package com.thecountchuckula.coolwands.item;


import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import com.thecountchuckula.coolwands.item.ItemCoolWands;
import com.thecountchuckula.coolwands.item.WandLighting;
import com.thecountchuckula.coolwands.utility.ChestFiller;
import com.thecountchuckula.coolwands.utility.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems
{

    public static final ItemCoolWands wandlighting = new WandLighting();
    public static final ItemCoolWands denseIronIngot = new DenseIronIngot();
    public static final ItemCoolWands diamondIngot = new DiamondIngot();
    public static final ItemCoolWands bedrockWallPlacer = new WandBedrockWall();
    public static final ItemCoolWands rock = new Rock();

    public static void initItems()
    {

        GameRegistry.registerItem(wandlighting, "wandlighting");
        GameRegistry.registerItem(denseIronIngot, "denseIronIngot");
        GameRegistry.registerItem(diamondIngot, "diamondIngot");
        GameRegistry.registerItem(bedrockWallPlacer, "bedrockWallPlacer");
        GameRegistry.registerItem(rock, "rock");
        ChestFiller.initItems();

    }

    public static void crafting() {
        if(ConfigurationHandler.enableHardcore == false)
        {
            GameRegistry.addRecipe(ItemStacks.wand,
                    "  g",
                    " s ",
                    "n  ",
                    'g', ItemStacks.glow,
                    's', ItemStacks.stick,
                    'n', ItemStacks.gnugget);
        }
        else
        {
            GameRegistry.addRecipe(ItemStacks.wand,
                    "  g",
                    " s ",
                    "n  ",
                    'g', ItemStacks.hglow,
                    's', ItemStacks.hblaze,
                    'n', ItemStacks.hgold);
        }

        GameRegistry.addRecipe(ItemStacks.wand,
                "ggg",
                "gwg",
                "ggg",
                'g', ItemStacks.glow,
                'w', ItemStacks.wandDamaged);
        GameRegistry.addShapelessRecipe(new ItemStack(wandlighting, 1),
                ItemStacks.hglow, ItemStacks.wandDamaged);
        GameRegistry.addShapelessRecipe(new ItemStack(wandlighting, 1),
                ItemStacks.glow, ItemStacks.glow, ItemStacks.glow, ItemStacks.glow, ItemStacks.wandDamaged);
        GameRegistry.addShapelessRecipe(new ItemStack(wandlighting, 1),
                ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.coal, ItemStacks.wandDamaged);

        GameRegistry.addRecipe((ItemStacks.denseIronIngot), "ii",
                "ii", 'i', ItemStacks.iron);
        GameRegistry.addRecipe ((ItemStacks.diamondIngot), "dd",
                'd', ItemStacks.diamond);
        GameRegistry.addRecipe(ItemStacks.cobble, "rrr", "rrr", "rrr", 'r', ItemStacks.rock);
        GameRegistry.addShapelessRecipe(new ItemStack(rock, 9, 0), ItemStacks.cobble);
    }
}
