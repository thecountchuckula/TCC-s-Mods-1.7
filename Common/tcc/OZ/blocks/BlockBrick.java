package tcc.OZ.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tcc.OZ.OZ;
import tcc.OZ.lib.Reference;

public class BlockBrick extends Block
{  
    
    public BlockBrick(int par1, Material par2Material)
    {
        super(par1, par2Material);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(OZ.tabOZ);
    }
    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }
}