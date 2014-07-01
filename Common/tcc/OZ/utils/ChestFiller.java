package tcc.OZ.utils;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import tcc.OZ.armor.ModArmor;

public class ChestFiller {

    public static void init() {
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.silverSlippers),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressTop),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressBottom),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.silverSlippers),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressTop),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressBottom),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.silverSlippers),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressTop),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.dressBottom),
                1,1,045));
    }

}
