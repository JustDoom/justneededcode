package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class GhastShotByPiglin {

    @SubscribeEvent
    public static void paperBurn(LivingDeathEvent event){
        Entity entity = event.getEntity();
        System.out.println(entity.getName());
        if(entity instanceof GhastEntity){
            if(event.getSource().getTrueSource() instanceof PiglinEntity && event.getSource().getImmediateSource() instanceof ArrowEntity){
                World world = event.getEntity().getEntityWorld();
                ItemEntity item = new ItemEntity(world, event.getEntity().getPosX(), event.getEntity().getPosY(), event.getEntity().getPosZ(), new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1));
                world.addEntity(item);
            }
        }
    }
}