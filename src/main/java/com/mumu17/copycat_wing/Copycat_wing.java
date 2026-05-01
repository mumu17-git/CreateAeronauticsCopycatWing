package com.mumu17.copycat_wing;

import com.copycatsplus.copycats.content.copycat.beam.CopycatBeamBlock;
import com.copycatsplus.copycats.content.copycat.slice.CopycatSliceBlock;
import com.copycatsplus.copycats.content.copycat.stacked_half_layer.CopycatStackedHalfLayerBlock;
import com.copycatsplus.copycats.content.copycat.vertical_half_layer.CopycatVerticalHalfLayerBlock;
import com.copycatsplus.copycats.content.copycat.vertical_slice.CopycatVerticalSliceBlock;
import com.copycatsplus.copycats.content.copycat.vertical_step.CopycatVerticalStepBlock;
import com.mojang.logging.LogUtils;
import com.simibubi.create.content.decoration.copycat.CopycatPanelBlock;
import com.simibubi.create.content.decoration.copycat.CopycatStepBlock;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Copycat_wing.MODID)
public class Copycat_wing {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "copycat_wing";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Copycat_wing() {}

    public static Direction copycat_wing$getNormal(BlockState blockState) {
        return Direction.get(Direction.AxisDirection.POSITIVE, blockState.getValue(BlockStateProperties.AXIS)).getOpposite();
    }
}
