package com.dannypas00.testmod.registerables.armor.silver;

import com.dannypas00.testmod.registerables.armor.AbstractArmor;
import com.dannypas00.testmod.registerables.registries.ArmorMaterialRegister;
import net.minecraft.entity.EquipmentSlot;

public class SilverLeggings extends AbstractArmor {
    public SilverLeggings() {
        super(ArmorMaterialRegister.SILVER_ARMOR_MATERIAL, EquipmentSlot.LEGS, defaultSettings);
    }
}
