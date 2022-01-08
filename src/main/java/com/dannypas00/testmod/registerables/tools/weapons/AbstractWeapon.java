package com.dannypas00.testmod.registerables.tools.weapons;

import com.dannypas00.testmod.ModInfo;
import com.dannypas00.testmod.Util;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractWeapon extends SwordItem {
    public AbstractWeapon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public SwordItem register() {
        return Registry.register(Registry.ITEM, this.getIdentifier(), this);
    }

    public Identifier getIdentifier() {
        return new Identifier(ModInfo.MOD_ID, Util.pathFromClass(this.getClass()));
    }
}
