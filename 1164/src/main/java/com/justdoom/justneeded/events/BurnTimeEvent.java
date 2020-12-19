package com.justdoom.justneeded.events;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustNeeded.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class BurnTimeEvent {

    @SubscribeEvent
    public static void paperBurn(FurnaceFuelBurnTimeEvent event){
        if(event.getItemStack().isItemEqual(new ItemStack(Items.PAPER))){
            event.setBurnTime(80);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.BOOK))){
            event.setBurnTime(255);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.WRITTEN_BOOK))){
            event.setBurnTime(255);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.WRITABLE_BOOK))){
            event.setBurnTime(255);
        }  else if (event.getItemStack().isItemEqual(new ItemStack(Items.MAP))){
            event.setBurnTime(80);
        }  else if (event.getItemStack().isItemEqual(new ItemStack(Items.FILLED_MAP))){
            event.setBurnTime(80);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.HAY_BLOCK))){
            event.setBurnTime(3745);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.ACACIA_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.BIRCH_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.DARK_OAK_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.JUNGLE_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.OAK_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.SPRUCE_LEAVES))){
            event.setBurnTime(85);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.GRASS))){
            event.setBurnTime(90);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.FERN))){
            event.setBurnTime(90);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.LARGE_FERN))){
            event.setBurnTime(90);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.TALL_GRASS))){
            event.setBurnTime(90);
        } else if (event.getItemStack().isItemEqual(new ItemStack(Items.VINE))){
            event.setBurnTime(90);
        }
    }
}