package ru.sbt.patterns_2lesson.converter;

public interface Converter {
//    Integer, Long, Float, Double, BigDecimal
    <T> T convert(Object valueFrom, Class<T> resultClass);
}
