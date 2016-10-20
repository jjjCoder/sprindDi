package ru.sbt.patterns_2lesson.converter;

import java.util.HashMap;
import java.util.Map;

public class ConverterImpl implements Converter {
    private Map<Class, ConverterTo> converters=new HashMap<>();
    @Override
    public <T> T convert(Object valueFrom, Class<T> resultClass) {
        ConverterTo<T> converterTo=converters.get(resultClass);
        return converterTo.convert(valueFrom);
    }

    @Override
    public <T> void addConverterTo(Class<T> resultClass, ConverterTo<T> converterTo) {
        converters.put(resultClass, converterTo);
    }

    @Override
    public <T> void removeConverterTo(Class<T> resultClass) {
        converters.remove(resultClass);
    }
}
