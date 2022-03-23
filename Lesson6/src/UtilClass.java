package com.js.generics.homework.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> boolean isBlank(List<E> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> E getLastElem(List<E> list) throws IllegalArgumentException {
        if (list == null) {
            throw new IllegalArgumentException("Ошибка: список пуст");
        }

        return list.get(list.size() - 1);
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> Object findElem(List<E> list, Object elem) throws IllegalArgumentException {
        Object sending = "";
        boolean success = false;

        try {
            success = list.contains(elem);
            if (success) {
                sending = elem;
            }
            else {
                sending = null;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: список пуст или элемент равен null");
        }

        return sending;
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static<E> List union(List<E> list1, List<E> list2) {
        if (list1 == null) {
            throw new IllegalArgumentException("Ошибка: список 1 пуст");
        }
        if (list2 == null) {
            throw new IllegalArgumentException("Ошибка: список 2 пуст");
        }
        ArrayList<E> result = new ArrayList<E>(
                list1.size() + list2.size());
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    /**
     * Удаляет все элементы из списка list1, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static<E> List removeAll(List<E> list1, List<E> list2) {
        if (list1 == null) {
            throw new IllegalArgumentException("Ошибка: список 1 пуст");
        }
        if (list2 == null) {
            throw new IllegalArgumentException("Ошибка: список 2 пуст");
        }
        ArrayList<E> result = new ArrayList<E>(
                list1.size());
        result.addAll(list1);
        result.removeAll(list2);
        return result;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static double sum(List<? extends Number> list1, List<? extends Number> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Ошибка: список пуст");
        }
        double result = 0;
        list1.stream();
        for(Number number: list1) {
            result += number.doubleValue();
        }
        for (Number number: list2) {
            result += number.doubleValue();
        }
        return result;
    }
}

