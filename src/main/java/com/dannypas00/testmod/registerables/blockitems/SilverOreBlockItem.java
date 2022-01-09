package com.dannypas00.testmod.registerables.blockitems;

import com.dannypas00.testmod.registerables.registries.BlockRegister;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class SilverOreBlockItem extends AbstractBlockItem {
    public SilverOreBlockItem() {
        super(BlockRegister.SILVER_ORE, new FabricItemSettings().group(ItemGroup.MATERIALS));
    }
}
