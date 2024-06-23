package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Getter
@Setter
public class ExampleClass {
    private String stringValue;
    private int intValue;
    private long longValue;
    private double doubleValue;
    private float floatValue;
    private boolean booleanValue;
    private char charValue;
    private byte byteValue;
    private short shortValue;
    private Integer integerWrapper;
    private Double doubleWrapper;
    private BigDecimal bigDecimalValue;
    private LocalDateTime localDateTimeValue;
    private List<String> stringList;
    private Set<Integer> integerSet;
    private NestedClass nestedObject;

    @Override
    public String toString() {
        return "ExampleClass{" +
                "stringValue='" + stringValue + '\'' +
                ", intValue=" + intValue +
                ", longValue=" + longValue +
                ", doubleValue=" + doubleValue +
                ", floatValue=" + floatValue +
                ", booleanValue=" + booleanValue +
                ", charValue=" + charValue +
                ", byteValue=" + byteValue +
                ", shortValue=" + shortValue +
                ", integerWrapper=" + integerWrapper +
                ", doubleWrapper=" + doubleWrapper +
                ", bigDecimalValue=" + bigDecimalValue +
                ", localDateTimeValue=" + localDateTimeValue +
                ", stringList=" + stringList +
                ", integerSet=" + integerSet +
                ", nestedObject=" + nestedObject +
                '}';
    }
}

@Data
class NestedClass {
    private String nestedStringValue;
    private int nestedIntValue;

    @Override
    public String toString() {
        return "NestedClass{" +
                "nestedStringValue='" + nestedStringValue + '\'' +
                ", nestedIntValue=" + nestedIntValue +
                '}';
    }
}
