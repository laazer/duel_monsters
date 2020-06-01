# Class amd Methods

## Overview
This is where things get more conceptual. When we want to represent complex pieces of data we need to create something
called a `class`. Think of classes like nouns. They are representative of data person, places, and things. 
Here's a very basic example of a class:
```java
public class MonsterCard {
    private String name;
    private int attack;
    private int defense;

    public MonsterCard(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;   
    } 

    public String getName() {
        return this.name;
    }

    public int getAttack()  {
        return this.attack;
    }

    public int getDefense()  {
        return this.defense;
    }
 
    public void increaseAttack(int increase) {
        this.attack = this.attack + increase;
    }
}
```

### Access Modifiers 

Lets break this example down. `public` is what's called an **Access Modifier**. Modifiers can
 be used to modify the access for classes, fields, methods, and constructors. You don't need to worry 
about this too much. To give a brief explanation, it determines what other objects (classes) can
see and and how those objects can interact with a class.

Think about these like viewer settings on a Facebook posts. 

The basic access modifiers are:
- public: Anything can access this.  
    - This is like when a post is set to *Everyone*. Any object is able to see and interact
    with classes and methods with the `public` access modifier.
- protected: Only classes that are "related" to this one can interact with this
    - This is like when a post is set to *Only Friends*. 
- private: Only the class itself can access this.
    - This is like when a post is set to *Only Me*.
    
 Next `class` denotes what's being declared here, which is object definition, (remember think noun).
 The name of the class being declared is `MonsterCard`. The classes can be named anything as long
 as long as the name is alphanumeric and starts with a letter. Classes names traditionally start with
 an uppercase letter.
 
 ### Fields and Types
 
 Next are the class **fields**. **Fields** are the parts that make up a `class`. If we think of **classes** as nouns,
 class **field**s one should think of fields like descriptors, adjectives, and components. 
 For example, for our `MonsterCard` class we have 2 **fields**s, `name`, `attack` and `defense`. **Fields** are preceded 
 by a type. For the `name` fields the type is `String`. `String`s are a collection of characters consisting of letters, 
 numbers, white space, and symbols. Check out the table below to see the full range of characters a `String` can be made of. 
 
![](pics/ascii.jpg)

The next 2 **field**s are of `int` (short for integer) type.`int`s are round numbers ranging between -2<sup>31</sup>
and 2<sup>31</sup>-1 so they can represent very large and very small numbers. 

Tangent: java `class`es are built using 2 types of of *primitive*s and *complex objects*. The java *primitive*s are:
- `byte`: 8 *0*s and *1*s. Straight up computer code. It's likely you will never use this type. Example: `01010101`
- `short`: Also a counting numbers but the range is smaller then `int`s. The range is between -2<sup>15</sup>
and 2<sup>15</sup>-1 
- `int`: see above.
- `long`: Also a counting numbers but the range is larger then `int`s. The range is between -2<sup>63</sup>
and 2<sup>63</sup>-1 
- `float`: relatively small decimal numbers.*
- `double`: relatively large decimal numbers.*
- `boolean`: a value that is either`true` or `false`
- `char`: A single character. Check out the ASCII table above and the oracle link below for more information.

You can check out [the oracle docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) for
more information.

*<sub>There's a lot of trickiness around `float` and `double` *primitives* that requires a deeper understanding of how
computers work, which goes beyond the scope of this project</sub>

### Constructors

After that is the **constructor** call, denoted by `public MonsterCard(String name, int attack, int defense)` .
As a side note, `class`es can have multiple more then one **constructor** . The `class` **constructor** is the
blueprint on how to create an instance of a `class`. In order to create a basic creature card we need the creature name, 
attack, and defense of that creature. 
For example:
```java
class Main {
    MonsterCard blueEyesWhiteDragon = new MonsterCard("Blue-Eyes White Dragon", 3000, 2500);
}
```

