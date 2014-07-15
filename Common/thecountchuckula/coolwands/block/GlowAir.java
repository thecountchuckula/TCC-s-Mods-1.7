package com.thecountchuckula.coolwands.block;

import java.util.Random;

import com.thecountchuckula.coolwands.CoolWands;
import com.thecountchuckula.coolwands.creativetab.CreativeTabCoolWands;
import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

// Thank you to Darkevilmac for getting me on the right track in getting my block transparent AND intangible.

public class GlowAir extends BlockCoolWands
{
	public float light = ConfigurationHandler.lightlevel/10F;
    public GlowAir(Material par1Material)
    {
        super(par1Material);
        this.setLightOpacity(-2);
        this.setLightLevel(light);
        this.setBlockName("glowAir");
        this.setHardness(0.0F);
        if(ConfigurationHandler.enableCreativeAir == true) {
            this.setCreativeTab(CreativeTabCoolWands.tabcoolwands);
        }
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