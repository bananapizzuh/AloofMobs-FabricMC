package net.aloof.mobs.entity;

import net.aloof.mobs.Main;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModEntities {

    public static void RegisterEntities() {
        FabricDefaultAttributeRegistry.register(Main.WENDIGO, WendigoEntity.createMobAttributes());
    }
}
