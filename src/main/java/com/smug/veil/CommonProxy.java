package com.smug.veil;

import com.smug.veil.entity.EntityGorgon;
import com.smug.veil.model.ModelGorgon;
import com.smug.veil.render.entity.RenderGorgon;
import com.smug.veil.Refs;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;


public class CommonProxy {
    
    int EntityID;
    
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgon.class, new RenderGorgon(new ModelGorgon(), 1));
    }
    
    public void registerEntities() {
	EntityID = EntityRegistry.findGlobalUniqueEntityId();
	
	EntityRegistry.registerModEntity(EntityGorgon.class, "EntityGorgon", EntityID++, Refs.instance, 80, 1, false);
	EntityRegistry.registerEgg(EntityGorgon.class, 0xffcccc,0xff9966);
    }
    
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {}

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
