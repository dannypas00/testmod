package com.dannypas00.testmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class SilverIngotItem extends AbstractItem {
    public SilverIngotItem() {
        super(
                new FabricItemSettings()
                        .group(ItemGroup.MATERIALS)
                        .rarity(Rarity.UNCOMMON)
        );
    }
}
