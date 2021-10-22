package net.aloof.mobs.item.armor.WendigoSkull;

import net.aloof.mobs.entity.model.WendigoModel;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.util.GeoArmorRendererFactory;

public class WendigoSkullRenderer extends GeoArmorRenderer implements GeoArmorRendererFactory<E> {

    public WendigoSkullRenderer() {
        super(new WendigoSkullModel());

        this.headBone = "HeadBone";
    }

    @Override
    public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public Identifier getTextureLocation(Object instance) {
        return null;
    }

    @Override
    public ItemRenderer create(Context ctx) {
        return null;
    }
}