package com.dannypas00.testmod.registerables.tools.weapons;

import com.dannypas00.testmod.toolmaterials.SilverToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;

public class SilverSwordWeapon extends AbstractWeapon {
    public SilverSwordWeapon() {
        super(new SilverToolMaterial(), 3, -2.4f,
                new FabricItemSettings()
                        .group(ItemGroup.COMBAT)
        );
    }
}
