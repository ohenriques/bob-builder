package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObjectBuilderTest {
    @Test
    public void testBuildExampleClass() {
        ExampleClass exampleObject = ObjectBuilder.build(ExampleClass.class);

        assertNotNull(exampleObject);

        // Verifica se os campos primitivos e wrappers foram inicializados
        assertNotNull(exampleObject.getStringValue());
        assertNotNull(exampleObject.getIntegerWrapper());
        assertNotNull(exampleObject.getDoubleWrapper());
        assertNotNull(exampleObject.getBigDecimalValue());
        assertNotNull(exampleObject.getLocalDateTimeValue());

        // Verifica se os campos primitivos têm valores válidos
        assertTrue(exampleObject.getIntValue() != 0);
        assertTrue(exampleObject.getLongValue() != 0);
        assertTrue(exampleObject.getDoubleValue() != 0.0);
        assertTrue(exampleObject.getFloatValue() != 0.0f);
        assertNotNull(exampleObject.isBooleanValue());
        assertTrue(exampleObject.getCharValue() != '\u0000');
        assertTrue(exampleObject.getByteValue() != 0);
        assertTrue(exampleObject.getShortValue() != 0);

        // Verifica se as coleções foram inicializadas
        assertNotNull(exampleObject.getStringList());
        assertNotNull(exampleObject.getIntegerSet());

        // Verifica se o objeto aninhado foi inicializado
        assertNotNull(exampleObject.getNestedObject());
        assertNotNull(exampleObject.getNestedObject().getNestedStringValue());
        assertTrue(exampleObject.getNestedObject().getNestedIntValue() != 0);
    }
}