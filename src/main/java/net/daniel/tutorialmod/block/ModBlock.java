package net.daniel.tutorialmod.block;

import net.daniel.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

/**
 * ModBlock
 */
public class ModBlock {

  public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
      new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

  public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
      new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));

  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
  }

  private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
  }

  public static void registerModBlocks() {
    TutorialMod.LOGGER.info("Registrando los bloques del mod" + TutorialMod.MOD_ID);

    // Se añade a los ingredientes
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
      entries.add(PINK_GARNET_BLOCK);
      entries.add(RAW_PINK_GARNET_BLOCK);
    });
  }

}
