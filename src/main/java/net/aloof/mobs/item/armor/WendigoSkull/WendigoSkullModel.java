package net.aloof.mobs.item.armor.WendigoSkull;

import net.aloof.mobs.Main;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WendigoSkullModel extends AnimatedGeoModel<WendigoSkullItem> {

    @Override
    public Identifier getModelLocation(WendigoSkullItem object) {
        return new Identifier(Main.MOD_ID, "geo/armor/wendigo_skull.geo.json");
    }

    @Override
    public Identifier getTextureLocation(WendigoSkullItem object) {
        return new Identifier(Main.MOD_ID, "textures/models/armor/wendigo_skull_layer_1.png");
    }

    @Override
    public Identifier getAnimationFileLocation(WendigoSkullItem animatable) {
        return new Identifier(Main.MOD_ID, "geo/armor/wendigoskull.animation.idle.json");
    }
}


