package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.Util;
import com.dannypas00.testmod.registerables.blocks.SilverBlockBlock;
import com.dannypas00.testmod.registerables.blocks.SilverOreBlock;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;

public class BlockRegister {
    public static Block
            SILVER_ORE   = new SilverOreBlock().register(),
            SILVER_BLOCK = new SilverBlockBlock().register();

    public static final Tag<Block>
            SILVER_ORE_TAG = TagFactory.BLOCK.create(Util.createIdentifierFromClass(SILVER_ORE.getClass())),
            SILVER_BLOCK_TAG = TagFactory.BLOCK.create(Util.createIdentifierFromClass(SILVER_BLOCK.getClass()));

    public static void register() {
    }
}
