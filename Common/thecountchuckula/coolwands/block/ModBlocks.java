package com.thecountchuckula.coolwands.block;


import com.thecountchuckula.coolwands.utility.ChestFiller;
import com.thecountchuckula.coolwands.utility.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModBlocks
{

    public static final BlockCoolWands glowAir = new GlowAir(Material.air);
    public static final BlockCoolWands leatherBlock = new LeatherBlock(Material.cloth);

    public static void initBlocks()
    {

        GameRegistry.registerBlock(glowAir, "glowAir");
        GameRegistry.registerBlock(leatherBlock, "leatherBlock");

        ChestFiller.initBlocks();

    }

    public static void crafting()
    {
        GameRegistry.addRecipe(new ItemStack(leatherBlock, 1, 0), new Object[]
                {
                    "lll",
                    "lll",
                    "lll", 'l', Items.leather
                }
        );
    }
}
