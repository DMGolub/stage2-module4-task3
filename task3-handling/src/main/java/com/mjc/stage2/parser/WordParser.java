package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
	@Override
	public void parse(final AbstractTextComponent abstractTextComponent, final String string) {
		AbstractTextComponent word = new TextComponent(TextComponentType.WORD);
		for (char c : string.toCharArray()) {
			word.add(new SymbolLeaf(TextComponentType.SYMBOL, c));
		}
		abstractTextComponent.add(word);
	}
}