
package appeng.client.gui.widgets;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public abstract class CustomSlotWidget extends AbstractGui implements ITooltip {
    private final int x;
    private final int y;
    private final int id;

    public CustomSlotWidget(final int id, final int x, final int y) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public boolean canClick(final PlayerEntity player) {
        return true;
    }

    public void slotClicked(final ItemStack clickStack, final int mouseButton) {
    }

    public abstract void drawContent(final Minecraft mc, final int mouseX, final int mouseY, final float partialTicks);

    public void drawBackground(int guileft, int guitop, int currentZIndex) {
    }

    @Override
    public String getTooltipMessage() {
        return null;
    }

    @Override
    public int getTooltipAreaX() {
        return this.x;
    }

    @Override
    public int getTooltipAreaY() {
        return this.y;
    }

    @Override
    public int getTooltipAreaWidth() {
        return 16;
    }

    @Override
    public int getTooltipAreaHeight() {
        return 16;
    }

    @Override
    public boolean isTooltipAreaVisible() {
        return false;
    }

    public boolean isSlotEnabled() {
        return true;
    }

}
