package com.dannypas00.testmod.registerables.armor.silver;

import com.dannypas00.testmod.registerables.armor.AbstractArmor;
import com.dannypas00.testmod.registerables.registries.ArmorMaterialRegister;
import net.minecraft.entity.EquipmentSlot;

public class SilverHelmet extends AbstractArmor {
    public SilverHelmet() {
        super(ArmorMaterialRegister.SILVER_ARMOR_MATERIAL, EquipmentSlot.HEAD, defaultSettings);
    }
}
