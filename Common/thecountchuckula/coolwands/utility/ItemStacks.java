package com.thecountchuckula.coolwands.utility;

import com.thecountchuckula.coolwands.block.ModBlocks;
import com.thecountchuckula.coolwands.reference.Reference;
import com.thecountchuckula.coolwands.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemStacks {

    
    // Vanilla Items
    public static final ItemStack iron = new ItemStack(Items.iron_ingot, 1, 0);
    public static final ItemStack emerald = new ItemStack(Items.emerald, 1, 0);
    public static final ItemStack glow = new ItemStack(Items.glowstone_dust, 1, 0);
    public static final ItemStack stick = new ItemStack(Items.stick, 1, 0);
    public static final ItemStack gnugget = new ItemStack(Items.gold_nugget, 1, 0);
    public static final ItemStack hblaze = new ItemStack(Items.blaze_rod, 1, 0);
    public static final ItemStack hgold = new ItemStack(Items.gold_ingot, 1, 0);
    public static final ItemStack coal = new ItemStack(Items.coal, 1, Reference.WILDCARD_VALUE);

    public static final ItemStack beef = new ItemStack(Items.beef, 2, 0);
    public static final ItemStack bonemeal = new ItemStack(Items.dye, 1,
            15);
    public static final ItemStack torches = new ItemStack(Blocks.torch, 8, 0);
    public static final ItemStack diamond = new ItemStack(Items.diamond, 1, 0);
    public static final ItemStack leather = new ItemStack(Items.leather, 1, 0);
    public static final ItemStack helmetLeather = new ItemStack(
            Items.leather_helmet, 1, 0);
    public static final ItemStack plateLeather = new ItemStack(
            Items.leather_chestplate, 1, 0);
    public static final ItemStack legsLeather = new ItemStack(Items.leather_leggings,
            1, 0);
    public static final ItemStack bootsLeather = new ItemStack(
            Items.leather_boots, 1, 0);
    public static final ItemStack helmetIron = new ItemStack(Items.iron_helmet,
            1, 0);
    public static final ItemStack plateIron = new ItemStack(Items.iron_chestplate, 1,
            0);
    public static final ItemStack legsIron = new ItemStack(Items.iron_leggings, 1, 0);
    public static final ItemStack bootsIron = new ItemStack(Items.iron_boots, 1,
            0);
    public static final ItemStack helmetDiamond = new ItemStack(
            Items.diamond_helmet, 1, 0);
    public static final ItemStack plateDiamond = new ItemStack(
            Items.diamond_chestplate, 1, 0);
    public static final ItemStack legsDiamond = new ItemStack(Items.diamond_leggings,
            1, 0);
    public static final ItemStack bootsDiamond = new ItemStack(
            Items.diamond_boots, 1, 0);
    public static final ItemStack cobble = new ItemStack(Blocks.cobblestone, 1,
            0);
    
    // Vanilla Blocks
    public static final ItemStack glass = new ItemStack(Blocks.glass, 1, 0);
    public static final ItemStack hglow = new ItemStack(Blocks.glowstone, 1, 0);


    //Modded Stuff
    public static final ItemStack wand = new ItemStack(ModItems.wandlighting, 1, 0);
    public static final ItemStack wandDamaged = new ItemStack(ModItems.wandlighting, 1, Reference.WILDCARD_VALUE);
    public static final ItemStack leatherBlock = new ItemStack(ModBlocks.leatherBlock, 1, 0);
    public static final ItemStack denseIronIngot = new ItemStack(ModItems.denseIronIngot, 1, 0);
    public static final ItemStack diamondIngot = new ItemStack(ModItems.diamondIngot, 1, 0);
    public static final ItemStack rock = new ItemStack(ModItems.rock, 1, 0);


}
