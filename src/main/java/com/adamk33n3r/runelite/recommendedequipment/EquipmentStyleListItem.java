package com.adamk33n3r.runelite.recommendedequipment;

public class EquipmentStyleListItem extends ClickableListItem {
    public EquipmentStyleListItem(Activity activity, ActivityEquipmentStyle style, RecommendedEquipmentPlugin plugin, ActivityManager activityManager) {
        super(style.getName(),
            null,
            style.isFavorite(),
            () -> {
                plugin.setActivityEquipmentStyle(style);
                if (plugin.getBankTab().isActive()) {
                    plugin.getBankTab().resetTab();
                }
            },
            () -> {
                style.setFavorite(!style.isFavorite());
                activityManager.saveFavorite(activity);
            }
        );
    }
}
