package com.thecountchuckula.coolwands.vanilla;

import com.thecountchuckula.coolwands.handler.ConfigurationHandler;
import com.thecountchuckula.coolwands.item.ModItems;
import com.thecountchuckula.coolwands.utility.ItemStacks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;

public class VanillaModifiers
{
    public static void preinit()
    {
        if (ConfigurationHandler.hardground == true)
        {
            Blocks.dirt.setHardness(8F);
            Blocks.dirt.setHardness(8F);
            Blocks.grass.setHardness(8F);
            Blocks.farmland.setHardness(8F);
            Blocks.sand.setHardness(8F);
            Blocks.sandstone.setHardness(10F);
            Blocks.stone.setHardness(10F);
            Blocks.cobblestone.setHardness(10F);
            Blocks.mossy_cobblestone.setHardness(10F);
            Blocks.mob_spawner.setHardness(10F);
            Blocks.fence.setHardness(10F);
            Blocks.planks.setHardness(10F);
            Blocks.log.setHardness(10F);
            Blocks.chest.setHardness(10F);
            Blocks.trapped_chest.setHardness(10F);
            Blocks.wool.setHardness(10F);
            Blocks.netherrack.setHardness(10F);
            Blocks.nether_brick.setHardness(10F);
            Blocks.nether_brick_fence.setHardness(10F);
            Blocks.soul_sand.setHardness(10F);
        }
        // Torch light modifier, Harder to Break.
        Blocks.torch.setLightLevel(ConfigurationHandler.torchlight)
                .setHardness(.5F);

    }
    public static void init()
    {
        if (ConfigurationHandler.hardarmor == true)
        {
            RemoveRecipe(new ItemStack(Items.leather_helmet));
            RemoveRecipe(new ItemStack(Items.leather_chestplate));
            RemoveRecipe(new ItemStack(Items.leather_leggings));
            RemoveRecipe(new ItemStack(Items.leather_boots));
            RemoveRecipe(new ItemStack(Items.iron_helmet));
            RemoveRecipe(new ItemStack(Items.iron_chestplate));
            RemoveRecipe(new ItemStack(Items.iron_leggings));
            RemoveRecipe(new ItemStack(Items.iron_boots));
            RemoveRecipe(new ItemStack(Items.diamond_helmet));
            RemoveRecipe(new ItemStack(Items.diamond_chestplate));
            RemoveRecipe(new ItemStack(Items.diamond_leggings));
            RemoveRecipe(new ItemStack(Items.diamond_boots));
        }
    }
    public static void postinit()
    {
        if (ConfigurationHandler.mowlawn == true)
        {
            MinecraftForge.addGrassSeed(ItemStacks.stick, 20);
            MinecraftForge.addGrassSeed(new ItemStack(ModItems.rock, 1, 0), 25);
            MinecraftForge.addGrassSeed(new ItemStack(Items.potato), 5);
            MinecraftForge.addGrassSeed(new ItemStack(Items.rotten_flesh), 5);
            MinecraftForge.addGrassSeed(new ItemStack(Items.carrot), 5);
            MinecraftForge.addGrassSeed(new ItemStack(Items.apple), 2);
            MinecraftForge.addGrassSeed(new ItemStack(Items.dye, 1, 15), 1);
        }
        if (ConfigurationHandler.hardarmor == true)
        {
            // Hard Armor Recipes
            // Leather
            GameRegistry.addRecipe(new ItemStack(Items.leather_helmet, 1, 0),
                    "lll",
                    "l l", 'l', ItemStacks.leatherBlock);
            GameRegistry.addRecipe(new ItemStack(Items.leather_chestplate, 1, 0),
                    "l l", "lll", "lll", 'l', ItemStacks.leatherBlock);
            GameRegistry.addRecipe(new ItemStack(Items.leather_leggings, 1, 0),
                    "lll", "l l", "l l", 'l', ItemStacks.leatherBlock);
            GameRegistry.addRecipe(new ItemStack(Items.leather_boots, 1, 0),
                    "l l", "l l", 'l', ItemStacks.leatherBlock);
            // Iron
            GameRegistry.addRecipe(new ItemStack(Items.iron_helmet, 1, 0), "lll",
                    "l l", 'l', ItemStacks.denseIronIngot);
            GameRegistry.addRecipe(new ItemStack(Items.iron_chestplate, 1, 0), "i i",
                    "iii", "iii", 'i', ItemStacks.denseIronIngot);
            GameRegistry.addRecipe(new ItemStack(Items.iron_leggings, 1, 0), "iii",
                    "i i", "i i", 'i', ItemStacks.denseIronIngot);
            GameRegistry.addRecipe(new ItemStack(Items.iron_boots, 1, 0), "i i",
                    "i i", 'i', ItemStacks.denseIronIngot);
            // Diamond
            GameRegistry.addRecipe(new ItemStack(Items.diamond_helmet, 1, 0),
                    "ddd", "d d", 'd', ItemStacks.diamondIngot);
            GameRegistry.addRecipe(new ItemStack(Items.diamond_chestplate, 1, 0),
                    "d d", "ddd", "ddd", 'd', ItemStacks.diamondIngot);
            GameRegistry.addRecipe(new ItemStack(Items.diamond_leggings, 1, 0),
                    "ddd", "d d", "d d", 'd', ItemStacks.diamondIngot);
            GameRegistry.addRecipe(new ItemStack(Items.diamond_boots, 1, 0),
                    "d d", "d d", 'd', ItemStacks.diamondIngot);
        }
        GameRegistry.addRecipe(ItemStacks.torches, "c", "p", 'c', ItemStacks.coal, 'p', Blocks.planks);
    }
    protected static void RemoveRecipe(ItemStack resultItem) {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance()
                .getRecipeList();
        for (int scan = 0; scan < recipes.size(); scan++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            if (tmpRecipe instanceof ShapedRecipes) {
                ShapedRecipes recipe = (ShapedRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (tmpRecipe instanceof ShapelessRecipes) {
                ShapelessRecipes recipe = (ShapelessRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
                System.out.println("[Cool Wands Removed Recipe: "
                        + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
    }
}
