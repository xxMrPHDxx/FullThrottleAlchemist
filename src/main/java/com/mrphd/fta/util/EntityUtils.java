package com.mrphd.fta.util;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

public class EntityUtils {
	
	public static NBTTagCompound getModComp(Entity entity) {
		NBTTagCompound comp;
		if (entity == null || entity.getEntityData() == null) {
			return new NBTTagCompound();
		}
		NBTTagCompound nBTTagCompound = comp = entity.getEntityData().hasKey("project_alchemy")
				? entity.getEntityData().getCompoundTag("project_alchemy")
				: null;
		if (comp == null) {
			entity.getEntityData().setTag("project_alchemy", (NBTBase) new NBTTagCompound());
			comp = entity.getEntityData().getCompoundTag("project_alchemy");
		}
		return comp;
	}

}
