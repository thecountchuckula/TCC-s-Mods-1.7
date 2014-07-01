package tcc.OZ.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import tcc.OZ.OZ;
import tcc.OZ.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MultiSidedBlock extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon iconBlockTop;
    @SideOnly(Side.CLIENT)
    private Icon iconBlockBottom;
    @SideOnly(Side.CLIENT)
    private Icon iconBlockSide;

    protected MultiSidedBlock(int par1, Material par2Material)
    {
        super(par1, par2Material);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(OZ.tabOZ);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconBlockTop : (par1 == 0 ? this.iconBlockBottom : this.iconBlockSide);
    }

    
    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 1)
        {
            return this.iconBlockTop;
        }
        else if (par5 == 0)
        {
            return this.iconBlockBottom;
        }
        else
        {
        	return this.iconBlockSide;
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister reg) {
        this.iconBlockSide = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.iconBlockTop = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_top");
        this.iconBlockBottom = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_bottom");
    }
}
