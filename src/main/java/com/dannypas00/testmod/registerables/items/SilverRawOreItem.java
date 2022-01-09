package com.dannypas00.testmod.registerables.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class SilverRawOreItem extends AbstractItem {
    public SilverRawOreItem() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS));
    }
}
