package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.items.SilverIngotItem;
import net.minecraft.item.Item;

public class ItemRegister {
    public static Item SILVER_INGOT = new SilverIngotItem().register();

    public static void register() {}
}
