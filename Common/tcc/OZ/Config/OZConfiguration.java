package tcc.OZ.Config;

import net.minecraftforge.common.Configuration;
import tcc.OZ.OZ;
import tcc.OZ.blocks.BlockCustomStairs;

public class OZConfiguration {

//New Meta-Block IDs
    // Clay Brick
    public static int BlackClayBrickID;
    public static int BlueClayBrickID;
    public static int BrownClayBrickID;
    public static int CyanClayBrickID;
    public static int GrayClayBrickID;
    public static int GreenClayBrickID;
    public static int LightBlueClayBrickID;
    public static int LightGrayClayBrickID;
    public static int LimeClayBrickID;
    public static int MagentaClayBrickID;
    public static int OrangeClayBrickID;
    public static int PinkClayBrickID;
    public static int PurpleClayBrickID;
    public static int RedClayBrickID;
    public static int WhiteClayBrickID;
    public static int YellowClayBrickID;
    // Clay Brick Stairs
    public static int BlackClayBrickStairID;
    public static int BlueClayBrickStairID;
    public static int BrownClayBrickStairID;
    public static int CyanClayBrickStairID;
    public static int GrayClayBrickStairID;
    public static int GreenClayBrickStairID;
    public static int LightBlueClayBrickStairID;
    public static int LightGrayClayBrickStairID;
    public static int LimeClayBrickStairID;
    public static int MagentaClayBrickStairID;
    public static int OrangeClayBrickStairID;
    public static int PinkClayBrickStairID;
    public static int PurpleClayBrickStairID;
    public static int RedClayBrickStairID;
    public static int WhiteClayBrickStairID;
    public static int YellowClayBrickStairID;
    // Clay Brick Stairs
    public static int BlackClayBrickWallID;
    public static int BlueClayBrickWallID;
    public static int BrownClayBrickWallID;
    public static int CyanClayBrickWallID;
    public static int GrayClayBrickWallID;
    public static int GreenClayBrickWallID;
    public static int LightBlueClayBrickWallID;
    public static int LightGrayClayBrickWallID;
    public static int LimeClayBrickWallID;
    public static int MagentaClayBrickWallID;
    public static int OrangeClayBrickWallID;
    public static int PinkClayBrickWallID;
    public static int PurpleClayBrickWallID;
    public static int RedClayBrickWallID;
    public static int WhiteClayBrickWallID;
    public static int YellowClayBrickWallID;
    
	// Emerald Blocks
    public static int EmeraldStoneID;
    public static int EmeraldCarvedID;
    public static int EmeraldSmoothID;
    public static int EmeraldBrickID;

    // Non-Standard Emerald Blocks
    public static int EmeraldBrickStairID;
    public static int EmeraldBrickWallID;
    public static int EmeraldStairID;
    public static int EmeraldWallID;
    public static int EmeraldDoorBlockID;
    public static int EmeraldGlassID;
    public static int EmeraldGlassPaneID;

    // Items
    public static int EmeraldDoorItemID;
    
    // Armor
    public static int silverSlippersID;
    public static int dressTopID;
    public static int dressBottomID;


    public static Configuration cfg = OZ.cfg;

    public static void init() {
        cfg.load();

        // Items
        silverSlippersID = cfg.get(Configuration.CATEGORY_ITEM, "Dorothy's Silver Slippers", 5401).getInt();
        dressTopID = cfg.get(Configuration.CATEGORY_ITEM, "Dorothy's Dress (Top)", 5402).getInt();
        dressBottomID = cfg.get(Configuration.CATEGORY_ITEM, "Dorothy's Dress (Bottom)", 5403).getInt();
        EmeraldDoorItemID = cfg.get(Configuration.CATEGORY_ITEM, "Emerald Door Item", 5404).getInt();

        // Clay Bricks
        BlackClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Black Clay Brick", 1300).getInt();
        BlueClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Blue Clay Brick", 1301).getInt();
        BrownClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Brown Clay Brick", 1302).getInt();
        CyanClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Cyan Clay Brick", 1303).getInt();
        GrayClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Gray Clay Brick", 1304).getInt();
        GreenClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Green Clay Brick", 1305).getInt();
        LightBlueClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Blue Clay Brick", 1306).getInt();
        LightGrayClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Gray Clay Brick", 1307).getInt();
        LimeClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Lime Clay Brick", 1308).getInt();
        MagentaClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Magenta Clay Brick", 1309).getInt();
        OrangeClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Orange Clay Brick", 1310).getInt();
        PinkClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Pink Clay Brick", 1311).getInt();
        PurpleClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Purple Clay Brick", 1312).getInt();
        RedClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Red Clay Brick", 1313).getInt();
        WhiteClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "White Clay Brick", 1314).getInt();
        YellowClayBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Yellow Clay Brick", 1315).getInt();
        
