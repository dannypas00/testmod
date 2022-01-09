package com.dannypas00.testmod.registerables.tools.shovels;

import com.dannypas00.testmod.registerables.registries.ToolMaterialRegister;

public class SilverShovel extends AbstractShovel {
    public SilverShovel() {
        super(ToolMaterialRegister.SILVER_TOOL_MATERIAL, 1.5f, -3.0f, defaultSettings);
    }
}
