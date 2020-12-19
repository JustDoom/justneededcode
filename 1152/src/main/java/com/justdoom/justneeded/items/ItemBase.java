package com.justdoom.justneeded.items;

import com.justdoom.justneeded.JustNeeded;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(JustNeeded.JustNeededTab));
    }
}