package com.smug.veil.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.smug.veil.InitRefs;

public class RenderGorgon extends RenderLiving {

    private static final ResourceLocation gorgonTextures = new ResourceLocation(InitRefs.MODID + "textures/gorgon.png");

    public RenderGorgon(ModelBase model, float f) {
        super(model, f);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        return gorgonTextures;
    }
}
