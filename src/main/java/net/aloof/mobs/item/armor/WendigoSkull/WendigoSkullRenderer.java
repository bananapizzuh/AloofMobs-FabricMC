package net.aloof.mobs.item.armor.WendigoSkull;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WendigoSkullRenderer extends GeoArmorRenderer {

    public WendigoSkullRenderer() {
        super(new WendigoSkullModel());

        this.headBone = "HeadBone";
    }
}