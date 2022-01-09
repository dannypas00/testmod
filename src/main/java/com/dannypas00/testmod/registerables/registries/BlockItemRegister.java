package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.blockitems.SilverBlockBlockItem;
import com.dannypas00.testmod.registerables.blockitems.SilverOreBlockItem;
import net.minecraft.item.BlockItem;

public class BlockItemRegister {
    public static BlockItem
            SILVER_ORE_ITEM   = new SilverOreBlockItem().register(),
            SILVER_BLOCK_ITEM = new SilverBlockBlockItem().register();

    public static void register() {}
}