        // Clay Bricks Stair
        BlackClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Black Clay Brick Stairs", 1316).getInt();
        BlueClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Blue Clay Brick Stairs", 1317).getInt();
        BrownClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Brown Clay Brick Stairs", 1318).getInt();
        CyanClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Cyan Clay Brick Stairs", 1319).getInt();
        GrayClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Gray Clay Brick Stairs", 1320).getInt();
        GreenClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Green Clay Brick Stairs", 1321).getInt();
        LightBlueClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Blue Clay Brick Stairs", 1322).getInt();
        LightGrayClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Gray Clay Brick Stairs", 1323).getInt();
        LimeClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Lime Clay Brick Stairs", 1324).getInt();
        MagentaClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Magenta Clay Brick Stairs", 1325).getInt();
        OrangeClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Orange Clay Brick Stairs", 1326).getInt();
        PinkClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Pink Clay Brick Stairs", 1327).getInt();
        PurpleClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Purple Clay Brick Stairs", 1328).getInt();
        RedClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Red Clay Brick Stairs", 1329).getInt();
        WhiteClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "White Clay Brick Stairs", 1330).getInt();
        YellowClayBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Yellow Clay Brick Stairs", 1331).getInt();
        
        // Clay Bricks Wall
        BlackClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Black Clay Brick Wall", 1332).getInt();
        BlueClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Blue Clay Brick Wall", 1333).getInt();
        BrownClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Brown Clay Brick Wall", 1334).getInt();
        CyanClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Cyan Clay Brick Wall", 1335).getInt();
        GrayClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Gray Clay Brick Wall", 1336).getInt();
        GreenClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Green Clay Brick Wall", 1337).getInt();
        LightBlueClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Blue Clay Brick Wall", 1338).getInt();
        LightGrayClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Light Gray Clay Brick Wall", 1339).getInt();
        LimeClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Lime Clay Brick Wall", 1340).getInt();
        MagentaClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Magenta Clay Brick Wall", 1341).getInt();
        OrangeClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Orange Clay Brick Wall", 1342).getInt();
        PinkClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Pink Clay Brick Wall", 1343).getInt();
        PurpleClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Purple Clay Brick Wall", 1344).getInt();
        RedClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Red Clay Brick Wall", 1345).getInt();
        WhiteClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "White Clay Brick Wall", 1346).getInt();
        YellowClayBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Yellow Clay Brick Wall", 1347).getInt();
        
        // Emerald Blocks
        EmeraldStoneID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Stone", 1401).getInt();
        EmeraldCarvedID = cfg.get(Configuration.CATEGORY_BLOCK, "Carved Emerald", 1402).getInt();
        EmeraldSmoothID = cfg.get(Configuration.CATEGORY_BLOCK, "Smooth Emerald", 1403).getInt();
        EmeraldBrickID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Brick", 1404).getInt();

        // Non-Standard Emerald Blocks
        EmeraldBrickStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Brick Stair", 1405).getInt();
        EmeraldBrickWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Brick Wall", 1406).getInt();
        EmeraldStairID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Stair", 1407).getInt();
        EmeraldWallID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Wall", 1408).getInt();
        EmeraldDoorBlockID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Door Block", 1409).getInt();
        EmeraldGlassID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Glass", 1410).getInt();
        EmeraldGlassPaneID = cfg.get(Configuration.CATEGORY_BLOCK, "Emerald Glass Pane", 1411).getInt();

        cfg.save();
    }
}
