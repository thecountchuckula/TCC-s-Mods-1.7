package tcc.OZ.misc;

import tcc.OZ.armor.ModArmor;
import tcc.OZ.blocks.ModBlocks;

public class Crafting {

    public static void init() {
        ModArmor.initCrafting();
        ModBlocks.initCrafting();
    }

}
