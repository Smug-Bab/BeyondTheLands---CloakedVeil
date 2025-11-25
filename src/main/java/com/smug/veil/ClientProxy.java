package com.smug.veil;

import com.smug.veil.entity.EntityGorgon;
import com.smug.veil.model.ModelGorgon;
import com.smug.veil.render.entity.RenderGorgon;
import com.smug.veil.Refs;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

    int EntityID;
    
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgon.class, new RenderGorgon(new ModelGorgon(), 1));
    }
    
    public void registerEntities() {
	EntityID = EntityRegistry.findGlobalUniqueEntityId();
	
	EntityRegistry.registerModEntity(EntityGorgon.class, "EntityGorgon", EntityID++, Refs.instance, 80, 1, false);
	EntityRegistry.registerEgg(EntityGorgon.class, 0xffcccc, 0xff9966);
    }

}
