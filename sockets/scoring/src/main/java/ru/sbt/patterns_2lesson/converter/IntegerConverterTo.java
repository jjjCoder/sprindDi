package ru.sbt.patterns_2lesson.converter;

import java.util.HashMap;
import java.util.Map;

public class IntegerConverterTo implements ConverterTo<Integer> {
    private Map<Class, ConverterFrom> converters=new HashMap<>();
    @Override
    public Integer convert(Object valueFrom) {
        ConverterFrom converterFrom=converters.get(valueFrom.getClass());
        return (Integer) converterFrom.convert(valueFrom);
    }
}
