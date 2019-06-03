package com.mrphd.fta.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Atelier extends BlockBase {
	
	public Atelier() {
		super("atelier",Material.WOOD);
		setCreativeTab(null);
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		spawnAsEntity(Minecraft.getMinecraft().world, pos, new ItemStack(Blocks.CRAFTING_TABLE));
	}

}
