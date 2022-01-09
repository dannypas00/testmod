package com.dannypas00.testmod;

import com.dannypas00.testmod.registerables.registries.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(ModInfo.MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info(String.format("Hello from %s", ModInfo.MOD_ID));

		register();
	}

	private void register() {
		ItemRegister.register();

		ToolMaterialRegister.register();
		ArmorMaterialRegister.register();

		ToolRegister.register();
		ArmorRegister.register();
	}
}
