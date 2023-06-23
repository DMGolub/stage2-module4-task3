package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(final TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(final AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Can not add texComponent to leaf");
    }

    @Override
    public void remove(final AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Can not remove texComponent from leaf");
    }

    @Override
    public int getSize() {
        return 1;
    }
}