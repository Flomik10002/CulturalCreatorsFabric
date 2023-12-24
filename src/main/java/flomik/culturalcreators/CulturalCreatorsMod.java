package flomik.culturalcreators;

import flomik.culturalcreators.init.ModFluidsRegister;
import flomik.culturalcreators.init.ModItemsRegister;
import flomik.culturalcreators.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CulturalCreatorsMod implements ModInitializer {
    public static final String MOD_ID = "culturalcreators";
    public static final Logger LOGGER = LoggerFactory.getLogger("Cultural Creators");

    @Override
    public void onInitialize() {
        ModFluidsRegister.register();
        ModItemsRegister.registerModItems();
        ModItemsGroup.registerModItemGroup();
    }
}