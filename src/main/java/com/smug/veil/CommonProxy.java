package com.smug.veil;

import com.smug.veil.entity.EntityGorgon;
import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;
import com.smug.veil.InitRefs;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
	

public class CommonProxy {

    
    public static void registerEntity() {
	    createEntity(EntityGorgon.class, "EntityGorgon", 0xf57e42, 0xd48f6c);
	}

	public static void createEntity(Class entityClass, String entityName, int solidC, int spotC) {
	    int randomId = EntityRegistry.findGlobalUniqueEntityId();

	    EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
	    EntityRegistry.registerModEntity(entityClass, entityName, randomId, InitRefs.instance, 64, 1, false);
	    createEgg(randomId, solidC, spotC);
	}

	private static void createEgg(int randomId, int solidC, int spotC) {
	    EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidC, spotC));
	}
	
	
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
	registerEntity();
	    
    }

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}