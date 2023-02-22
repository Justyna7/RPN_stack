# Zadanie Stos i RPN
(English translation below)

| Termin oddania      | Punkty     |
|---------------------|:-----------|
|    13.04.2022 23:00 |   10        |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskane za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

## Zadanie 1: Stos

### Green
Zaimplementuj klasę ``Stack`` implementującą ideę stosów napisów z następującymi metodami publicznymi:
- ``push`` wkłada jeden element na stos
- ``pop`` zdejmuje jeden element ze stosu i oddaje wartość tego elementu; co się ma dziać gdy, ``pop`` próbuje 
    zdjąc element z pustego stosu?
- ``peek`` podobnie jak ``pop`` oddaje wartość elementu na szczycie stosu ale go nie zdejmuje; 
    podobny problem z pustym stosem co w przypadku ``pop``.
Podstawową strukturą danych w implementacji stosu powinna być tablica. Stos nie powinien posiadać ograniczeń rozmiaru.

### Red
Przygotuj testy jednostkowe dla klasy ``Stack``. 

## Zadanie 2: RPN

### Green
Zaimplementuj klasę wyliczającą wyrażenia arytmetyczne zapisane w [Odwrotnej Notacji Polskiej](https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska).
Założenia:
- wyrażenia są ciągami znaków
- program umożliwia wyliczanie wyrażeń złożonych z liczb całkowitych i operacji binarnych takich jak ``+``, ``-`` czy ``*``.
- do implementacji wykorzystaj klasę ``Stack`` z Zadania 1.

### Red
Przygotuj testy jednostkowe dla implementacji RPN.

---

## UWAGA: 
Staj się zastosować zasady [SOLID](https://www.samouczekprogramisty.pl/solid-czyli-dobre-praktyki-w-programowaniu-obiektowym/)
i [Clean Code](https://cleancoders.com/episode/clean-code-episode-1).



# Exercise Stack and RPN
(English translation of Polish requirements above)

| Deadline      | max points     |
|---------------------|:-----------|
|    13.04.2022 23:00 |   10        |

--- 
Missing the deadline by **n** lessons gives penalty:
- points obtained for solving the excercise are divided by **2<sup>n</sup>**.

---

## Exercise 1: Stack

### Green
Implement class ``Stack`` implementing an idea of stacks of strings with the following publicmethods:
- ``push`` puts one element on the stack 
- ``pop`` takes off one element from the stack and returns value of this element; what should happen when ``pop`` tries to take off an element from the empty stack? 
- ``peek`` similarly to ``pop`` returns value of an element at the peek of the stack, but it does not take that element off the stack;
    similar problem with the empty stack as in ``pop``.
Basic structure of data in your stack implementation should be an array. Stack should not be limited by size.

### Red
Prepare unit tests for class ``Stack``. 

## Exercise 2: RPN

### Green
Implement a class calculating arithmetic expressions written in [Reverse Polish Notation](https://en.wikipedia.org/wiki/Reverse_Polish_notation).
Tenets:
- expressions are written in strings
- program allows calculating arithmetic expressions composed of integers and binary operations such as  ``+``, ``-`` or ``*``.
- in your implementation use class ``Stack`` from Exercise 1.

### Red
Prepare unit tests for your implementation of RPN.

---

## NOTE: 
Try to follow principle [SOLID](https://www.samouczekprogramisty.pl/solid-czyli-dobre-praktyki-w-programowaniu-obiektowym/)
and [Clean Code](https://cleancoders.com/episode/clean-code-episode-1).

