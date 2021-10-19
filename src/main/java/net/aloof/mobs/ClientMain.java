package net.aloof.mobs;

import net.aloof.mobs.entity.render.WendigoRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ClientMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Client");
        EntityRendererRegistry.register(Main.WENDIGO, (context) -> new WendigoRender(context));
        };
}

