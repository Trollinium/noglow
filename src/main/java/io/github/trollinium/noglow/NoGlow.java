package io.github.trollinium.noglow;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoGlow implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("noglow");

	@Override
	public void onInitialize() {
		LOGGER.info("No more glow!");
	}
}