package com.justdoom.justneeded.init;

import com.justdoom.justneeded.JustNeeded;
import com.justdoom.justneeded.blocks.GravitySlabs;
import com.justdoom.justneeded.blocks.GravityStairs;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JustNeeded.MOD_ID);

    public static void init(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



    //Stairs
    public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs", () -> new StairsBlock(() -> Blocks.DIRT.getDefaultState(), Block.Properties.create(Material.EARTH, MaterialColor.DIRT)
            .hardnessAndResistance(0.5f, 0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GROUND)
    ));
    public static final RegistryObject<Block> GLOWSTONE_STAIRS = BLOCKS.register("glowstone_stairs", () -> new StairsBlock(() -> Blocks.GLOWSTONE.getDefaultState(), Block.Properties.create(Material.GLASS, MaterialColor.SAND)
            .hardnessAndResistance(0.3f)
            .sound(SoundType.GLASS)
            .setLightLevel(value -> 15)
    ));



    //Slabs
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab", () -> new SlabBlock(Block.Properties.create(Material.EARTH, MaterialColor.DIRT)
            .hardnessAndResistance(0.5f, 0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GROUND)
    ));
    public static final RegistryObject<Block> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () -> new SlabBlock(Block.Properties.create(Material.GLASS, MaterialColor.SAND)
            .hardnessAndResistance(0.3f)
            .sound(SoundType.GLASS)
            .setLightLevel(value -> 15)
    ));


    //Gravity Affected Stairs
    public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs", () -> new GravityStairs(Blocks.SAND.getDefaultState(), Block.Properties.create(Material.SAND, MaterialColor.SAND)
            .hardnessAndResistance(0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> RED_SAND_STAIRS = BLOCKS.register("red_sand_stairs", () -> new GravityStairs(Blocks.RED_SAND.getDefaultState(), Block.Properties.create(Material.SAND, MaterialColor.ADOBE)
            .hardnessAndResistance(0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs", () -> new GravityStairs(Blocks.GRAVEL.getDefaultState(), Block.Properties.create(Material.SAND, MaterialColor.STONE)
            .hardnessAndResistance(0.6f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GROUND)
    ));


    //Gravity Affected Slabs
    public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab", () -> new GravitySlabs(Block.Properties.create(Material.SAND, MaterialColor.SAND)
            .hardnessAndResistance(0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> RED_SAND_SLAB = BLOCKS.register("red_sand_slab", () -> new GravitySlabs(Block.Properties.create(Material.SAND, MaterialColor.ADOBE)
            .hardnessAndResistance(0.5f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.SAND)
    ));
    public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab", () -> new GravitySlabs(Block.Properties.create(Material.SAND, MaterialColor.STONE)
            .hardnessAndResistance(0.6f)
            .harvestTool(ToolType.SHOVEL)
            .sound(SoundType.GROUND)
    ));



    //Wool Stairs
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCKS.register("white_wool_stairs", () -> new StairsBlock(() -> Blocks.WHITE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.SNOW)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCKS.register("orange_wool_stairs", () -> new StairsBlock(() -> Blocks.ORANGE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.ADOBE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCKS.register("magenta_wool_stairs", () -> new StairsBlock(() -> Blocks.MAGENTA_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.MAGENTA)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCKS.register("light_blue_wool_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_BLUE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.LIGHT_BLUE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCKS.register("yellow_wool_stairs", () -> new StairsBlock(() -> Blocks.YELLOW_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.YELLOW)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCKS.register("lime_wool_stairs", () -> new StairsBlock(() -> Blocks.LIME_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.LIME)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCKS.register("pink_wool_stairs", () -> new StairsBlock(() -> Blocks.PINK_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.PINK)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCKS.register("gray_wool_stairs", () -> new StairsBlock(() -> Blocks.GRAY_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.GRAY)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCKS.register("light_gray_wool_stairs", () -> new StairsBlock(() -> Blocks.LIGHT_GRAY_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.LIGHT_GRAY)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCKS.register("cyan_wool_stairs", () -> new StairsBlock(() -> Blocks.CYAN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.CYAN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCKS.register("purple_wool_stairs", () -> new StairsBlock(() -> Blocks.PURPLE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.PURPLE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCKS.register("blue_wool_stairs", () -> new StairsBlock(() -> Blocks.BLUE_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.BLUE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCKS.register("brown_wool_stairs", () -> new StairsBlock(() -> Blocks.BROWN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.BROWN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCKS.register("green_wool_stairs", () -> new StairsBlock(() -> Blocks.GREEN_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.GREEN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCKS.register("red_wool_stairs", () -> new StairsBlock(() -> Blocks.RED_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.RED)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCKS.register("black_wool_stairs", () -> new StairsBlock(() -> Blocks.BLACK_WOOL.getDefaultState(), Block.Properties.create(Material.WOOL, MaterialColor.BLACK)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));



    //Wool Slabs
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = BLOCKS.register("white_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.SNOW)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = BLOCKS.register("orange_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.ADOBE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = BLOCKS.register("magenta_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.MAGENTA)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = BLOCKS.register("light_blue_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.LIGHT_BLUE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = BLOCKS.register("yellow_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.YELLOW)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = BLOCKS.register("lime_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.LIME)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = BLOCKS.register("pink_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.PINK)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = BLOCKS.register("gray_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.GRAY)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = BLOCKS.register("light_gray_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.LIGHT_GRAY)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = BLOCKS.register("cyan_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.CYAN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = BLOCKS.register("purple_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.PURPLE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = BLOCKS.register("blue_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.BLUE)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = BLOCKS.register("brown_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.BROWN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = BLOCKS.register("green_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.GREEN)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> RED_WOOL_SLAB = BLOCKS.register("red_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.RED)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = BLOCKS.register("black_wool_slab", () -> new SlabBlock(Block.Properties.create(Material.WOOL, MaterialColor.BLACK)
            .hardnessAndResistance(0.8f)
            .sound(SoundType.CLOTH)
    ));
}