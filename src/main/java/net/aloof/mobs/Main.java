package net.aloof.mobs;

import net.aloof.mobs.entity.ModEntities;
import net.aloof.mobs.entity.WendigoEntity;
import net.aloof.mobs.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class Main implements ModInitializer {

    public static final String MOD_ID = "aloofmobs";
    public static final EntityType<WendigoEntity> WENDIGO = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("aloofmobs", "wendigo"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WendigoEntity::new).build()
    );

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(WENDIGO, WendigoEntity.createMobAttributes());
    }
}
