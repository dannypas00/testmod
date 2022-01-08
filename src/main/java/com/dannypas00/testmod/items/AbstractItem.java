package com.dannypas00.testmod.items;

import com.dannypas00.testmod.ModInfo;
import com.dannypas00.testmod.Util;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractItem extends Item implements FabricItem {

    public AbstractItem(Settings settings) {
        super(settings);
    }

    public void register() {
        Registry.register(Registry.ITEM, this.getIdentifier(), this);
    }

    public Identifier getIdentifier() {
        return new Identifier(ModInfo.MOD_ID, Util.pathFromClass(this.getClass()));
    }
}
