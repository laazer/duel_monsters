# Same? Same. Equality and Enums

## Sameness and Equality 

What does it mean when we say 2 objects are equal? For example, check out the 2 cards below:

![](pics/be1.jpg)___![](pics/be2jpg.jpg)

Both cards are clearly 'Blue Eyes White Dragon'. Same attack, defense, level, attribute, and creature types. Even the
flavor text is the same. For all practical purposes both of these cards are the same. The only real difference is the
artwork. 

So why is this important? In java there are 2 ways to compare objects `==` and `equals`. `==` does a check to see
if 2 objects have the same value in memory and by default `equals` does the same thing. Lets take a look at some code*.

```java
class Main {
    public static void main(String[] args) {        
        MonsterCard be1 = new MonsterCard("Blue-Eyes White Dragon", 3000, 2500);
        MonsterCard be2 = new MonsterCard("Blue-Eyes White Dragon", 3000, 2500);
        System.out.println(be1 == be1);
        System.out.println(be1.equals(be1));
        System.out.println(be1 == be2);
        System.out.println(be1.equals(be2));    
    }
}
```

*<sub>
Background:
 There's some new stuff here that we should discuss first. A `main` method is the entry-point for a standard 
java application. It's always named `main` always had 2 key-words, an access modifier `public` and the key-word 
`static` (We'll cover this in a future lesson) and always takes an **array** of `String`s denoted by
`String[]`(We'll cover arrays in the next lesson).  We can even compile and run this app as a java application. Check
out the **Links to Further Reading** at the end for more info.
</sub>

If we run this application the output would look like:
```
true
true
false
false
```

## Links For Further Reading
- [More on `static`](https://www.javatpoint.com/static-keyword-in-java)
- [More on running a java application in Intellij](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#)
- [More on running a java application from the command line](https://beginnersbook.com/2013/05/first-java-program/)
- [More on method overriding](https://www.javatpoint.com/method-overriding-in-java)