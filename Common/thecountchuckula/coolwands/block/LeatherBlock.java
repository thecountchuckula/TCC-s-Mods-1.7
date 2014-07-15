package com.thecountchuckula.coolwands.block;

import java.util.Random;

import com.thecountchuckula.coolwands.creativetab.CreativeTabCoolWands;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class LeatherBlock extends BlockCoolWands {

	public LeatherBlock(Material par2Material) {
		super(par2Material);
        this.setCreativeTab(CreativeTabCoolWands.tabcoolwands);
		this.setHardness(0.4F);
		this.setBlockName("leatherBlock");
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
    @Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return Items.leather;
	}


	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

}
