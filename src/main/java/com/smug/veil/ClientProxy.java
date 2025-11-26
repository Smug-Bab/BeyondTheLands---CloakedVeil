package com.smug.veil;

import com.smug.veil.entity.EntityGorgon;
import com.smug.veil.model.ModelGorgon;
import com.smug.veil.render.entity.RenderGorgon;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRender() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgon.class, new RenderGorgon(new ModelGorgon(), 1));
    }
}
