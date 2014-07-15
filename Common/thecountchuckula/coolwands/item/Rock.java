package com.thecountchuckula.coolwands.item;

import com.thecountchuckula.coolwands.creativetab.CreativeTabCoolWands;
import com.thecountchuckula.coolwands.entity.EntityRock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Rock extends ItemCoolWands {

    public Rock() {
        super();
        this.maxStackSize = 32;
        this.setCreativeTab(CreativeTabCoolWands.tabcoolwands);
        this.setUnlocalizedName("rock");
    }
    /*public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityRock(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }*/
}
