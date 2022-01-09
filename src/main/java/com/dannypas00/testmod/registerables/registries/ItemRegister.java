package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.items.SilverIngotItem;
import com.dannypas00.testmod.registerables.items.SilverRawOreItem;
import net.minecraft.item.Item;

public class ItemRegister {
    public static Item
            SILVER_INGOT   = new SilverIngotItem().register(),
            SILVER_RAW_ORE = new SilverRawOreItem().register();

    public static void register() {
    }
}
