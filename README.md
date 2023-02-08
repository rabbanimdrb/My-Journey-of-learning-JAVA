<!-- ### [Connect with me 💬]  -->
![visitors](https://visitor-badge.laobi.icu/badge?page_id=rabbanimdrb.My-Journey-of-learning-JAVA)
# My-Journey-of-learning-JAVA
This repo will contain all the resources, notes &amp; codes of JAVA Language

**OOPs (OBJECT ORIENTED PROGRAMMING)** :
Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below : 

**Class** is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated.

**Object** is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item. An object can operate on both data members and member functions. 


**[Collection Frameworks](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)**

**List**
<li>List interface implements collection interface </li>
<li>List is an ordered collection it maintains the insertion order, which means upon displaying the list content it will display the elements in the same order in which  they got inserted into the list</li>
<li>Java List provides control over the position where you can insert an element</li>
<li>You can access elements by their index and also search elements in the list.</li>
<li>List allows you to add duplicate elements.</li>
<li>List allows you to have ‘null’ elements</li>
<li>List indexes start from 0, just like arrays.</li>
<li>Some of the most used List implementation classes are ArrayList, LInkedList, Vector,Stack, CopyOnWriteArrayList.</li>

<br>

| ArrayList | 	LinkedList |
| ----------- | ----------- |
| ArrayList internally uses a dynamic array to store the elements.	| LinkedList internally uses a doubly linked list to store the elements. |
| Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.	| Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.|
| An ArrayList class can act as a list only because it implements List only.	| LinkedList class can act as a list and queue both because it implements List and Deque interfaces. |
| ArrayList is better for storing and accessing data.	 | LinkedList is better for manipulating data. |
| The memory location for the elements of an ArrayList is contiguous. |	The location for the elements of a linked list is not contagious. |
| Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList. |	There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized. |
| To be precise, an ArrayList is a resizable array. |	LinkedList implements the doubly linked list of the list interface. |

<br>


|Class |	Description |
|-------| ------------|
|HashMap 	| HashMapis the implementation of Map, but it doesn't maintain any order.| 
| LinkedHashMap |	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order. |
| TreeMap |	TreeMap is the implementation of Map and SortedMap. It maintains ascending order. |


<br>

**List vs Map**
| List                                              | Map         |
| ----------- | ----------------- |
| Allow duplicate elements.     | Does not allow duplicate key but values can be duplicate.       |
| Allow multiple null values.  | Allow single null as key and multiple null as values.        |
|Maintains insertions order.| Like Set, Map also represents an unordered collection. Again same like Set, some of its implementation classes maintains some order. TreeMap maintains ascending order of keys.  |


**HashMap**
<br>
* HashMap has **complexity of O(1) for insertion and lookup**.

* HashMap **allows one null key** and **multiple null values**.

* HashMap **does not maintain** any **order**.

**LinkedHashMap**
<br>
* LinkedHashMap has **complexity of O(1) for insertion and lookup**.

* LinkedHashMap **allows one null key** and **multiple null values**.

* LinkedHashMap **maintains order in which key-value pairs are inserted**.

**TreeMap**
<br>
* TreeMap has complexity of **O(logN) for insertion and lookup**.

* TreeMap does not **allow null key but allow multiple null values**.

* TreeMap **maintains order**. It **stores keys in sorted and ascending order**.



