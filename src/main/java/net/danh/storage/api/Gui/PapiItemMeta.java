package net.danh.storage.api.Gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

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
     * Get the lore of this Item Meta
     * @return Lore as list string
     */
    List<String> getLore();

    /**
     * Set the lore of this Item Meta
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
     * @return Level as string
     */
    String getLevel(String enchantment);

    /**
     * Check if this icon contains this enchantment or not
     * @param enchantment String enchantment to check
     * @return True or false
     */
    boolean containsEnchant(String enchantment);

    /**
     * Enchants of this icon contains papi or not
     * @param enchantment String enchantment to check
     * @return True or false
     */
    boolean enchantHasPapi(String enchantment);

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
     * Get potion meta of item that icon represents
     * Only available if this class instance of PotionMeta
     * @return Potion meta as list string
     */
    List<String> getPotionMeta();

    /**
     * Potion color of this icon contains papi or not
     * Always false if this class don't instance of PotionMeta
     * @return True or false
     */
    boolean potionMetaHasPapi();

    /**
     * Add single potion effect to item's potion meta
     * Only available if this class instance of PotionMeta
     * Syntax: "<PotionEffectType>;<duration>;<amplifier>"
     * @param potionEffect Potion effect to add
     */
    void addPotionEffect(String potionEffect);

    /**
     * Add the potion effects to item's potion meta
     * Only available if this class instance of PotionMeta
     * Syntax: " - <PotionEffectType_1>;<duration_1>;<amplifier_1>"
     *         " - <PotionEffectType_2>;<duration_2>;<amplifier_2>"
     * @param potionEffects Potion effects to add
     */
    void addPotionEffects(List<String> potionEffects);

    /**
     * Check if this PapiItemMeta instance of BannerMeta or not
     * @return True or false
     */
    boolean isBannerMeta();

    /**
     * Get banner meta of item that icon represents
     * Only available if this class instance of BannerMeta
     * @return Banner Meta as list string
     */
    List<String> getBannerMeta();

    /**
     * Banner meta of this icon contains papi or not
     * Always false if this class don't instance of BannerMeta
     * @return True or false
     */
    boolean bannerMetaHasPapi();

    /**
     * Add singer banner pattern to item's banner meta
     * Only available if this class instance of BannerMeta
     * Syntax: "<Dye_color>;<pattern_type>"
     * @param bannerPattern Banner Pattern to add
     */
    void addBannerPattern(String bannerPattern);

    /**
     * Add the banner patterns to item's banner meta
     * Only available if this class instance of BannerMeta
     * Syntax: " - <Dye_color_1>;<pattern_type_1>"
     *         " - <Dye_color_2>;<pattern_type_2>"
     * @param bannerPatterns Banner Patterns to add
     */
    void addBannerPatterns(List<String> bannerPatterns);

    /**
     * Parse this papi item meta to bukkit item meta
     * @param player Player to parse
     * @return Bukkit Item Meta
     */
    ItemMeta parseItemMeta(Player player);
}
