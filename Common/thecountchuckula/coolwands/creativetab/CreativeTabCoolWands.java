package com.thecountchuckula.coolwands.creativetab;

import com.thecountchuckula.coolwands.reference.Reference;
import com.thecountchuckula.coolwands.item.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

/**
 * Created by deofavente on 7/14/2014.
 */
public class CreativeTabCoolWands
{
    public static final CreativeTabs tabcoolwands = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.wandlighting;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return StatCollector.translateToLocal("key.categories.coolwands");
        }
    };
}
