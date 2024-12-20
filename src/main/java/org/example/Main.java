package org.example;

import java.util.LinkedList;

//LinkedList — це ще одна важлива колекція в Java, яка реалізує інтерфейс List.
// На відміну від ArrayList, який використовує масив для зберігання елементів,
// LinkedList використовує структуру даних, звану зв'язаний список. Кожен елемент у цьому списку містить посилання на наступний (і попередній) елемент.
// Це дозволяє ефективно додавати та видаляти елементи в середині списку, але може бути менш ефективним при доступі до елементів за індексом.
//
//Основні характеристики LinkedList:
//Зв'язана структура: Кожен елемент (вузол) містить самі дані та посилання на наступний (і попередній) елемент.
//Це дозволяє швидко додавати чи видаляти елементи на початку чи в середині списку.
//Індексація: Для доступу до елементів за індексом може знадобитися проходження списку від початку або кінця,
//що робить доступ до елементів за індексом повільнішим порівняно з ArrayList.
//Динамічний розмір: Як і ArrayList, LinkedList може динамічно змінювати свій розмір під час виконання програми.


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        System.out.println(500_000);
        long startTime1 = System.nanoTime();
        int value1 = linkedList.get(500_000);
        long endTime1 = System.nanoTime();

        System.out.println("Eлемент " + value1);
        System.out.println("Час доступу (наносекунди): " + (endTime1 - startTime1));


        System.out.println("------------------------------");
        //---------------------------------------------------

        LinkedList<String> list = new LinkedList<>();

        // Додавання елементів
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Виведення елементів
        System.out.println("Список: " + list);

        // Додавання елемента в початок списку
        list.addFirst("Pineapple");
        System.out.println("Список після додавання на початок: " + list);

        // Додавання елемента в кінець списку
        list.addLast("Mango");
        System.out.println("Список після додавання в кінець: " + list);

        // Видалення елемента з початку списку
        list.removeFirst();
        System.out.println("Список після видалення з початку: " + list);

        // Видалення елемента з кінця списку
        list.removeLast();
        System.out.println("Список після видалення з кінця: " + list);

        // Отримання елемента за індексом
        System.out.println("Елемент на 1-му місці: " + list.get(1));

        // Розмір списку
        System.out.println("Розмір списку: " + list.size());

        // Очистка списку
        list.clear();
        System.out.println("Список після очищення: " + list);




        }
    }
