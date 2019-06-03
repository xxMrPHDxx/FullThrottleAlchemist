package com.mrphd.fta;

import com.mrphd.fta.proxy.CommonProxy;
import com.mrphd.fta.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MODID,name=Reference.NAME,version=Reference.VERSION)
public class FullThrottleAlchemist {
	
	@Mod.Instance
	public static FullThrottleAlchemist instance;
	
	@SidedProxy(clientSide=Reference.CLIENT,serverSide=Reference.SERVER)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(final FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public static void init(final FMLInitializationEvent event) {
		
	}
	@EventHandler
	public static void postInit(final FMLPostInitializationEvent event) {
		
	}
	
}
