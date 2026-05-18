package com.mumu17.copycat_wing.mixin.copycats;

import com.copycatsplus.copycats.content.copycat.slope_layer.CopycatSlopeLayerBlock;
import dev.ryanhcode.sable.api.block.BlockSubLevelCustomCenterOfMass;
import dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider;
import dev.ryanhcode.sable.companion.math.JOMLConversion;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3dc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CopycatSlopeLayerBlock.class)
public class MixinCopycatSlopeLayerBlock implements BlockSubLevelLiftProvider, BlockSubLevelCustomCenterOfMass {
    @Shadow
    @Final
    public static DirectionProperty FACING;

    @Override
    public @NotNull Direction sable$getNormal(BlockState blockState) {
        return blockState.getValue(FACING).getOpposite();
    }

    @Override
    public Vector3dc getCenterOfMass(final BlockGetter blockGetter, final BlockState state) {
        return JOMLConversion.HALF;
    }
}