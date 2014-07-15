package com.thecountchuckula.coolwands.utility;

import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestFiller {

    public static void initItems() {
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(ItemStacks.wand,
                1,1,020));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(ItemStacks.wand,
                1,1,020));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(ItemStacks.wand,
                1,1,020));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST)
        .addItem(new WeightedRandomChestContent(ItemStacks.wand,
                1,1,020));
    }
    public static void initBlocks()
    {

    }

}
