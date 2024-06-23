package org.example;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class ObjectBuilder {

    public static <T> T build(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            Field[] fields = clazz.getDeclaredFields();
            Random random = new Random();

            for (Field field : fields) {
                field.setAccessible(true);

                if (field.getType().equals(String.class)) {
                    field.set(instance, "String" + random.nextInt());
                } else if (field.getType().equals(int.class)) {
                    field.set(instance, random.nextInt());
                } else if (field.getType().equals(long.class)) {
                    field.set(instance, random.nextLong());
                } else if (field.getType().equals(double.class)) {
                    field.set(instance, random.nextDouble());
                } else if (field.getType().equals(float.class)) {
                    field.set(instance, random.nextFloat());
                } else if (field.getType().equals(boolean.class)) {
                    field.set(instance, random.nextBoolean());
                } else if (field.getType().equals(char.class)) {
                    field.set(instance, (char) random.nextInt(255));
                } else if (field.getType().equals(byte.class)) {
                    field.set(instance, (byte) random.nextInt(255));
                } else if (field.getType().equals(short.class)) {
                    field.set(instance, (short) random.nextInt(255));
                } else if (field.getType().equals(Integer.class)) {
                    field.set(instance, random.nextInt());
                } else if (field.getType().equals(Double.class)) {
                    field.set(instance, random.nextDouble());
                } else if (field.getType().equals(BigDecimal.class)) {
                    field.set(instance, BigDecimal.valueOf(random.nextDouble()));
                } else if (field.getType().equals(LocalDateTime.class)) {
                    field.set(instance, LocalDateTime.now().minusDays(random.nextInt(365)));
                } else if (List.class.isAssignableFrom(field.getType())) {
                    List<Object> list = new ArrayList<>();
                    // Adicione alguns elementos aleatórios à lista
                    field.set(instance, list);
                } else if (Set.class.isAssignableFrom(field.getType())) {
                    Set<Object> set = new HashSet<>();
                    // Adicione alguns elementos aleatórios ao conjunto
                    field.set(instance, set);
                } else if (!field.getType().isPrimitive() && !field.getType().equals(String.class)) {
                    Object nestedInstance = build(field.getType());
                    field.set(instance, nestedInstance);
                }

                // todo: mais tipos conforme necesário
                // todo: numeros gerados apenas positivos
            }
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Não foi possivel criar a instância da classe: " + clazz.getName(), e);
        }
    }
}
