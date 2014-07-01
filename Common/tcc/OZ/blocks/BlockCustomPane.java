package tcc.OZ.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import tcc.OZ.OZ;
import tcc.OZ.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomPane extends BlockPane
{
    /**
     * Holds the texture index of the side of the pane (the thin lateral side)
     */
    private final String sideTextureIndex;
    private final String field_94402_c;

    protected BlockCustomPane(int par1, String par2Str, String par3Str, Material par4Material, boolean par5)
    {
        super(par1, par2Str, par3Str, par4Material, par5);
        this.sideTextureIndex = par3Str;
        this.field_94402_c = par2Str;
        this.setCreativeTab(OZ.tabOZ);
    }
}
