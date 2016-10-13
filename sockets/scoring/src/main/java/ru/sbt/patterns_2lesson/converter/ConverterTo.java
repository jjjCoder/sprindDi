package ru.sbt.patterns_2lesson.converter;

public interface ConverterTo<T> {
    T convert(Object valueFrom);
}
