package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.items.SilverIngotItem;
import com.dannypas00.testmod.registerables.tools.weapons.SilverSwordWeapon;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ItemRegister {
    public static Item SILVER_INGOT = new SilverIngotItem().register();
    public static SwordItem SILVER_SWORD = new SilverSwordWeapon().register();

    public static void register() {}
}
