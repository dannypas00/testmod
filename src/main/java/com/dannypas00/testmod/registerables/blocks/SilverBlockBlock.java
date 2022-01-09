package com.dannypas00.testmod.registerables.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;

public class SilverBlockBlock extends AbstractBlock {
    public SilverBlockBlock() {
        super(FabricBlockSettings
                      .of(Material.METAL)
                      .hardness(Blocks.GOLD_BLOCK.getHardness())
                      .resistance(Blocks.GOLD_BLOCK.getBlastResistance())
                      .requiresTool()
        );
    }
}
