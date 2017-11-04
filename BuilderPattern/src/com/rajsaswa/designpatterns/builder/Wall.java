package com.rajsaswa.designpatterns.builder;

/**
 * Represents the wall
 */
public class Wall
{
    private WallBuilder wallBuilder;
    private double wallx;
    private double wally;

    public Wall(WallBuilder wallBuilder)
    {
        this.wallBuilder = wallBuilder;
    }

    public Double getWallVolume()
    {
        return wallBuilder.getBreadth() * wallBuilder.getHeight() * wallBuilder.getLength();
    }

    public void placeWall(double x, double y)
    {
        this.wallx = x;
        this.wally = y;
    }
}
