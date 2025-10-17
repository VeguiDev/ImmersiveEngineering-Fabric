package blusunrize.immersiveengineering.fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IEFabricMod implements ModInitializer {
    public static final String MODID = "immersiveengineering";
    private static final Logger LOGGER = LoggerFactory.getLogger("IE-Fabric");

    @Override
    public void onInitialize() {
        // Minimal initializer to verify Fabric wiring.
        // Full port requires replacing NeoForge registries/events/capabilities with Fabric equivalents.
        LOGGER.info("Immersive Engineering (Fabric) initializer loaded. Version: {}", getClass().getPackage().getImplementationVersion());
    }
}

