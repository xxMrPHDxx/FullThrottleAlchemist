package com.mrphd.fta.init;

import java.util.ArrayList;
import java.util.List;

import com.mrphd.fta.block.Atelier;
import com.mrphd.fta.block.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block ATELIER = new Atelier();
	public static final Block BOTTLE = new BlockBase("bottle",Material.GLASS);
	
}
