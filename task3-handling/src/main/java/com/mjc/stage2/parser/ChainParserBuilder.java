package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
        // empty
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser parser = null;
        if (!parsers.isEmpty()) {
            parser = parsers.get(0);
            for (int i = 1; i < parsers.size(); i++) {
                parsers.get(i - 1).setNextParser(parsers.get(i));
            }
        }
        return parser;
    }
}