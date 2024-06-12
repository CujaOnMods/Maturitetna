package net.mcreator.mddo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.mddo.network.EpicraftModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GOldenChorusConsumeChergeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (EpicraftModVariables.MapVariables.get(world).GoldenChorusCharges >= 1) {
				EpicraftModVariables.MapVariables.get(world).GoldenChorusCharges = EpicraftModVariables.MapVariables.get(world).GoldenChorusCharges - 1;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
				while (true) {
					EpicraftModVariables.MapVariables.get(world).Goldenx = entity.getX() + Mth.nextInt(RandomSource.create(), -16, 16);
					EpicraftModVariables.MapVariables.get(world).syncData(world);
					EpicraftModVariables.MapVariables.get(world).GoldenY = entity.getY() + Mth.nextInt(RandomSource.create(), -16, 16);
					EpicraftModVariables.MapVariables.get(world).syncData(world);
					EpicraftModVariables.MapVariables.get(world).GOldenZ = entity.getZ() + Mth.nextInt(RandomSource.create(), -16, 16);
					EpicraftModVariables.MapVariables.get(world).syncData(world);
					if (world.isEmptyBlock(BlockPos.containing(EpicraftModVariables.MapVariables.get(world).Goldenx, EpicraftModVariables.MapVariables.get(world).GoldenY, EpicraftModVariables.MapVariables.get(world).GOldenZ))) {
						if (world.isEmptyBlock(BlockPos.containing(EpicraftModVariables.MapVariables.get(world).Goldenx, EpicraftModVariables.MapVariables.get(world).GoldenY + 1, EpicraftModVariables.MapVariables.get(world).GOldenZ))) {
							{
								Entity _ent = entity;
								_ent.teleportTo(EpicraftModVariables.MapVariables.get(world).Goldenx, EpicraftModVariables.MapVariables.get(world).GoldenY, EpicraftModVariables.MapVariables.get(world).GOldenZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(EpicraftModVariables.MapVariables.get(world).Goldenx, EpicraftModVariables.MapVariables.get(world).GoldenY, EpicraftModVariables.MapVariables.get(world).GOldenZ, _ent.getYRot(),
											_ent.getXRot());
							}
							break;
						}
					}
				}
			}
		}
	}
}
