package net.daniel.tutorialmod.item;

import net.daniel.tutorialmod.TutorialMod;
import net.daniel.tutorialmod.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * ModItemsGroups
 */
public class ModItemsGroups {

  public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(
      Registries.ITEM_GROUP,
      Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
      FabricItemGroup.builder()
          .icon(() -> new ItemStack(ModItems.PINK_GARNET))
          .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
          .entries((displayContext, entries) -> {
            entries.add(ModItems.PINK_GARNET);
            entries.add(ModItems.RAW_PINK_GARNET);
          })
          .build());

  public static final ItemGroup PINK_GARNET_BLOCKS_GROUP= Registry.register(
      Registries.ITEM_GROUP,
      Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
      FabricItemGroup.builder()
          .icon(() -> new ItemStack(ModBlock.PINK_GARNET_BLOCK))
          .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
          .entries((displayContext, entries) -> {
              entries.add(ModBlock.PINK_GARNET_BLOCK);
          })
          .build());

  public static void registerItemGroups() {
    TutorialMod.LOGGER.info("Registrando los items para el grupo de " + TutorialMod.MOD_ID);
  }

}
