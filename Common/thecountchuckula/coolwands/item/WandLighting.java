package com.thecountchuckula.coolwands.item;

import com.thecountchuckula.coolwands.CoolWands;
import com.thecountchuckula.coolwands.block.ModBlocks;
import com.thecountchuckula.coolwands.creativetab.CreativeTabCoolWands;
import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import com.thecountchuckula.coolwands.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Calendar;


public class WandLighting extends ItemCoolWands {
	public static String sound;

	public WandLighting() {
		super();
		if(ConfigurationHandler.lastsLonger == false)
        {
            this.setMaxDamage(64);
        }
		else
        {
            this.setMaxDamage(256);
        }
        this.setUnlocalizedName("wandlighting");
        this.setCreativeTab(CreativeTabCoolWands.tabcoolwands);
        this.setMaxStackSize(1);
        if(Calendar.MONTH == Calendar.APRIL && Calendar.DAY_OF_MONTH == 01)
        {
            sound = "mob.skeleton.say";
        }
        else
        {
            sound = "random.orb";
        }
	}
	
	

	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            if (par3World.isAirBlock(par4, par5, par6))
            {
                LogHelper.info("Date = " + Calendar.MONTH + "/" + Calendar.DAY_OF_MONTH);
                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, sound, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                par3World.setBlock(par4, par5, par6, ModBlocks.glowAir);
            }

            par1ItemStack.damageItem(1, par2EntityPlayer);
            return true;
        }		
        
	}

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
}
	






