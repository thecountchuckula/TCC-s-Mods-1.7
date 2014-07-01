package tcc.OZ.misc;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageReg {

    public static void init() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.OZ", "en_US", "OZ");
        LanguageRegistry.instance().addStringLocalization("itemGroup.OZ_WIP", "en_US", "OZ - Unfinished Items");
    }

}
