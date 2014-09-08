package org.bukkit.entity;

/**
 * Represents an arrow.
 */
public interface Arrow extends Projectile {

    /**
     * Gets the knockback strength for an arrow, which is the
     * {@link org.bukkit.enchantments.Enchantment#KNOCKBACK KnockBack} level
     * of the bow that shot it.
     *
     * @return the knockback strength value
     */
    public int getKnockbackStrength();

    /**
     * Sets the knockback strength for an arrow.
     *
     * @param knockbackStrength the knockback strength value
     */
    public void setKnockbackStrength(int knockbackStrength);

    /**
     * Gets whether this arrow is critical.
     * <p>
     * Critical arrows have increased damage and cause particle effects.
     * <p>
     * Critical arrows generally occur when a player fully draws a bow before
     * firing.
     *
     * @return true if it is critical
     */
    public boolean isCritical();

    /**
     * Sets whether or not this arrow should be critical.
     *
     * @param critical whether or not it should be critical
     */
    public void setCritical(boolean critical);

    // Nerocraft - Added setter and getter for arrow damage into Bukkit API, including documentation
    /**
     * Gets the amount of damage this arrow will deal when it hits a living
     * entity.
     *
     * @return The amount of damage this arrow will deal
     */
    public double getDamage();

    /**
     * Sets the amount of damage this arrow will deal when it hits a living
     * entity.
     *
     * @param damage The amount of damage this arrow will deal
     */
    public void setDamage(double damage);

    // Nerocraft - Added setter and getter for pickup mode of arrow into Bukkit API, including documentation
    /**
     * Gets the pickup mode of this arrow
     *
     * @return
     * <ul>
     * <li>0 = Cannot be picked up by players
     * <li>1 = Can be picked up by players
     * <li>2 = Can only be picked up by players in creative
     * </ul>
     */
    public int getPickup();

    /**
     * Sets the pickup mode of this arrow
     *
     * @param mode
     * <ul>
     * <li>0 = Cannot be picked up by players
     * <li>1 = Can be picked up by players
     * <li>2 = Can only be picked up by players in creative
     * </ul>
     */
    public void setPickup(int mode);
}
