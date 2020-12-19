package com.justdoom.justneeded.items.food;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class PumpkinSoup extends Item {

    public PumpkinSoup() {
        super(new Item.Properties()
                .group(JustNeeded.JustNeededTab)
                .containerItem(Items.BOWL)
                .maxStackSize(1)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.6f)
                        .build()
                )
        );
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
}
