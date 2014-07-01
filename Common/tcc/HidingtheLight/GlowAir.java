package tcc.HidingtheLight;

import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

// Thank you to Darkevilmac for getting me on the right track in getting my block transparent AND intangible.

public class GlowAir extends Block
{
	public float light = ModMain.lightlevel/10F;
    public GlowAir(int par1)
    {
        super(par1, Material.air);
        this.setLightOpacity(-2);
        this.setLightValue(light);
        this.setUnlocalizedName("glowAir");
        if(ModMain.enableCreativeAir == true) {
        	this.setCreativeTab(CreativeTabs.tabBlock);
        }
    }
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}

    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3)
    {
    	this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    
        return super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
    }
    public int getRenderBlockPass()
    {
        return 4;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    protected boolean canSilkHarvest()
    {
        return false;
    }
}