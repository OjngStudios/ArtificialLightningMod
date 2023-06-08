package io.github.busituteng.artificiallightning.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

import java.util.Map;

import io.github.busituteng.artificiallightning.ElementsArtificialLightningMod;

@ElementsArtificialLightningMod.ModElement.Tag
public class ProcedureLightninggeneratorRedstoneOn extends ElementsArtificialLightningMod.ModElement {
	public ProcedureLightninggeneratorRedstoneOn(ElementsArtificialLightningMod instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LightninggeneratorRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LightninggeneratorRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LightninggeneratorRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LightninggeneratorRedstoneOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) (y + 1), (int) z, false));
	}
}
