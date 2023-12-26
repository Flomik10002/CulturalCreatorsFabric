package flomik.culturalcreators.init;

import flomik.culturalcreators.CulturalCreatorsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemsRegister {
    public static final Item INCOMPLETE_ELOTE = registerItem("incomplete_elote",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_BEEF_BURRITO = registerItem("incomplete_beef_burrito",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_MUTTON_SANDWICH = registerItem("incomplete_mutton_sandwich",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_FRIED_EGGPLANT_PASTA = registerItem("incomplete_fried_eggplant_pasta",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_EGGPLANT_BURGER = registerItem("incomplete_eggplant_burger",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_HEARTY_SALAD = registerItem("incomplete_hearty_salad",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_CHICKEN_TACO = registerItem("incomplete_chicken_taco",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_FISH_TACO = registerItem("incomplete_fish_taco",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_PORK_WRAP = registerItem("incomplete_pork_wrap",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_SPICY_CURRY = registerItem("incomplete_spicy_curry",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));
    public static final Item INCOMPLETE_EXOTIC_ROLL_MEDLEY = registerItem("incomplete_exotic_roll_medley",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CulturalCreatorsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CulturalCreatorsMod.LOGGER.debug("Registering Mod Items for " + CulturalCreatorsMod.MOD_ID);
    }
}
