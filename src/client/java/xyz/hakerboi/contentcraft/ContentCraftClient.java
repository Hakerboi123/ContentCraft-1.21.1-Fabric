package xyz.hakerboi.contentcraft;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static xyz.hakerboi.contentcraft.ContentCraft.MOD_ID;


public class ContentCraftClient implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitializeClient() {
		LOGGER.info("Initialised Client!");
	}
}