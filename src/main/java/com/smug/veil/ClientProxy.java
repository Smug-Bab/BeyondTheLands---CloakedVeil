package com.smug.veil;

import com.smug.veil.entity.EntityGorgon;
import com.smug.veil.model.ModelGorgon;
import com.smug.veil.render.entity.RenderGorgon;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerRender();
    }

    public static void registerRender() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgon.class, new RenderGorgon(new ModelGorgon(), 1));
    }
}
