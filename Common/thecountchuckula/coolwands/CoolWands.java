package com.thecountchuckula.coolwands;


import com.thecountchuckula.coolwands.block.ModBlocks;
import com.thecountchuckula.coolwands.handler.BatKillHandler;
import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import com.thecountchuckula.coolwands.handler.GhastKillHandler;
import com.thecountchuckula.coolwands.proxy.IProxy;
import com.thecountchuckula.coolwands.reference.Reference;
import com.thecountchuckula.coolwands.item.ModItems;
import com.thecountchuckula.coolwands.utility.LogHelper;
import com.thecountchuckula.coolwands.vanilla.VanillaModifiers;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class CoolWands
{

    @Mod.Instance(Reference.MOD_ID)
    public static CoolWands instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.initItems();
        ModBlocks.initBlocks();
        VanillaModifiers.preinit();

        LogHelper.info("Pre Initialization Complete!");

    }

    @Mod.EventHandler
     public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BatKillHandler());
        MinecraftForge.EVENT_BUS.register(new GhastKillHandler());
        ModItems.crafting();
        ModBlocks.crafting();
        VanillaModifiers.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        VanillaModifiers.postinit();

        LogHelper.info("Post Initialization Complete!");
    }
}
