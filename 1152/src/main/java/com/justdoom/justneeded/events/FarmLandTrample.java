package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class FarmLandTrample {

    @SubscribeEvent
    public static void paperBurn(BlockEvent.FarmlandTrampleEvent event){
        Entity entity = event.getEntity();
        if (entity instanceof LivingEntity) {
            final ItemStack boot = ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET);

            if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FEATHER_FALLING, boot) > 0) {

                event.setCanceled(true);
            }

            if (entity instanceof PlayerEntity && ((PlayerEntity) entity).isCreative()) {

                event.setCanceled(true);
            }
        }
    }
}
