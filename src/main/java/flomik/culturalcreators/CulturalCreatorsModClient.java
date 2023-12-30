package flomik.culturalcreators;

import flomik.culturalcreators.init.ModFluidsRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class CulturalCreatorsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluidsRegister.STILL_CREAMED_CORN, ModFluidsRegister.FLOWING_CREAMED_CORN, new SimpleFluidRenderHandler(
                new Identifier("culturalcreators:block/creamed_corn_still"),
                new Identifier("culturalcreators:block/creamed_corn_flow")
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluidsRegister.STILL_CREAMED_CORN, ModFluidsRegister.FLOWING_CREAMED_CORN);
    }
}