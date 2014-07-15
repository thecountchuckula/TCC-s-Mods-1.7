package com.thecountchuckula.coolwands.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class BatKillHandler {
	@SubscribeEvent
	public void onBatKill(LivingDropsEvent event) {
		// algorithm by Pahimar
		event.drops.clear();
		if (event.source.getDamageType().equals("player")) {
			EntityPlayer p = (EntityPlayer) event.source.getEntity();

			if (event.entityLiving instanceof EntityBat) {
				if (event.lootingLevel == 0) {
					int gold = event.entityLiving.worldObj.rand.nextInt(6);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel == 1) {
					int gold = event.entityLiving.worldObj.rand.nextInt(5);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel == 2) {
					int gold = event.entityLiving.worldObj.rand.nextInt(4);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
				if (event.lootingLevel >= 3) {
					int gold = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold < 1) {
						event.entityLiving.dropItem(Items.gold_nugget, 1);
					}
				}
			}
		}

		if (event.source.getSourceOfDamage() instanceof EntityArrow) {
			if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
				if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) {

					EntityPlayer p = (EntityPlayer) event.source.getEntity();
					if (event.entityLiving instanceof EntityBat) {
						if (event.lootingLevel == 0) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(6);

							if (gold < 1) {
								event.entityLiving.dropItem(
										Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel == 1) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(5);

							if (gold < 1) {
								event.entityLiving.dropItem(
										Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel == 2) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(4);

							if (gold < 1) {
								event.entityLiving.dropItem(
										Items.gold_nugget, 1);
							}
						}
						if (event.lootingLevel >= 3) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold < 1) {
								event.entityLiving.dropItem(
										Items.gold_nugget, 1);
							}
						}
					}
				}
			}
		}
	}
}