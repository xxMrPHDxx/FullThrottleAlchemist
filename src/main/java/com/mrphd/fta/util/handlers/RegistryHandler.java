package com.mrphd.fta.util.handlers;

import com.mrphd.fta.init.ModBlocks;
import com.mrphd.fta.init.ModItems;
import com.mrphd.fta.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(final RegistryEvent.Register<Item> event) {
		ModItems.ITEMS.forEach(item -> event.getRegistry().register(item));
	}

	@SubscribeEvent
	public static void onBlockRegister(final RegistryEvent.Register<Block> event) {
		ModBlocks.BLOCKS.forEach(block -> event.getRegistry().register(block));
	}
	
	@SubscribeEvent
	public static void onModelRegister(final ModelRegistryEvent event) {
		for(final Item item : ModItems.ITEMS){
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : ModBlocks.BLOCKS){
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		};
	}
	
}
