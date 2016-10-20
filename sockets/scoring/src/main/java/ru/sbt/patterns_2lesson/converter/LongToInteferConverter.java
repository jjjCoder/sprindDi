package ru.sbt.patterns_2lesson.converter;

public class LongToInteferConverter implements ConverterFrom<Integer> {
    @Override
    public Integer convert(Object valueFrom) {
        return ((Long)valueFrom).intValue();
    }
}
