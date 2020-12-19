package com.justdoom.justneeded.items.food;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedEgg extends Item {

    public CookedEgg() {
        super(new Item.Properties()
                .group(JustNeeded.JustNeededTab)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(5)
                        .build()
                )
        );
    }
}
