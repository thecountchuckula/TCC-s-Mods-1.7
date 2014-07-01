package tcc.OZ.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import tcc.OZ.Config.OZConfiguration;
import tcc.OZ.lib.ItemStacks;
import tcc.OZ.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {
	// Clay Blocks
    public static Block BlackClayBrick;
    public static Block BlueClayBrick;
    public static Block BrownClayBrick;
    public static Block CyanClayBrick;
    public static Block GrayClayBrick;
    public static Block GreenClayBrick;
    public static Block LightBlueClayBrick;
    public static Block LightGrayClayBrick;
    public static Block LimeClayBrick;
    public static Block MagentaClayBrick;
    public static Block OrangeClayBrick;
    public static Block PinkClayBrick;
    public static Block PurpleClayBrick;
    public static Block RedClayBrick;
    public static Block WhiteClayBrick;
    public static Block YellowClayBrick;
    
    // Clay Stair Blocks
    public static Block BlackClayBrickStair;
    public static Block BlueClayBrickStair;
    public static Block BrownClayBrickStair;
    public static Block CyanClayBrickStair;
    public static Block GrayClayBrickStair;
    public static Block GreenClayBrickStair;
    public static Block LightBlueClayBrickStair;
    public static Block LightGrayClayBrickStair;
    public static Block LimeClayBrickStair;
    public static Block MagentaClayBrickStair;
    public static Block OrangeClayBrickStair;
    public static Block PinkClayBrickStair;
    public static Block PurpleClayBrickStair;
    public static Block RedClayBrickStair;
    public static Block WhiteClayBrickStair;
    public static Block YellowClayBrickStair;
    
    // Clay Wall Blocks
    public static Block BlackClayBrickWall;
    public static Block BlueClayBrickWall;
    public static Block BrownClayBrickWall;
    public static Block CyanClayBrickWall;
    public static Block GrayClayBrickWall;
    public static Block GreenClayBrickWall;
    public static Block LightBlueClayBrickWall;
    public static Block LightGrayClayBrickWall;
    public static Block LimeClayBrickWall;
    public static Block MagentaClayBrickWall;
    public static Block OrangeClayBrickWall;
    public static Block PinkClayBrickWall;
    public static Block PurpleClayBrickWall;
    public static Block RedClayBrickWall;
    public static Block WhiteClayBrickWall;
    public static Block YellowClayBrickWall;
    
    // Emerald Blocks
    public static Block EmeraldStone;
    public static Block EmeraldCarved;
    public static Block EmeraldSmooth;
    public static Block EmeraldBrick;
    
    // Non-Standard Emerald Blocks
    public static Block EmeraldBrickStair;
    public static Block EmeraldBrickWall;
    public static Block EmeraldStair;
    public static Block EmeraldWall;
    public static Block EmeraldDoor;
    public static Block EmeraldGlass;
    public static Block EmeraldGlassPane;

    public static void init() {
        defBlocks();
        initHarvestLevels();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defBlocks() {
    	//Clay Bricks
        BlackClayBrick = new BlockBrick(OZConfiguration.BlackClayBrickID, Material.rock)
        .setUnlocalizedName("BlackClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BlueClayBrick = new BlockBrick(OZConfiguration.BlueClayBrickID, Material.rock)
        .setUnlocalizedName("BlueClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BrownClayBrick = new BlockBrick(OZConfiguration.BrownClayBrickID, Material.rock)
        .setUnlocalizedName("BrownClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        CyanClayBrick = new BlockBrick(OZConfiguration.CyanClayBrickID, Material.rock)
        .setUnlocalizedName("CyanClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GrayClayBrick = new BlockBrick(OZConfiguration.GrayClayBrickID, Material.rock)
        .setUnlocalizedName("GrayClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GreenClayBrick = new BlockBrick(OZConfiguration.GreenClayBrickID, Material.rock)
        .setUnlocalizedName("GreenClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightBlueClayBrick = new BlockBrick(OZConfiguration.LightBlueClayBrickID, Material.rock)
        .setUnlocalizedName("LightBlueClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightGrayClayBrick = new BlockBrick(OZConfiguration.LightGrayClayBrickID, Material.rock)
        .setUnlocalizedName("LightGrayClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LimeClayBrick = new BlockBrick(OZConfiguration.LimeClayBrickID, Material.rock)
        .setUnlocalizedName("LimeClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        MagentaClayBrick = new BlockBrick(OZConfiguration.MagentaClayBrickID, Material.rock)
        .setUnlocalizedName("MagentaClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        OrangeClayBrick = new BlockBrick(OZConfiguration.OrangeClayBrickID, Material.rock)
        .setUnlocalizedName("OrangeClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PinkClayBrick = new BlockBrick(OZConfiguration.PinkClayBrickID, Material.rock)
        .setUnlocalizedName("PinkClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PurpleClayBrick = new BlockBrick(OZConfiguration.PurpleClayBrickID, Material.rock)
        .setUnlocalizedName("PurpleClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        RedClayBrick = new BlockBrick(OZConfiguration.RedClayBrickID, Material.rock)
        .setUnlocalizedName("RedClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        WhiteClayBrick = new BlockBrick(OZConfiguration.WhiteClayBrickID, Material.rock)
        .setUnlocalizedName("WhiteClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        YellowClayBrick = new BlockBrick(OZConfiguration.YellowClayBrickID, Material.rock)
        .setUnlocalizedName("YellowClayBrick").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
    	//Clay Brick Stairs
        BlackClayBrickStair = new BlockCustomStairs(OZConfiguration.BlackClayBrickStairID, BlackClayBrick, 0)
        .setUnlocalizedName("BlackClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BlueClayBrickStair = new BlockCustomStairs(OZConfiguration.BlueClayBrickStairID, BlueClayBrick, 0)
        .setUnlocalizedName("BlueClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BrownClayBrickStair = new BlockCustomStairs(OZConfiguration.BrownClayBrickStairID, BrownClayBrick, 0)
        .setUnlocalizedName("BrownClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        CyanClayBrickStair = new BlockCustomStairs(OZConfiguration.CyanClayBrickStairID,  CyanClayBrick, 0)
        .setUnlocalizedName("CyanClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GrayClayBrickStair = new BlockCustomStairs(OZConfiguration.GrayClayBrickStairID, GrayClayBrick, 0)
        .setUnlocalizedName("GrayClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GreenClayBrickStair = new BlockCustomStairs(OZConfiguration.GreenClayBrickStairID, GreenClayBrick, 0)
        .setUnlocalizedName("GreenClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightBlueClayBrickStair = new BlockCustomStairs(OZConfiguration.LightBlueClayBrickStairID, LightBlueClayBrick, 0)
        .setUnlocalizedName("LightBlueClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightGrayClayBrickStair = new BlockCustomStairs(OZConfiguration.LightGrayClayBrickStairID, LightGrayClayBrick, 0)
        .setUnlocalizedName("LightGrayClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LimeClayBrickStair = new BlockCustomStairs(OZConfiguration.LimeClayBrickStairID, LimeClayBrick, 0)
        .setUnlocalizedName("LimeClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        MagentaClayBrickStair = new BlockCustomStairs(OZConfiguration.MagentaClayBrickStairID, MagentaClayBrick, 0)
        .setUnlocalizedName("MagentaClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        OrangeClayBrickStair = new BlockCustomStairs(OZConfiguration.OrangeClayBrickStairID, OrangeClayBrick, 0)
        .setUnlocalizedName("OrangeClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PinkClayBrickStair = new BlockCustomStairs(OZConfiguration.PinkClayBrickStairID, PinkClayBrick, 0)
        .setUnlocalizedName("PinkClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PurpleClayBrickStair = new BlockCustomStairs(OZConfiguration.PurpleClayBrickStairID, PurpleClayBrick, 0)
        .setUnlocalizedName("PurpleClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        RedClayBrickStair = new BlockCustomStairs(OZConfiguration.RedClayBrickStairID, RedClayBrick, 0)
        .setUnlocalizedName("RedClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        WhiteClayBrickStair = new BlockCustomStairs(OZConfiguration.WhiteClayBrickStairID, WhiteClayBrick, 0)
        .setUnlocalizedName("WhiteClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        YellowClayBrickStair = new BlockCustomStairs(OZConfiguration.YellowClayBrickStairID, YellowClayBrick, 0)
        .setUnlocalizedName("YellowClayBrickStairs").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
    	//Clay Brick Walls
        BlackClayBrickWall = new BlockCustomWall(OZConfiguration.BlackClayBrickWallID, BlackClayBrick)
        .setUnlocalizedName("BlackClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BlueClayBrickWall = new BlockCustomWall(OZConfiguration.BlueClayBrickWallID, BlueClayBrick)
        .setUnlocalizedName("BlueClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        BrownClayBrickWall = new BlockCustomWall(OZConfiguration.BrownClayBrickWallID, BrownClayBrick)
        .setUnlocalizedName("BrownClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        CyanClayBrickWall = new BlockCustomWall(OZConfiguration.CyanClayBrickWallID,  CyanClayBrick)
        .setUnlocalizedName("CyanClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GrayClayBrickWall = new BlockCustomWall(OZConfiguration.GrayClayBrickWallID, GrayClayBrick)
        .setUnlocalizedName("GrayClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        GreenClayBrickWall = new BlockCustomWall(OZConfiguration.GreenClayBrickWallID, GreenClayBrick)
        .setUnlocalizedName("GreenClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightBlueClayBrickWall = new BlockCustomWall(OZConfiguration.LightBlueClayBrickWallID, LightBlueClayBrick)
        .setUnlocalizedName("LightBlueClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LightGrayClayBrickWall = new BlockCustomWall(OZConfiguration.LightGrayClayBrickWallID, LightGrayClayBrick)
        .setUnlocalizedName("LightGrayClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        LimeClayBrickWall = new BlockCustomWall(OZConfiguration.LimeClayBrickWallID, LimeClayBrick)
        .setUnlocalizedName("LimeClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        MagentaClayBrickWall = new BlockCustomWall(OZConfiguration.MagentaClayBrickWallID, MagentaClayBrick)
        .setUnlocalizedName("MagentaClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        OrangeClayBrickWall = new BlockCustomWall(OZConfiguration.OrangeClayBrickWallID, OrangeClayBrick)
        .setUnlocalizedName("OrangeClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PinkClayBrickWall = new BlockCustomWall(OZConfiguration.PinkClayBrickWallID, PinkClayBrick)
        .setUnlocalizedName("PinkClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        PurpleClayBrickWall = new BlockCustomWall(OZConfiguration.PurpleClayBrickWallID, PurpleClayBrick)
        .setUnlocalizedName("PurpleClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        RedClayBrickWall = new BlockCustomWall(OZConfiguration.RedClayBrickWallID, RedClayBrick)
        .setUnlocalizedName("RedClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        WhiteClayBrickWall = new BlockCustomWall(OZConfiguration.WhiteClayBrickWallID, WhiteClayBrick)
        .setUnlocalizedName("WhiteClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        YellowClayBrickWall = new BlockCustomWall(OZConfiguration.YellowClayBrickWallID, YellowClayBrick)
        .setUnlocalizedName("YellowClayBrickWall").setHardness(1.25F)
        .setResistance(7.0F).setStepSound(Block.soundStoneFootstep);
        //Emerald Blocks
        EmeraldBrick = new BlockBrick(OZConfiguration.EmeraldBrickID, Material.rock)
        .setUnlocalizedName("EmeraldBrick").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldStone = new MultiSidedBlock(OZConfiguration.EmeraldStoneID, Material.rock)
        .setUnlocalizedName("EmeraldStone").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldCarved = new MultiSidedBlock(OZConfiguration.EmeraldCarvedID, Material.rock)
        .setUnlocalizedName("EmeraldCarved").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldSmooth = new MultiSidedBlock(OZConfiguration.EmeraldSmoothID, Material.rock)
        .setUnlocalizedName("EmeraldSmooth").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        // Non-Standard Emerald Blocks
        EmeraldBrickStair = new BlockCustomStairs(OZConfiguration.EmeraldBrickStairID, EmeraldBrick, 0)
        .setUnlocalizedName("EmeraldBrickStair").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldBrickWall = new BlockCustomWall(OZConfiguration.EmeraldBrickWallID, EmeraldBrick)
        .setUnlocalizedName("EmeraldBrickWall").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldStair = new BlockCustomStairs(OZConfiguration.EmeraldStairID, EmeraldStone, 0)
        .setUnlocalizedName("EmeraldStair").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldWall = new BlockCustomWall(OZConfiguration.EmeraldWallID, EmeraldStone)
        .setUnlocalizedName("EmeraldWall").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldDoor = new BlockCustomDoor(OZConfiguration.EmeraldDoorBlockID, Material.rock,EmeraldStone)
        .setUnlocalizedName("EmeraldDoor").setLightValue(1F).setLightOpacity(0).setHardness(5.0F)
        .setResistance(10.0F).setStepSound(Block.soundMetalFootstep);
        EmeraldGlass = new BlockCustomGlass(OZConfiguration.EmeraldGlassID, "EmeraldGlass", Material.glass, false)
        .setUnlocalizedName("EmeraldGlass").setLightValue(1F).setLightOpacity(0).setHardness(.3F)
        .setStepSound(Block.soundGlassFootstep);
        EmeraldGlassPane = new BlockCustomPane(OZConfiguration.EmeraldGlassPaneID, Reference.MOD_ID.toLowerCase() + ":" + "EmeraldGlass", Reference.MOD_ID.toLowerCase() + ":" + "EmeraldGlassPane_top", Material.glass, false)
        .setUnlocalizedName("EmeraldGlassPane").setLightValue(1F).setLightOpacity(0).setHardness(.3F)
        .setStepSound(Block.soundGlassFootstep);
    }

    public static void initHarvestLevels() {
    	//Clay Bricks
        MinecraftForge.setBlockHarvestLevel(BlackClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlueClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BrownClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(CyanClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GrayClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GreenClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightBlueClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightGrayClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LimeClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(MagentaClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OrangeClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PinkClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PurpleClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(RedClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(WhiteClayBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(YellowClayBrick, "Pickaxe", 2);
    	//Clay Brick Stairs
        MinecraftForge.setBlockHarvestLevel(BlackClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlueClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BrownClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(CyanClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GrayClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GreenClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightBlueClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightGrayClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LimeClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(MagentaClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OrangeClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PinkClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PurpleClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(RedClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(WhiteClayBrickStair, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(YellowClayBrickStair, "Pickaxe", 2);
    	//Clay Brick Walls
        MinecraftForge.setBlockHarvestLevel(BlackClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BlueClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(BrownClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(CyanClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GrayClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(GreenClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightBlueClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LightGrayClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(LimeClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(MagentaClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OrangeClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PinkClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PurpleClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(RedClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(WhiteClayBrickWall, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(YellowClayBrickWall, "Pickaxe", 2);
        //Emerald Stone
        MinecraftForge.setBlockHarvestLevel(EmeraldBrick, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldStone, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldCarved, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldSmooth, "Pickaxe", 3);
        // Non-Standard Emerald Blocks
        MinecraftForge.setBlockHarvestLevel(EmeraldBrickStair, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldBrickWall, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldStair, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldStone, "Pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(EmeraldGlass, "Pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(EmeraldGlassPane, "Pickaxe", 0);
    }

    public static void initGameRegistry() {
    	//Clay Bricks
        GameRegistry.registerBlock(BlackClayBrick, "BlackClayBrick");
        GameRegistry.registerBlock(BlueClayBrick, "BlueClayBrick");
        GameRegistry.registerBlock(BrownClayBrick, "BrownClayBrick");
        GameRegistry.registerBlock(CyanClayBrick, "CyanClayBrick");
        GameRegistry.registerBlock(GrayClayBrick, "GrayClayBrick");
        GameRegistry.registerBlock(GreenClayBrick, "GreenClayBrick");
        GameRegistry.registerBlock(LightBlueClayBrick, "LightBlueClayBrick");
        GameRegistry.registerBlock(LightGrayClayBrick, "LightGrayClayBrick");
        GameRegistry.registerBlock(LimeClayBrick, "LimeClayBrick");
        GameRegistry.registerBlock(MagentaClayBrick, "MagentaClayBrick");
        GameRegistry.registerBlock(OrangeClayBrick, "OrangeClayBrick");
        GameRegistry.registerBlock(PinkClayBrick, "PinkClayBrick");
        GameRegistry.registerBlock(PurpleClayBrick, "PurpleClayBrick");
        GameRegistry.registerBlock(RedClayBrick, "RedClayBrick");
        GameRegistry.registerBlock(WhiteClayBrick, "WhiteClayBrick");
        GameRegistry.registerBlock(YellowClayBrick, "YellowClayBrick");
    	//Clay Brick Stairs
        GameRegistry.registerBlock(BlackClayBrickStair, "BlackClayBrickStair");
        GameRegistry.registerBlock(BlueClayBrickStair, "BlueClayBrickStair");
        GameRegistry.registerBlock(BrownClayBrickStair, "BrownClayBrickStair");
        GameRegistry.registerBlock(CyanClayBrickStair, "CyanClayBrickStair");
        GameRegistry.registerBlock(GrayClayBrickStair, "GrayClayBrickStair");
        GameRegistry.registerBlock(GreenClayBrickStair, "GreenClayBrickStair");
        GameRegistry.registerBlock(LightBlueClayBrickStair, "LightBlueClayBrickStair");
        GameRegistry.registerBlock(LightGrayClayBrickStair, "LightGrayClayBrickStair");
        GameRegistry.registerBlock(LimeClayBrickStair, "LimeClayBrickStair");
        GameRegistry.registerBlock(MagentaClayBrickStair, "MagentaClayBrickStair");
        GameRegistry.registerBlock(OrangeClayBrickStair, "OrangeClayBrickStair");
        GameRegistry.registerBlock(PinkClayBrickStair, "PinkClayBrickStair");
        GameRegistry.registerBlock(PurpleClayBrickStair, "PurpleClayBrickStair");
        GameRegistry.registerBlock(RedClayBrickStair, "RedClayBrickStair");
        GameRegistry.registerBlock(WhiteClayBrickStair, "WhiteClayBrickStair");
        GameRegistry.registerBlock(YellowClayBrickStair, "YellowClayBrickStair");
    	//Clay Brick Walls
        GameRegistry.registerBlock(BlackClayBrickWall, "BlackClayBrickWall");
        GameRegistry.registerBlock(BlueClayBrickWall, "BlueClayBrickWall");
        GameRegistry.registerBlock(BrownClayBrickWall, "BrownClayBrickWall");
        GameRegistry.registerBlock(CyanClayBrickWall, "CyanClayBrickWall");
        GameRegistry.registerBlock(GrayClayBrickWall, "GrayClayBrickWall");
        GameRegistry.registerBlock(GreenClayBrickWall, "GreenClayBrickWall");
        GameRegistry.registerBlock(LightBlueClayBrickWall, "LightBlueClayBrickWall");
        GameRegistry.registerBlock(LightGrayClayBrickWall, "LightGrayClayBrickWall");
        GameRegistry.registerBlock(LimeClayBrickWall, "LimeClayBrickWall");
        GameRegistry.registerBlock(MagentaClayBrickWall, "MagentaClayBrickWall");
        GameRegistry.registerBlock(OrangeClayBrickWall, "OrangeClayBrickWall");
        GameRegistry.registerBlock(PinkClayBrickWall, "PinkClayBrickWall");
        GameRegistry.registerBlock(PurpleClayBrickWall, "PurpleClayBrickWall");
        GameRegistry.registerBlock(RedClayBrickWall, "RedClayBrickWall");
        GameRegistry.registerBlock(WhiteClayBrickWall, "WhiteClayBrickWall");
        GameRegistry.registerBlock(YellowClayBrickWall, "YellowClayBrickWall");
        //Emerald Stone
        GameRegistry.registerBlock(EmeraldBrick, "EmeraldBrick");
        GameRegistry.registerBlock(EmeraldStone, "EmeraldStone");
        GameRegistry.registerBlock(EmeraldCarved, "EmeraldCarved");
        GameRegistry.registerBlock(EmeraldSmooth, "EmeraldSmooth");
        // Non-Standard Emerald Blocks
        GameRegistry.registerBlock(EmeraldBrickStair, "EmeraldBrickStair");
        GameRegistry.registerBlock(EmeraldBrickWall, "EmeraldBrickWall");
        GameRegistry.registerBlock(EmeraldStair, "EmeraldStair");
        GameRegistry.registerBlock(EmeraldWall, "EmeraldWall");
        GameRegistry.registerBlock(EmeraldGlass, "EmeraldGlass");
        GameRegistry.registerBlock(EmeraldGlassPane, "EmeraldGlassPAne");
    }

    public static void initCrafting() {
    	// Clay Bricks
        GameRegistry.addRecipe(new ItemStack(WhiteClayBrick, 4), "ss", "ss", 's', ItemStacks.whitestainedclay);
        GameRegistry.addRecipe(new ItemStack(OrangeClayBrick, 4), "ss", "ss", 's', ItemStacks.orangestainedclay);
        GameRegistry.addRecipe(new ItemStack(MagentaClayBrick, 4), "ss", "ss", 's', ItemStacks.magentastainedclay);
        GameRegistry.addRecipe(new ItemStack(LightBlueClayBrick, 4), "ss", "ss", 's', ItemStacks.lightbluestainedclay);
        GameRegistry.addRecipe(new ItemStack(YellowClayBrick, 4), "ss", "ss", 's', ItemStacks.yellowstainedclay);
        GameRegistry.addRecipe(new ItemStack(LimeClayBrick, 4), "ss", "ss", 's', ItemStacks.limestainedclay);
        GameRegistry.addRecipe(new ItemStack(PinkClayBrick, 4), "ss", "ss", 's', ItemStacks.pinkstainedclay);
        GameRegistry.addRecipe(new ItemStack(GrayClayBrick, 4), "ss", "ss", 's', ItemStacks.graystainedclay);
        GameRegistry.addRecipe(new ItemStack(LightGrayClayBrick, 4), "ss", "ss", 's', ItemStacks.lightgraystainedclay);
        GameRegistry.addRecipe(new ItemStack(CyanClayBrick, 4), "ss", "ss", 's', ItemStacks.cyanstainedclay);
        GameRegistry.addRecipe(new ItemStack(PurpleClayBrick, 4), "ss", "ss", 's', ItemStacks.purplestainedclay);
        GameRegistry.addRecipe(new ItemStack(BlueClayBrick, 4), "ss", "ss", 's', ItemStacks.bluestainedclay);
        GameRegistry.addRecipe(new ItemStack(BrownClayBrick, 4), "ss", "ss", 's', ItemStacks.brownstainedclay);
        GameRegistry.addRecipe(new ItemStack(GreenClayBrick, 4), "ss", "ss", 's', ItemStacks.greenstainedclay);
        GameRegistry.addRecipe(new ItemStack(RedClayBrick, 4), "ss", "ss", 's', ItemStacks.redstainedclay);
        GameRegistry.addRecipe(new ItemStack(BlackClayBrick, 4), "ss", "ss", 's', ItemStacks.blackstainedclay);
    	// Clay Brick Stairs
        GameRegistry.addRecipe(new ItemStack(WhiteClayBrickStair, 4), "s  ", "ss ", "sss", 's', WhiteClayBrick);
        GameRegistry.addRecipe(new ItemStack(OrangeClayBrickStair, 4), "s  ", "ss ", "sss", 's', OrangeClayBrick);
        GameRegistry.addRecipe(new ItemStack(MagentaClayBrickStair, 4), "s  ", "ss ", "sss", 's', MagentaClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightBlueClayBrickStair, 4), "s  ", "ss ", "sss", 's', LightBlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(YellowClayBrickStair, 4), "s  ", "ss ", "sss", 's', YellowClayBrick);
        GameRegistry.addRecipe(new ItemStack(LimeClayBrickStair, 4), "s  ", "ss ", "sss", 's', LimeClayBrick);
        GameRegistry.addRecipe(new ItemStack(PinkClayBrickStair, 4), "s  ", "ss ", "sss", 's', PinkClayBrick);
        GameRegistry.addRecipe(new ItemStack(GrayClayBrickStair, 4), "s  ", "ss ", "sss", 's', GrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightGrayClayBrickStair, 4), "s  ", "ss ", "sss", 's', LightGrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(CyanClayBrickStair, 4), "s  ", "ss ", "sss", 's', CyanClayBrick);
        GameRegistry.addRecipe(new ItemStack(PurpleClayBrickStair, 4), "s  ", "ss ", "sss", 's', PurpleClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlueClayBrickStair, 4), "s  ", "ss ", "sss", 's', BlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(BrownClayBrickStair, 4), "s  ", "ss ", "sss", 's', BrownClayBrick);
        GameRegistry.addRecipe(new ItemStack(GreenClayBrickStair, 4), "s  ", "ss ", "sss", 's', GreenClayBrick);
        GameRegistry.addRecipe(new ItemStack(RedClayBrickStair, 4), "s  ", "ss ", "sss", 's', RedClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlackClayBrickStair, 4), "s  ", "ss ", "sss", 's', BlackClayBrick);
        GameRegistry.addRecipe(new ItemStack(WhiteClayBrickStair, 4), "  s", " ss", "sss", 's', WhiteClayBrick);
        GameRegistry.addRecipe(new ItemStack(OrangeClayBrickStair, 4), "  s", " ss", "sss", 's', OrangeClayBrick);
        GameRegistry.addRecipe(new ItemStack(MagentaClayBrickStair, 4), "  s", " ss", "sss", 's', MagentaClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightBlueClayBrickStair, 4), "  s", " ss", "sss", 's', LightBlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(YellowClayBrickStair, 4), "  s", " ss", "sss", 's', YellowClayBrick);
        GameRegistry.addRecipe(new ItemStack(LimeClayBrickStair, 4), "  s", " ss", "sss", 's', LimeClayBrick);
        GameRegistry.addRecipe(new ItemStack(PinkClayBrickStair, 4), "  s", " ss", "sss", 's', PinkClayBrick);
        GameRegistry.addRecipe(new ItemStack(GrayClayBrickStair, 4), "  s", " ss", "sss", 's', GrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightGrayClayBrickStair, 4), "  s", " ss", "sss", 's', LightGrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(CyanClayBrickStair, 4), "  s", " ss", "sss", 's', CyanClayBrick);
        GameRegistry.addRecipe(new ItemStack(PurpleClayBrickStair, 4), "  s", " ss", "sss", 's', PurpleClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlueClayBrickStair, 4), "  s", " ss", "sss", 's', BlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(BrownClayBrickStair, 4), "  s", " ss", "sss", 's', BrownClayBrick);
        GameRegistry.addRecipe(new ItemStack(GreenClayBrickStair, 4), "  s", " ss", "sss", 's', GreenClayBrick);
        GameRegistry.addRecipe(new ItemStack(RedClayBrickStair, 4), "  s", " ss", "sss", 's', RedClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlackClayBrickStair, 4), "  s", " ss", "sss", 's', BlackClayBrick);
        
    	// Clay Brick Walls
        GameRegistry.addRecipe(new ItemStack(WhiteClayBrickWall, 4), "sss", "sss", 's', WhiteClayBrick);
        GameRegistry.addRecipe(new ItemStack(OrangeClayBrickWall, 4), "sss", "sss", 's', OrangeClayBrick);
        GameRegistry.addRecipe(new ItemStack(MagentaClayBrickWall, 4), "sss", "sss", 's', MagentaClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightBlueClayBrickWall, 4), "sss", "sss", 's', LightBlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(YellowClayBrickWall, 4), "sss", "sss", 's', YellowClayBrick);
        GameRegistry.addRecipe(new ItemStack(LimeClayBrickWall, 4), "sss", "sss", 's', LimeClayBrick);
        GameRegistry.addRecipe(new ItemStack(PinkClayBrickWall, 4), "sss", "sss", 's', PinkClayBrick);
        GameRegistry.addRecipe(new ItemStack(GrayClayBrickWall, 4), "sss", "sss", 's', GrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(LightGrayClayBrickWall, 4), "sss", "sss", 's', LightGrayClayBrick);
        GameRegistry.addRecipe(new ItemStack(CyanClayBrickWall, 4), "sss", "sss", 's', CyanClayBrick);
        GameRegistry.addRecipe(new ItemStack(PurpleClayBrickWall, 4), "sss", "sss", 's', PurpleClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlueClayBrickWall, 4), "sss", "sss", 's', BlueClayBrick);
        GameRegistry.addRecipe(new ItemStack(BrownClayBrickWall, 4), "sss", "sss", 's', BrownClayBrick);
        GameRegistry.addRecipe(new ItemStack(GreenClayBrickWall, 4), "sss", "sss", 's', GreenClayBrick);
        GameRegistry.addRecipe(new ItemStack(RedClayBrickWall, 4), "sss", "sss", 's', RedClayBrick);
        GameRegistry.addRecipe(new ItemStack(BlackClayBrickWall, 6), "sss", "sss", 's', BlackClayBrick);
        
        // Emerald Blocks
        GameRegistry.addSmelting(Item.emerald.itemID, new ItemStack(EmeraldStone, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldStone.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldBrick.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldCarved.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldSmooth.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addRecipe(new ItemStack(EmeraldStone, 4), "ee", "ee", 'e', ItemStacks.emeraldsmooth);
        GameRegistry.addRecipe(new ItemStack(EmeraldBrick, 4), "ee", "ee", 'e', ItemStacks.emeraldstone);
        GameRegistry.addRecipe(new ItemStack(EmeraldCarved, 4), "ee", "ee", 'e', ItemStacks.emeraldbrick);
        GameRegistry.addRecipe(new ItemStack(EmeraldSmooth, 4), "ee", "ee", 'e', ItemStacks.emeraldcarved);

        // Non-Standard Emerald Blocks
        GameRegistry.addSmelting(EmeraldBrickStair.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldBrickWall.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldStair.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addSmelting(EmeraldWall.blockID, new ItemStack(Item.emerald, 1, 0), .0F);
        GameRegistry.addRecipe(new ItemStack(EmeraldBrickStair, 4), "  e", " ee", "eee", 'e', ItemStacks.emeraldbrick);
        GameRegistry.addRecipe(new ItemStack(EmeraldBrickStair, 4), "e  ", "ee ", "eee", 'e', ItemStacks.emeraldbrick);
        GameRegistry.addRecipe(new ItemStack(EmeraldBrickWall, 6), "eee", "eee", 'e', ItemStacks.emeraldbrick);
        GameRegistry.addRecipe(new ItemStack(EmeraldStair, 4), "  e", " ee", "eee", 'e', ItemStacks.emeraldstone);
        GameRegistry.addRecipe(new ItemStack(EmeraldStair, 4), "e  ", "ee ", "eee", 'e', ItemStacks.emeraldstone);
        GameRegistry.addRecipe(new ItemStack(EmeraldWall, 6), "eee", "eee", 'e', ItemStacks.emeraldstone);
        GameRegistry.addRecipe(new ItemStack(EmeraldGlass, 8), "ggg", "geg", "ggg", 'e', ItemStacks.emerald, 'g', ItemStacks.glass);
        GameRegistry.addRecipe(new ItemStack(EmeraldGlassPane, 16), "eee", "eee", 'e', ItemStacks.emeraldglass);
    }

    public static void initLanguageRegistry() {
    	//Clay Brick
    	LanguageRegistry.addName(BlackClayBrick, "Black Clay Brick");
        LanguageRegistry.addName(BlueClayBrick, "Blue Clay Brick");
        LanguageRegistry.addName(BrownClayBrick, "Brown Clay Brick");
        LanguageRegistry.addName(CyanClayBrick, "Cyan Clay Brick");
        LanguageRegistry.addName(GrayClayBrick, "Gray Clay Brick");
        LanguageRegistry.addName(GreenClayBrick, "Green Clay Brick");
        LanguageRegistry.addName(LightBlueClayBrick, "Light Blue Clay Brick");
        LanguageRegistry.addName(LightGrayClayBrick, "Light Gray Clay Brick");
        LanguageRegistry.addName(LimeClayBrick, "Lime Clay Brick");
        LanguageRegistry.addName(MagentaClayBrick, "Magenta Clay Brick");
        LanguageRegistry.addName(OrangeClayBrick, "Orange Clay Brick");
        LanguageRegistry.addName(PinkClayBrick, "Pink Clay Brick");
        LanguageRegistry.addName(PurpleClayBrick, "Purple Clay Brick");
        LanguageRegistry.addName(RedClayBrick, "Red Clay Brick");
        LanguageRegistry.addName(WhiteClayBrick, "White Clay Brick");
        LanguageRegistry.addName(YellowClayBrick, "Yellow Clay Brick");
        
    	//Clay Brick Stairs
    	LanguageRegistry.addName(BlackClayBrickStair, "Black Clay Brick Stairs");
        LanguageRegistry.addName(BlueClayBrickStair, "Blue Clay Brick Stairs");
        LanguageRegistry.addName(BrownClayBrickStair, "Brown Clay Brick Stairs");
        LanguageRegistry.addName(CyanClayBrickStair, "Cyan Clay Brick Stairs");
        LanguageRegistry.addName(GrayClayBrickStair, "Gray Clay Brick Stairs");
        LanguageRegistry.addName(GreenClayBrickStair, "Green Clay Brick Stairs");
        LanguageRegistry.addName(LightBlueClayBrickStair, "Light Blue Clay Brick Stairs");
        LanguageRegistry.addName(LightGrayClayBrickStair, "Light Gray Clay Brick Stairs");
        LanguageRegistry.addName(LimeClayBrickStair, "Lime Clay Brick Stairs");
        LanguageRegistry.addName(MagentaClayBrickStair, "Magenta Clay Brick Stairs");
        LanguageRegistry.addName(OrangeClayBrickStair, "Orange Clay Brick Stairs");
        LanguageRegistry.addName(PinkClayBrickStair, "Pink Clay Brick Stairs");
        LanguageRegistry.addName(PurpleClayBrickStair, "Purple Clay Brick Stairs");
        LanguageRegistry.addName(RedClayBrickStair, "Red Clay Brick Stairs");
        LanguageRegistry.addName(WhiteClayBrickStair, "White Clay Brick Stairs");
        LanguageRegistry.addName(YellowClayBrickStair, "Yellow Clay Brick Stairs");
        
    	//Clay Brick Walls
    	LanguageRegistry.addName(BlackClayBrickWall, "Black Clay Brick Wall");
        LanguageRegistry.addName(BlueClayBrickWall, "Blue Clay Brick Wall");
        LanguageRegistry.addName(BrownClayBrickWall, "Brown Clay Brick Wall");
        LanguageRegistry.addName(CyanClayBrickWall, "Cyan Clay Brick Wall");
        LanguageRegistry.addName(GrayClayBrickWall, "Gray Clay Brick Wall");
        LanguageRegistry.addName(GreenClayBrickWall, "Green Clay Brick Wall");
        LanguageRegistry.addName(LightBlueClayBrickWall, "Light Blue Clay Brick Wall");
        LanguageRegistry.addName(LightGrayClayBrickWall, "Light Gray Clay Brick Wall");
        LanguageRegistry.addName(LimeClayBrickWall, "Lime Clay Brick Wall");
        LanguageRegistry.addName(MagentaClayBrickWall, "Magenta Clay Brick Wall");
        LanguageRegistry.addName(OrangeClayBrickWall, "Orange Clay Brick Wall");
        LanguageRegistry.addName(PinkClayBrickWall, "Pink Clay Brick Wall");
        LanguageRegistry.addName(PurpleClayBrickWall, "Purple Clay Brick Wall");
        LanguageRegistry.addName(RedClayBrickWall, "Red Clay Brick Wall");
        LanguageRegistry.addName(WhiteClayBrickWall, "White Clay Brick Wall");
        LanguageRegistry.addName(YellowClayBrickWall, "Yellow Clay Brick Wall");
        
        //Emerald Stone
        LanguageRegistry.addName(EmeraldBrick, "Emerald Brick");
        LanguageRegistry.addName(EmeraldStone, "Emerald Stone");
        LanguageRegistry.addName(EmeraldCarved, "Carved Emerald");
        LanguageRegistry.addName(EmeraldSmooth, "Smooth Emerald");

        // Non-Standard Emerald Blocks
        LanguageRegistry.addName(EmeraldBrickStair, "Emerald Brick Stairs");
        LanguageRegistry.addName(EmeraldBrickWall, "Emerald Wall");
        LanguageRegistry.addName(EmeraldStair, "Emerald Stairs");
        LanguageRegistry.addName(EmeraldWall, "Emerald Wall");
        LanguageRegistry.addName(EmeraldGlass, "Emerald Glass");
        LanguageRegistry.addName(EmeraldGlassPane, "Emerald Glass Pane");
    }
}
