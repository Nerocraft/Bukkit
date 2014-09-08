package org.bukkit.entity;

import org.bukkit.util.Vector;

/**
 * Represents a Fireball.
 */
public interface Fireball extends Projectile, Explosive {

    // Nerocraft - Implemented API for enabling/disabling Guided Fireballs, including documentation
    /**
     * Sets whether or not this fireball should be cursor-guided. False by
     * default.
     *
     * @param isGuided whether or not this fireball is guided
     */
    public void setGuided(boolean isGuided);

    /**
     * Gets whether or not this fireball is cursor-guided.
     *
     * @return whether or not this fireball is guided
     */
    public boolean getGuided();

    /**
     * Fireballs fly straight and do not take setVelocity(...) well.
     *
     * @param direction the direction this fireball is flying toward
     */
    public void setDirection(Vector direction);

    /**
     * Retrieve the direction this fireball is heading toward
     *
     * @return the direction
     */
    public Vector getDirection();
}
