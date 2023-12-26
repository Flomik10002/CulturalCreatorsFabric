package flomik.culturalcreators.item;

import flomik.culturalcreators.CulturalCreatorsMod;
import flomik.culturalcreators.init.ModFluidsRegister;
import flomik.culturalcreators.init.ModItemsRegister;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup MAIN = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CulturalCreatorsMod.MOD_ID, "culturd"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.culturd"))
                    .icon(() -> new ItemStack(ModItemsRegister.INCOMPLETE_ELOTE)).entries((displayContext, entries) -> {
                        entries.add(ModItemsRegister.INCOMPLETE_ELOTE);
                        entries.add(ModItemsRegister.INCOMPLETE_BEEF_BURRITO);
                        entries.add(ModItemsRegister.INCOMPLETE_MUTTON_SANDWICH);
                        entries.add(ModItemsRegister.INCOMPLETE_FRIED_EGGPLANT_PASTA);
                        entries.add(ModItemsRegister.INCOMPLETE_EGGPLANT_BURGER);
                        entries.add(ModItemsRegister.INCOMPLETE_HEARTY_SALAD);
                        entries.add(ModItemsRegister.INCOMPLETE_CHICKEN_TACO);
                        entries.add(ModItemsRegister.INCOMPLETE_FISH_TACO);
                        entries.add(ModItemsRegister.INCOMPLETE_PORK_WRAP);
                        entries.add(ModItemsRegister.INCOMPLETE_SPICY_CURRY);
                        entries.add(ModItemsRegister.INCOMPLETE_EXOTIC_ROLL_MEDLEY);
                        entries.add(ModFluidsRegister.CREAMED_CORN_BUCKET);

    }).build());

    public static void registerModItemGroup(){
        CulturalCreatorsMod.LOGGER.debug("Registering Mod Item Group for " + CulturalCreatorsMod.MOD_ID);
    }
}
