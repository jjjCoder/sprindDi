package ru.sbt.patterns_2lesson.converter;

public interface ConverterFrom<T> {
    <T> T convert(Object valueFrom);
}
