package flomik.culturalcreators.init.utils.tags;

import flomik.culturalcreators.CulturalCreatorsMod;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModTags {

    public static class ModBlockTags {
        public static @NotNull TagKey<Block> createBlockTag(String modBlockTagName) {
            return TagKey.of(Registries.BLOCK.getKey(), new Identifier(CulturalCreatorsMod.MOD_ID, modBlockTagName));
        }

        public static @NotNull TagKey<Block> createBlockFluidTag(String modBlockTagName) {
            return TagKey.of(Registries.BLOCK.getKey(), new Identifier("c", modBlockTagName));
        }
    }

    public static class ModItemTags {

        public static @NotNull TagKey<Item> createItemTag(String modItemTagName) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier(CulturalCreatorsMod.MOD_ID, modItemTagName));
        }

        public static @NotNull TagKey<Item> createCommonItemTag(String modItemTagName) {
            return TagKey.of(Registries.ITEM.getKey(), new Identifier("c", modItemTagName));
        }
    }

    public static class ModFluidTags {

        public static @NotNull TagKey<Fluid> createFluidTag(String modFluidTagName) {
            return TagKey.of(Registries.FLUID.getKey(), new Identifier(CulturalCreatorsMod.MOD_ID, modFluidTagName));
        }

        public static @NotNull TagKey<Fluid> createCommonFluidTag(String modFluidTagName) {
            return TagKey.of(Registries.FLUID.getKey(), new Identifier("c", modFluidTagName));
        }
    }

    public static void registerModTags(){
        CulturalCreatorsMod.LOGGER.debug("Registering Mod Tags for " + CulturalCreatorsMod.MOD_ID);
    }
}