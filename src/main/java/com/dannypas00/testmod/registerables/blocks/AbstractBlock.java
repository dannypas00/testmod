package com.dannypas00.testmod.registerables.blocks;

import com.dannypas00.testmod.Util;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public abstract class AbstractBlock extends Block {
    public AbstractBlock(Settings settings) {
        super(settings);
    }

    public Block register() {
        return Registry.register(Registry.BLOCK, Util.createIdentifierFromClass(this.getClass()), this);
    }
}
