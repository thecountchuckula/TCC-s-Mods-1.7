package com.thecountchuckula.coolwands.item;

import com.thecountchuckula.coolwands.creativetab.CreativeTabCoolWands;
import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by deofavente on 7/14/2014.
 */
public class WandBedrockWall extends ItemCoolWands {
    public WandBedrockWall() {
        super();
        this.maxStackSize = 1;
        this.setMaxDamage(1);
        this.setUnlocalizedName("bedrockWallPlacer");
        this.setCreativeTab(CreativeTabCoolWands.tabcoolwands);
    }

    /**
     * This item generates a bedrock wall around an area defined when you use the item the block used, defined in the config.
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {

        if (par7 == 0) {
            --par5;
        }

        if (par7 == 1) {
            ++par5;
        }

        if (par7 == 2) {
            --par6;
        }

        if (par7 == 3) {
            ++par6;
        }

        if (par7 == 4) {
            --par4;
        }

        if (par7 == 5) {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
            return false;
        } else {
            if (par3World.isAirBlock(par4, par5, par6)) {
                for (int wall = -ConfigurationHandler.bedrockhalf; wall < ConfigurationHandler.bedrockhalf; wall = wall + 1) {
                    for (par5 = 0; par5 < 256; par5 = par5 + 1) {
                        par3World.setBlock(par4 + wall, par5, par6 - ConfigurationHandler.bedrockhalf, Blocks.bedrock);

                    }
                    for (par5 = 0; par5 < 256; par5 = par5 + 1) {
                        par3World.setBlock(par4 + wall, par5, par6 + ConfigurationHandler.bedrockhalf, Blocks.bedrock);

                    }
                    for (par5 = 0; par5 < 256; par5 = par5 + 1) {
                        par3World.setBlock(par4 - ConfigurationHandler.bedrockhalf, par5, par6 + wall, Blocks.bedrock);

                    }
                    for (par5 = 0; par5 < 256; par5 = par5 + 1) {
                        par3World.setBlock(par4 + ConfigurationHandler.bedrockhalf, par5, par6 + wall, Blocks.bedrock);

                    }

                }
                //par2EntityPlayer.addChatMessage("A bedrock wall now surrounds the area...");
                par1ItemStack.damageItem(1, par2EntityPlayer);
            }

            par1ItemStack.damageItem(getMaxDamage(), par2EntityPlayer);
            return true;
        }
    }
}