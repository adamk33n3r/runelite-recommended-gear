package com.adamk33n3r.runelite.recommendedequipment;

import net.runelite.client.util.ImageUtil;

import javax.swing.*;
import java.awt.image.BufferedImage;

public final class Icons {
    public static final BufferedImage ICON_IMG = ImageUtil.loadImageResource(Icons.class, "icon.png");
    public static final ImageIcon CHEVRON_UP = new ImageIcon(ImageUtil.loadImageResource(Icons.class, "chevron-up.png"));
    public static final ImageIcon CHEVRON_DOWN = new ImageIcon(ImageUtil.loadImageResource(Icons.class, "chevron-down.png"));
    public static final ImageIcon CHEVRON_LEFT = new ImageIcon(ImageUtil.loadImageResource(Icons.class, "chevron-left.png"));
    public static final ImageIcon FUNNEL = new ImageIcon(ImageUtil.loadImageResource(Icons.class, "funnel.png"));
    public static final ImageIcon ICON = new ImageIcon(ICON_IMG);
    public static final ImageIcon LINK = new ImageIcon(ImageUtil.resizeImage(ImageUtil.loadImageResource(Icons.class, "link.png"), 16, 16));
    public static final ImageIcon MAGNIFYING_GLASS = new ImageIcon(ImageUtil.loadImageResource(Icons.class, "magnifying-glass.png"));

    private Icons() {
        throw new AssertionError();
    }
}
