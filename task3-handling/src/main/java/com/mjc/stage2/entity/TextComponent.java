package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();

    public TextComponent(final TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringJoiner result = new StringJoiner(componentType.getDelimiter());
        for (AbstractTextComponent component : componentList) {
            result.add(component.operation());
        }
        return result.toString();
    }

    @Override
    public void add(final AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(final AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.size();
    }
}