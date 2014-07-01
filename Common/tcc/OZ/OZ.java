package tcc.OZ;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import tcc.OZ.Config.OZConfiguration;
import tcc.OZ.armor.ModArmor;
import tcc.OZ.blocks.ModBlocks;
import tcc.OZ.items.ModItems;
import tcc.OZ.lib.Reference;
import tcc.OZ.misc.Crafting;
import tcc.OZ.misc.LanguageReg;
import tcc.OZ.proxy.CommonProxy;
import tcc.OZ.utils.ChestFiller;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.version)
@NetworkMod(channels = { Reference.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class OZ {
    public static CreativeTabs tabOZ = new CreativeTabs("OZ") {
        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(Block.blockEmerald, 1, 0);
        }
    };

    public static CreativeTabs tabOZ_WIP = new CreativeTabs("OZ_WIP") {

        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(Block.oreEmerald, 1, 0);
        }
    };

    @SidedProxy(clientSide = Reference.PROXY_PATH + ".ClientProxy", serverSide = Reference.PROXY_PATH + ".CommonProxy")
    public static CommonProxy proxy;
    public static Configuration cfg;
    private static Configuration config;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        cfg = config;

        OZConfiguration.init();
        ModBlocks.init();
        ModArmor.init();
        ModItems.init();
        LanguageReg.init();

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ChestFiller.init();
        Crafting.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        

    }

}