Lets take a look at the **constructor** again. 
```
    public MonsterCard(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;   
    } 
```
The `name` value inside the constructor is assigned to the `name` **field** that was declared. The `this` key-word is used 
to mean that we are referring to the object being created and not the `name` reference in the constructor. 

In the example above in `class Main`, if I wanted to get the `name` value for the `blueEyesWhiteDragon` field, I 
wouldn't get it from `this.name` because `Main` doesn't have a `name` **field**. I would have to get the `name` of 
`blueEyesWhiteDragon` by calling `this.blueEyesWhiteDragon.getName()`. Remember, `name` is set to `private` so only
the `MonsterCard` `class` can see the `name` **field**. But if the `name` **field** was set to `public` instead of
`private` we could get the `name` using `this.blueEyesWhiteDragon.name`.

### Methods

This brings us to **methods**. If `class`es are like nouns, then **method**s are like verbs. **Methods** are the 
actions an object can perform. In our `MonsterCard` class we have the following **method**s:
```
    public String getName() {
        return this.name;
    }

    public int getAttack()  {
        return this.attack;
    }

    public int getDefense()  {
        return this.defense;
    }
 
    public void increaseAttack(int increase) {
        this.attack = this.attack + increase;
    }
```
Lets deconstruct these **methods**. **Methods** start with an *accessor*, in this case `public`, followed by
the type being returned; for `getAttack()` and `getDefense()` the *return type* is `int`. `getName()` returns a `String`.
You can think of it like asking a question. If you ask someone, "What's your name?", you'd expect them to respond with 
their name. But if instead they responded by saying "1", then you become confused because "1" doesn't sound like a name 
(sorry Android 18, you're name is not common). You may have noticed now that `increaseAttack` has `void` as it's
return type. `void` is a key word that means the method doesn't return anything. After the *return type* is the 
**method** name. **Method** names our how we distinguish one **method** in a `class` from another. The last part
of the *method contract* are the *method inputs* (also referred to as parameters or arguments). 
It's any external data the class needs to complete the action that the **method** performs. In the `increaseAttack` 
**method** we need the value that the attack is being increased by. Like **methods** and **fields** the inputs also
need a *type*, in this case we have the input type of `int` for the input named `increase`. This is followed by the
*method body*. The *method body* is everything between `{` `}` that follows the first `)` after the *method inputs*. The
*method body* contains all the steps required to perform the action associated with the method. `increaseAttack`
has 1 step: `this.attack = this.attack + increase;`, set value of `this.attack` to be the current value of
`this.attack` plus the `increase` value. `;` denotes the end of a line.

### Getters
The first 3 **method**s are what are known as *getters*. They retrieve data stored inside the object. There are various
reasons objects use *getters* . Some of the common ones are it obfuscates the data being retrieved. For example
if we made an object that represented classified CIA documents, we wouldn't want every other class to be able to 
see all the data, just the data that hasn't been redacted. Another reason to use *getters* is that it allows the internal
representation of data to change without needing to change all the other classes that utilizes that *getter*. For example, 
lets say we need a bigger number to represent a `MonsterCard`'s attack. To do this we  would change `private int attack` to 
`private long attack`. But our *getter* here is still:
```
        public int getAttack()  {
            return this.attack;
        }
```
This would fail to compile because `attack` is no longer an `int`. Now we would have 2 options, we can either change
the method contract to return a `long` value but that would also mean changing every class that uses the `getAttack()` 
getter to now account for the new return type or we can update the **method** to convert the `long` `attack` value 
into an `int`. 

## Links For Further Reading
- [More on classes, objects, and fields](https://www.javatpoint.com/object-and-class-in-java)
- [More on access modifiers](https://www.javatpoint.com/access-modifiers)
- [More on constructors](https://www.javatpoint.com/java-constructor)
- [More on methods](https://www.javatpoint.com/method-in-java)
- [More on the `this` key-word](https://www.javatpoint.com/this-keyword)

## Assignment
1) Update the MonsterCard class to include the fields:
    - creatureTypes
    - level
    - attributeType

2) Create 3 endpoints that respond with 3 different creatures