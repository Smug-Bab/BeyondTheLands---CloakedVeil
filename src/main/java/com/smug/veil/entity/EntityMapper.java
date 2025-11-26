package com.smug.veil.entity;

import net.minecraft.entity.EntityList;

import com.smug.veil.InitRefs;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityMapper {

    public static void mainRegistry() {
        registerEntity();
    }

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
}
