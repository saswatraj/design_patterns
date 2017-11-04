package com.rajsaswa.designpatterns.builder;

/**
 * This is the builder to build a wall
 */
public class WallBuilder
{
    private Double length;
    private Double breadth;
    private Double height;
    private Double cement;
    private Double paint;
    private Double plasterOfParis;

    public Double getLength()
    {
        return length;
    }

    public void setLength(Double length)
    {
        this.length = length;
    }

    public Double getBreadth()
    {
        return breadth;
    }

    public void setBreadth(Double breadth)
    {
        this.breadth = breadth;
    }

    public Double getHeight()
    {
        return height;
    }

    public void setHeight(Double height)
    {
        this.height = height;
    }

    public Double getCement()
    {
        return cement;
    }

    public void setCement(Double cement)
    {
        this.cement = cement;
    }

    public Double getPaint()
    {
        return paint;
    }

    public void setPaint(Double paint)
    {
        this.paint = paint;
    }

    public Double getPlasterOfParis()
    {
        return plasterOfParis;
    }

    public void setPlasterOfParis(Double plasterOfParis)
    {
        this.plasterOfParis = plasterOfParis;
    }

    public Wall build()
    {
        if (length == null || breadth == null || height == null || cement == null) {
            throw new RuntimeException("Wall cannot be built due to missing dimensions or ingredients");
        }
        if (length * breadth * height / 3 > cement) {
            throw new RuntimeException("Need 1/3rd cement of the total wall volume to build the wall");
        }
        return new Wall(this);
    }
}
