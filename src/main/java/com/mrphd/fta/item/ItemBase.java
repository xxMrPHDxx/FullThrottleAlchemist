package com.mrphd.fta.item;

import com.mrphd.fta.FullThrottleAlchemist;
import com.mrphd.fta.init.ModItems;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(final String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		FullThrottleAlchemist.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
