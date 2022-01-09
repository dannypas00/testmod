package com.dannypas00.testmod.registerables.armor;

import com.dannypas00.testmod.ModInfo;
import com.dannypas00.testmod.Util;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractArmor extends ArmorItem {
    protected static Settings defaultSettings = new FabricItemSettings().group(ItemGroup.COMBAT);

    public AbstractArmor(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    public ArmorItem register() {
        return Registry.register(Registry.ITEM, this.getIdentifier(), this);
    }

    public Identifier getIdentifier() {
        return new Identifier(ModInfo.MOD_ID, Util.pathFromClass(this.getClass()));
    }

}
