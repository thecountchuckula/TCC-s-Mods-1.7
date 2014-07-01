package tcc.HidingtheLight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class WandLighting extends Item {
	public static String sound;

	public WandLighting(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setMaxStackSize(1);
		if(ModMain.lastsLonger == false) {
			this.setMaxDamage(64);
		}
		if(ModMain.lastsLonger == true) {
			this.setMaxDamage(256);
		}
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("wandLighting");
		//TODO: add function for if 04/01/xxxx then change sound to farts.
		this.sound = "random.orb";
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister par1IconRegister) {
		if(ModMain.newIcon == false) {
			itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
		}
		if(ModMain.newIcon == true) {
			itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5) + "_hard");
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
                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, sound, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                par3World.setBlock(par4, par5, par6, ModInfo.glowair.blockID);
            }

            par1ItemStack.damageItem(1, par2EntityPlayer);
            return true;
        }		
        
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
		if(ModMain.enableHardcore == false) {
			return Item.glowstone.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
		}
		else {
	        return Block.glowStone.blockID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	    }
	}
}
	






