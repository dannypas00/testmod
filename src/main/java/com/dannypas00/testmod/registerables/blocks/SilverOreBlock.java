package com.dannypas00.testmod.registerables.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;

public class SilverOreBlock extends AbstractBlock {
    public SilverOreBlock() {
        super(FabricBlockSettings
                      .of(Material.STONE)
                      .hardness(Blocks.GOLD_ORE.getHardness())
                      .resistance(Blocks.GOLD_ORE.getBlastResistance())
                      .requiresTool()
        );
    }
}
