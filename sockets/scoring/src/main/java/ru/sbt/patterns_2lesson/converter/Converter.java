package ru.sbt.patterns_2lesson.converter;

public interface Converter {
//    Integer, Long, Float, Double, BigDecimal
    <T> T convert(Object valueFrom, Class<T> resultClass);
    <T> void addConverterTo(Class<T> resultClass, ConverterTo<T> converterTo);
    <T> void removeConverterTo(Class<T> resultClass);
}
