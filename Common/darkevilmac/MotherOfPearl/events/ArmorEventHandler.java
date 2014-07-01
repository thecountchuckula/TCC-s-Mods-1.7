//Thank you to MrArcane111 for having an Enchantments Mod on GitHub that I could Copy/Paste from.

package darkevilmac.MotherOfPearl.events;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import tcc.MotherOfPearl.enchantment.ModEnchantments;

public class ArmorEventHandler {
	// Booleans, my boys
	boolean isJumping = false;
	boolean isSwiftness = false;
	// boolean isAngelwings = false;
	boolean isNightvision = false;
	boolean flying = false;

	// Inegers, ya idiots
	int jumpingAmount;
	int swiftnessAmount;
	int angelwingsAmount;
	int nightvisionAmount;

	// Misc.
	boolean respawned;
	ItemStack inventory[];

	@ForgeSubscribe
	public void livingUpdateEvent(LivingEvent.LivingUpdateEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			ItemStack stack_feet = player.inventory.armorItemInSlot(0);
			ItemStack stack_legs = player.inventory.armorItemInSlot(1);
			// ItemStack stack_torso = player.inventory.armorItemInSlot(2);
			ItemStack stack_head = player.inventory.armorItemInSlot(3);

			jumpingAmount = EnchantmentHelper.getEnchantmentLevel(
					ModEnchantments.jumping.effectId, stack_legs);

			if (jumpingAmount > 0) {
				isJumping = true;
			}
			if (jumpingAmount == 0) {
				isJumping = false;
			}

			swiftnessAmount = EnchantmentHelper.getEnchantmentLevel(
					ModEnchantments.swiftness.effectId, stack_feet);

			if (swiftnessAmount > 0) {
				isSwiftness = true;
			}
			if (swiftnessAmount == 0) {
				isSwiftness = false;
			}

			// angelwingsAmount =
			// EnchantmentHelper.getEnchantmentLevel(ModEnchantments.angelwings.effectId,
			// stack_torso);

			// if(angelwingsAmount > 0)
			// {
			// isAngelwings = true;
			// }
			// if(angelwingsAmount == 0)
			// {
			// isAngelwings = false;
			// }

			nightvisionAmount = EnchantmentHelper.getEnchantmentLevel(
					ModEnchantments.nightvision.effectId, stack_head);

			if (nightvisionAmount > 0) {
				isNightvision = true;
			}
			if (nightvisionAmount == 0) {
				isNightvision = false;
			}
		}
	}

	@ForgeSubscribe
	public void applyEffects(LivingEvent.LivingUpdateEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			if (isNightvision = true && nightvisionAmount != 0) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id,
						75, 10));
			}
			if (isSwiftness = true && swiftnessAmount != 0) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,
						75, 10));
			}

			inventory = new ItemStack[player.inventory.getSizeInventory()];
		}
	}

	@ForgeSubscribe
	public void playerJumping(LivingJumpEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entityLiving;

			if (isJumping = true && jumpingAmount != 0) {
				if (jumpingAmount == 1) {
					player.motionY = 0.4655786;
				} else if (jumpingAmount == 2) {
					player.motionY = 0.5725786;
				} else if (jumpingAmount == 3) {
					player.motionY = 0.6795786;
				} else if (jumpingAmount == 4) {
					player.motionY = 0.7865786;
				} else {
					return;
				}
			} else {
				return;
			}

			inventory = new ItemStack[player.inventory.getSizeInventory()];

			if (respawned && inventory != null && player.getHealth() > 0) {
				respawned = false;

				for (int k = 0; k < inventory.length; k++) {
					if (inventory[k] != null) {
						player.inventory.setInventorySlotContents(k,
								inventory[k]);
					}
				}
			}
		}
	}

	@ForgeSubscribe
	public void afterDeathUpdate(LivingSpawnEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			inventory = new ItemStack[player.inventory.getSizeInventory()];

			respawned = true;

			if (inventory != null) {
				for (int i = 0; i < inventory.length; i++) {
					player.inventory.setInventorySlotContents(i, inventory[i]);
				}
			}
		}
	}

	// @SideOnly(Side.CLIENT)
	// @ForgeSubscribe
	// public void flight(LivingEvent.LivingUpdateEvent event)
	// {
	// if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
	// flying = true;
	// }
	// if(!Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
	// flying = false;
	// }
	// }

	// @ForgeSubscribe
	// public void playerFlying(LivingEvent.LivingUpdateEvent event)
	// {
	// if(event.entityLiving instanceof EntityPlayer)
	// {
	// EntityPlayer player = (EntityPlayer) event.entityLiving;
	//
	// if(isAngelwings = true && player.lastTickPosY <= 256 && flying == true &&
	// !player.onGround && angelwingsAmount != 0)
	// {
	// player.motionY = .5;
	// event.entityLiving.fallDistance = 0F;
	// }
	// else
	// {
	// return;
	// }
	//
	// inventory = new ItemStack[player.inventory.getSizeInventory()];
	//
	// if(respawned && inventory != null && player.getHealth() > 0)
	// {
	// respawned = false;
	//
	// for(int k = 0; k < inventory.length; k++)
	// {
	// if(inventory[k] != null)
	// {
	// player.inventory.setInventorySlotContents(k, inventory[k]);
	// }
	// }
	// }
	// }
	// }

}