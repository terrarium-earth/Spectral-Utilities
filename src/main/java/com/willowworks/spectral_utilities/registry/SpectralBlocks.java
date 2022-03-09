package com.willowworks.spectral_utilities.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.willowworks.spectral_utilities.SpectralUtilities.MODID;

public class SpectralBlocks {
    public static final Block ARCTIC_BEDROCKIUM_HARDSTONE = new Block(FabricBlockSettings.of(Material.STONE, MapColor.WHITE));
    public static final Block BEDROCKIUM_HARDSTONE = new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK));
    public static final Block BEDROCKIUM_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK));
    public static final Block TITAN_STONE = new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning((state, world, pos, type) -> false));

    public static void registerBlocks() {
        registerBlock(ARCTIC_BEDROCKIUM_HARDSTONE, "arctic_bedrockium_hardstone");
        registerBlock(BEDROCKIUM_HARDSTONE, "bedrockium_hardstone");
        registerBlock(BEDROCKIUM_DEEPSLATE, "bedrockium_deepslate");
        registerBlock(TITAN_STONE, "titan_stone");
    }

    public static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
        Registry.register(Registry.ITEM, new Identifier(MODID, name), new BlockItem(block, new Item.Settings()));
    }
}
