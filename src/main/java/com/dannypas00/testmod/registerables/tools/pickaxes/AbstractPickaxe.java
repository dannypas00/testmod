package com.dannypas00.testmod.registerables.tools.pickaxes;

import com.dannypas00.testmod.ModInfo;
import com.dannypas00.testmod.Util;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractPickaxe extends PickaxeItem {
    protected static Settings defaultSettings = new FabricItemSettings().group(ItemGroup.TOOLS);

    public AbstractPickaxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public PickaxeItem register() {
        return Registry.register(Registry.ITEM, this.getIdentifier(), this);
    }

    public Identifier getIdentifier() {
        return new Identifier(ModInfo.MOD_ID, Util.pathFromClass(this.getClass()));
    }
}
