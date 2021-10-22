package net.aloof.mobs.entity.render;

import net.aloof.mobs.entity.WendigoEntity;
import net.aloof.mobs.entity.model.WendigoModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WendigoRender extends GeoEntityRenderer<WendigoEntity> {

    public WendigoRender(EntityRendererFactory.Context context) {
        super(context, new WendigoModel());

    }
}