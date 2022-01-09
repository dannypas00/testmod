package com.dannypas00.testmod.registerables.registries;

import com.dannypas00.testmod.registerables.tools.axe.SilverAxe;
import com.dannypas00.testmod.registerables.tools.hoes.SilverHoe;
import com.dannypas00.testmod.registerables.tools.pickaxes.SilverPickaxe;
import com.dannypas00.testmod.registerables.tools.shovels.SilverShovel;
import com.dannypas00.testmod.registerables.tools.weapons.SilverSwordWeapon;
import net.minecraft.item.*;

public class ToolRegister {
    public static SwordItem SILVER_SWORD = new SilverSwordWeapon().register();
    public static AxeItem SILVER_AXE = new SilverAxe().register();
    public static HoeItem SILVER_HOE = new SilverHoe().register();
    public static PickaxeItem SILVER_PICKAXE = new SilverPickaxe().register();
    public static ShovelItem SILVER_SHOVEL = new SilverShovel().register();

    public static void register() {}
}
