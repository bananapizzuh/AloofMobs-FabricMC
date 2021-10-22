package net.aloof.mobs.entity.model;

import net.aloof.mobs.Main;
import net.aloof.mobs.entity.WendigoEntity;
import net.minecraft.util.Identifier;

import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WendigoModel extends AnimatedGeoModel<WendigoEntity> {

    public Identifier getModelLocation(WendigoEntity object) {
        return new Identifier(Main.MOD_ID, "geo/entity/wendigo_.geo.json");
    }

    public Identifier getTextureLocation(WendigoEntity object) {
        return new Identifier(Main.MOD_ID, "textures/entity/wendigo_.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WendigoEntity animatable) {
        return new Identifier(Main.MOD_ID, "geo/entity/wendigo_.geo.json");
    }
}
