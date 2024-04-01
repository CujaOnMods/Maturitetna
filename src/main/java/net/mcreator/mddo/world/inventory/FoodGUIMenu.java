
package net.mcreator.mddo.world.inventory;

import net.mcreator.mddo.MddoMod;

@Mod.EventBusSubscriber
public class FoodGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public FoodGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(MddoModMenus.FOOD_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(11);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 17, 20) {
			private final int slot = 0;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(0, 0, 0);
			}
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 35, 20) {
			private final int slot = 1;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(1, 0, 0);
			}
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 53, 20) {
			private final int slot = 2;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(2, 0, 0);
			}
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 17, 38) {
			private final int slot = 3;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(3, 0, 0);
			}
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 35, 38) {
			private final int slot = 4;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(4, 0, 0);
			}
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 53, 38) {
			private final int slot = 5;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(5, 0, 0);
			}
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 17, 56) {
			private final int slot = 6;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(6, 0, 0);
			}
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 35, 56) {
			private final int slot = 7;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(7, 0, 0);
			}
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 53, 56) {
			private final int slot = 8;

			@Override
			public void setChanged() {
				super.setChanged();
				slotChanged(8, 0, 0);
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 106, 37) {
			private final int slot = 10;

			@Override
			public void onTake(Player entity, ItemStack stack) {
				super.onTake(entity, stack);
				slotChanged(10, 1, 0);
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 10) {
				if (!this.moveItemStackTo(itemstack1, 10, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 10, false)) {
				if (index < 10 + 27) {
					if (!this.moveItemStackTo(itemstack1, 10 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 10, 10 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override /* failed to load code for net.minecraft.world.inventory.AbstractContainerMenu */
	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	private void slotChanged(int slotid, int ctype, int meta) {
		if (this.world != null && this.world.isClientSide()) {
			MddoMod.PACKET_HANDLER.sendToServer(new FoodGUISlotMessage(slotid, x, y, z, ctype, meta));
			FoodGUISlotMessage.handleSlotAction(entity, slotid, ctype, meta, x, y, z);
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Player entity = event.player;
		if (event.phase == TickEvent.Phase.END && entity.containerMenu instanceof FoodGUIMenu) {
			Level world = entity.level();
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			FoodGuiOpenProcedure.execute();
		}
	}
}