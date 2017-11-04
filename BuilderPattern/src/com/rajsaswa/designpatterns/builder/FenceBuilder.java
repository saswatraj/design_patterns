package com.rajsaswa.designpatterns.builder;

/**
 * Uses wall to build a fence
 */
public class FenceBuilder
{
    public static void main(String args[])
    {
        WallBuilder wallBuilder = new WallBuilder();
        wallBuilder.setLength(10D);
        wallBuilder.setBreadth(2D);
        wallBuilder.setHeight(7D);
        wallBuilder.setCement(3D);
        wallBuilder.setPaint(2D);
        wallBuilder.setPlasterOfParis(1D);
        Wall wall = wallBuilder.build();
        wall.placeWall(18.3, 19.678);
        System.out.print("Wall placed as a fence");
    }
}
