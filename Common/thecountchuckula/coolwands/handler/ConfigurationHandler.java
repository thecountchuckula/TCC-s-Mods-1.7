package com.thecountchuckula.coolwands.handler;

import com.thecountchuckula.coolwands.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static boolean wandofhl = false;
    public static boolean enableCreativeAir;
    public static boolean enableHardcore;
    public static boolean newIcon;
    public static boolean lastsLonger;
    public static int lightlevel;

    public static boolean bwwallwand = false;
    public static int bedrockWallSize;
    public static int bedrockhalf;
    public static int torchlevel;
    public static float torchlight;
    public static boolean hardground;
    public static boolean hardarmor;
    public static boolean mowlawn;


    public static boolean wand3 = false;




    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        wandofhl = configuration.getBoolean("01.a Wand of Hidden Light Enabled", Configuration.CATEGORY_GENERAL, true, "This is the master control for Wand of Hidden Light. Set to false to disable this wand.");
        enableCreativeAir = configuration.getBoolean("01.b Enable Glowing Air in Creative Tab", Configuration.CATEGORY_GENERAL, false, "");
        enableHardcore = configuration.getBoolean("01.c Enable Hardcore Mode", Configuration.CATEGORY_GENERAL, false, "Harder wand recipe.");
        newIcon = configuration.getBoolean("01.d Use New Icon", Configuration.CATEGORY_GENERAL, true, "Set to false for old icon.");
        lastsLonger = configuration.getBoolean("01.e Increased Durability", Configuration.CATEGORY_GENERAL, false, "Make the wand last longer.");
        lightlevel = configuration.getInt("01.f Light Level for Glowing Air", Configuration.CATEGORY_GENERAL, 10, 1, 10, "Light level from invisible block.");

        bwwallwand = configuration.getBoolean("02.a Bedrock Wall Wand Enabled", Configuration.CATEGORY_GENERAL, false, "This is the master control for Bedrock Wall Wand. Set to true to enable this wand.");
        bedrockWallSize = configuration.getInt("02.b Wall Size", Configuration.CATEGORY_GENERAL, 200, 50, 2000, "Bedrock Wall Size (1000 sets the wall to +/- 500 in each direction from where you use the wand.)");
        torchlevel = configuration.getInt("02.c Torch light level", Configuration.CATEGORY_GENERAL, 5, 1, 10, "Light Level for Torches (1-10)");
        hardground = configuration.getBoolean("02.e Hard Ground?", Configuration.CATEGORY_GENERAL, false, "Makes the ground harder to dig to promote caving if set to true.");
        hardarmor = configuration.getBoolean("02.f Hard Armor Recipes?", Configuration.CATEGORY_GENERAL, false, "Makes armor more expensive to craft if true.");
        mowlawn = configuration.getBoolean("02.g Mow the Lawn?", Configuration.CATEGORY_GENERAL, false, "Makes items drop from tall grass if true.");

        wand3 = configuration.getBoolean("03.a Wand 3 Enabled", Configuration.CATEGORY_GENERAL, true, "This is the master control for Wand 3. Set to false to disable this wand.");


        if (configuration.hasChanged())
        {
            configuration.save();
            torchlight = torchlevel / 10F;
            bedrockhalf = bedrockWallSize / 2;
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}