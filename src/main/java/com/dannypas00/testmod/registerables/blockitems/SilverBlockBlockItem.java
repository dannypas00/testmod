package com.dannypas00.testmod.registerables.blockitems;

import com.dannypas00.testmod.registerables.registries.BlockRegister;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class SilverBlockBlockItem extends AbstractBlockItem {
    public SilverBlockBlockItem() {
        super(BlockRegister.SILVER_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
}
