// Nerocraft
package org.bukkit.entity;

/**
 * Represents a Minion.
 */
public interface Minion extends Monster {
    /**
     * Sets this Minion's Owner UUID.
     *
     * @param uuid UUID of Owner
     */
    public void setOwnerUUID(String uuid);

    /**
     * Gets this Minion's Owner UUID.
     *
     * @return UUID of Owner
     */
    public String getOwnerUUID();

    /**
     * Sets this Minion's lifetime in ticks, default is set to 3600
     *
     * @param lifetime time in ticks
     */
    public void setLifeTime(int lifetime);
}
