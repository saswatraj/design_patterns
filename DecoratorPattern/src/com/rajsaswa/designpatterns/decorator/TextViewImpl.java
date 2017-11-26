package com.rajsaswa.designpatterns.decorator;

public class TextViewImpl implements TextView
{
    private static final int TEXT_SIZE = 10;
    private String text;

    public TextViewImpl()
    {
        text = new String();
    }

    @Override
    public void addText(String text)
    {
        this.text += text;
    }

    @Override
    public String getText()
    {
        return text;
    }

}
