package flomik.culturalcreators.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import flomik.culturalcreators.init.ModFluidsRegister;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.fluid.FluidState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Environment(EnvType.CLIENT)
@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {
    @Shadow
    private static float red;

    @Shadow
    private static float green;

    @Shadow
    private static float blue;

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void culturalcreators$modifyFogColors(Args args, Camera camera, float partialTicks, ClientWorld level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPos());
        if (ModFluidsRegister.isCreamedCorn(state)) {
            red = (float) 252 / 255;
            green = (float) 230 / 255;
            blue = (float) 165 / 255;
        }
    }

    @Inject(method = "applyFog", at = @At("HEAD"), cancellable = true)
    private static void culturalcreators$applyFog(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert MinecraftClient.getInstance().world != null;
        FluidState state = MinecraftClient.getInstance().world.getFluidState(camera.getBlockPos());
        if (ModFluidsRegister.isCreamedCorn(state)) {
            RenderSystem.setShaderFogStart(-8);
            RenderSystem.setShaderFogEnd(5);
            ci.cancel();
        }
    }
}