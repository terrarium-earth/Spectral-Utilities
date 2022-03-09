package com.willowworks.spectral_utilities;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.willowworks.spectral_utilities.registry.SpectralBlocks.registerBlocks;

public class SpectralUtilities implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MODID = "spectral_utilities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final String THIS_MOD_WAS_WRITTEN_IN_FULL_BY_THE_ONE_AND_ONLY_AND_VERY_COOL_AND_UNBEATABLE_ADRIAN = "This mod was written in full by the one and only and very cool and unbeatable Adrian";

	@Override
	public void onInitialize() {
		registerBlocks();
		System.out.println(THIS_MOD_WAS_WRITTEN_IN_FULL_BY_THE_ONE_AND_ONLY_AND_VERY_COOL_AND_UNBEATABLE_ADRIAN);
	}
}
