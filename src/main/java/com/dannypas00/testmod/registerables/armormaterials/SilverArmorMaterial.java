package com.dannypas00.testmod.registerables.armormaterials;

import com.dannypas00.testmod.registerables.registries.ItemRegister;
import com.dannypas00.testmod.registerables.toolmaterials.AbstractArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SilverArmorMaterial extends AbstractArmorMaterial {
    @Override
    public float getDurabilityMultiplier() {
        return 20;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public float getProtectionMultiplier() {
        return 2.75f;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegister.SILVER_INGOT);
    }
}
