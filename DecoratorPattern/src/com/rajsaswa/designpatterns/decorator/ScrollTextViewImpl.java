package com.rajsaswa.designpatterns.decorator;

import java.util.List;

public class ScrollTextViewImpl implements ScrollTextView
{
    private static final int TEXT_SIZE = 10;
    private TextView textView;
    private List<String> textList;
    private int currentIndex;

    public ScrollTextViewImpl(TextView textView)
    {
        this.textView = textView;
        addText(textView.getText());
    }

    @Override
    public String getScrollText(int start, int end)
    {
        StringBuilder text = new StringBuilder();
        for (String s : textList.subList(start, end)) {
            text.append(s);
        }
        return text.toString();
    }

    @Override
    public void addText(String text)
    {
        textView.addText(text);
        for (int i = 0; i < text.length() / getCurrentLineCapacity(); i++) {
            String textForCurrentLine = text.substring(0, TEXT_SIZE);
            String remainingText = text.substring(TEXT_SIZE);
            textList.add(textForCurrentLine);
            text = remainingText;
        }
    }

    @Override
    public String getText()
    {
        return textView.getText();
    }

    private int getCurrentLineCapacity()
    {
        int curLength = textList.get(currentIndex) != null ? textList.get(currentIndex).length() : 0;
        if (curLength == 0) {
            return TEXT_SIZE;
        }
        return TEXT_SIZE - curLength;
    }
}
