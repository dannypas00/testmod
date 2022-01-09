package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.armor.silver.SilverBoots;
import com.dannypas00.testmod.registerables.armor.silver.SilverChestplate;
import com.dannypas00.testmod.registerables.armor.silver.SilverHelmet;
import com.dannypas00.testmod.registerables.armor.silver.SilverLeggings;
import net.minecraft.item.ArmorItem;

public class ArmorRegister {
    public static ArmorItem
            SILVER_HELMET     = new SilverHelmet().register(),
            SILVER_CHESTPLATE = new SilverChestplate().register(),
            SILVER_LEGGINGS   = new SilverLeggings().register(),
            SILVER_BOOTS      = new SilverBoots().register();

    public static void register() {
    }
}
