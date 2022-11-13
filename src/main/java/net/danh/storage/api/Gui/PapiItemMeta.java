package net.danh.storage.api.Gui;

import java.util.List;

/**
 * Class represent ItemMeta but contains Papi
 */
@SuppressWarnings("unused")
public interface PapiItemMeta {
    /**
     * Get the display name of this Item Meta
     * @return Name as string
     */
    String getName();

    /**
     * Set the display name of this Item Meta
     * @param name Name to set
     */
    void setName(String name);

    /**
     * Name of this icon contains papi or not
     * @return True or false
     */
    boolean nameHasPapi();

    /**
     * Get the lores of this Item Meta
     * @return Lore as list string
     */
    List<String> getLore();

    /**
     * Set the lores of this Item Meta
     * @param name List string
     */
    void setLore(List<String> name);

    /**
     * Lore of this icon contains papi or not
     * @return True or false
     */
    boolean loreHasPapi();

    /**
     * Enchant this icon by the String represent enchantment and level
     * Syntax: "Enchantment" (default level 1) or "Enchantment;Level"
     * @param enchantment String enchantment and level to enchant
     */
    void enchant(String enchantment);

    /**
     * Enchant this icon by a Map of String represent enchantment and its level
     * Syntax: like enchant
     * @param enchantments List string of enchantment and level
     */
    void enchant(List<String> enchantments);


    /**
     * Remove enchantment from this icon
     * @param enchantment String enchantment name to remove
     */
    void removeEnchant(String enchantment);

    /**
     * Get the level of specific enchantment in this icon
     * @param enchantment String enchantment to look for
     * @return Level as integer
     */
    int getLevel(String enchantment);

    /**
     * Check if this icon contains this enchantment or not
     * @param enchantment String enchantment to check
     * @return True or false
     */
    boolean containsEnchant(String enchantment);

    /**
     * Enchants of this icon contains papi or not
     * @return True or false
     */
    boolean enchantHasPapi();

    /**
     * Get List String represent enchantments of this icon
     * @return List String of enchantments and its level
     */
    List<String> getEnchants();

    /**
     * Get item flags of item that icon represent
     * @return Item flags as string
     */
    List<String> getItemFlags();

    /**
     * Set the item flags of item that icon represents
     * Syntax: "Item_Flag"
     * @param itemFlags Item flags to set
     */
    void setItemFlags(List<String> itemFlags);

    /**
     * Item flags of this icon contains papi or not
     * @return True or false
     */
    boolean itemFlagsHasPapi();

    /**
     * Get unbreakable status of item that icon represent
     * @return Unbreakable status as string
     */
    String getUnbreakable();

    /**
     * Set the unbreakable status of item that icon represents
     * Syntax: "True" or "False"
     * @param unbreakable Unbreakable status to set
     */
    void setUnbreakable(String unbreakable);

    /**
     * Unbreakable of this icon contains papi or not
     * @return True or false
     */
    boolean unbreakableHasPapi();

    /**
     * Check if this PapiItemMeta instance of PotionMeta or not
     * @return True or false
     */
    boolean isPotionMeta();

    /**
     * Get potion color of item that icon represents
     * Only available if this class instance of PotionMeta
     * @return Potion color as string
     */
    String getPotion_Color();

    /**
     * Set the potion color of item that icon represents
     * Only available if this class instance of PotionMeta
     * Syntax: "Potion_Color"
     * @param potion_color Potion color to set
     */
    void setPotion_Color(String potion_color);

    /**
     * Potion color of this icon contains papi or not
     * Always false if this class don't instance of PotionMeta
     * @return True or false
     */
    boolean potionColorHasPapi();

    /**
     * Get potion effects of item that icon represents
     * Only available if this class instance of PotionMeta
     * @return Potion effects as string
     */
    String getPotion_Effects();

    /**
     * Set the potion effects of item that icon represents
     * Only available if this class instance of PotionMeta
     * Syntax: "PotionEffectType" or "PotionEffectType;Duration"
     * or "PotionEffectType;Duration;Level"
     * @param potion_effects Potion color to set
     */
    void setPotion_Effects(String potion_effects);

    /**
     * Potion effects of this icon contains papi or not
     * Always false if this class don't instance of PotionMeta
     * @return True or false
     */
    boolean potionEffectsHasPapi();

    /**
     * Check if this PapiItemMeta instance of BannerMeta or not
     * @return True or false
     */
    boolean isBannerMeta();

    /**
     * Get banner meta of item that icon represents
     * Only available if this class instance of BannerMeta
     * @return Banner Meta as string
     */
    String getBannerMeta();

    /**
     * Set the banner meta of item that icon represents
     * Only available if this class instance of BannerMeta
     * Syntax: "Dye-color;Pattern-type"
     * @param bannerMeta Banner Meta to set
     */
    void setBannerMeta(String bannerMeta);

    /**
     * Banner meta of this icon contains papi or not
     * Always false if this class don't instance of BannerMeta
     * @return True or false
     */
    boolean bannerMetaHasPapi();
}
