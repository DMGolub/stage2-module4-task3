package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = ".*\\s+.*";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(final AbstractTextComponent abstractTextComponent, final String string) {
        if (string.matches(LEXEME_REGEX)) {
            String[] words = string.split(TextComponentType.SENTENCE.getDelimiter());
            for (String word: words) {
                this.nextParser.parse(abstractTextComponent, word);
            }
        } else if (string.matches(WORD_REGEX)) {
            this.nextParser.parse(abstractTextComponent, string);
        }
    }
}