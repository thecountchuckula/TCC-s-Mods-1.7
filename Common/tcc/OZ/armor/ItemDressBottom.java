package tcc.OZ.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import tcc.OZ.OZ;
import tcc.OZ.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDressBottom extends ItemArmor {

    public ItemDressBottom(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(1);
        this.setCreativeTab(OZ.tabOZ);
        this.setUnlocalizedName("dressBottom");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        return Reference.MOD_ID.toLowerCase() + ":" + "Dorothy_2.png";
    }
}