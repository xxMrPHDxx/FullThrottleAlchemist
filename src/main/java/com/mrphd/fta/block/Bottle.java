package com.mrphd.fta.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.item.ItemHoe;

public class Bottle extends BlockBase {

	public Bottle() {
		super("bottle",Material.GLASS);
		setSoundType(SoundType.GLASS); // Sound when walk on run on it
		setHardness(0.3f); // Breaking hardness
		setResistance(2.4f); // Resistance to explosives
		setLightLevel(1.6f); // Light level emitted by the block
		setLightOpacity(1); // Light level allowed to pass through
	}
	
}
