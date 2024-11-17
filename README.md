# Inheritance_super
# Shape Area Calculation

This is a Java program that calculates the area of different shapes: Rectangle, Triangle, and Circle. The program demonstrates the concepts of inheritance and polymorphism in Java.

---

## **Features**

- **Shape Class**: A base class that holds the dimensions (`a` and `b`) for the shapes.
- **Rectangle Class**: A subclass of Shape that calculates the area of a rectangle.
- **Triangle Class**: A subclass of Shape that calculates the area of a triangle.
- **Circle Class**: A subclass of Shape that calculates the area of a circle.
- Input values are read from the user via the console.
- Areas of all shapes are calculated and displayed.

---

## **Program Flow**

1. The program prompts the user to enter the values for dimensions `a` and `b`.
   - `a` is used as the radius for the circle.
   - Both `a` and `b` are used for rectangle and triangle calculations.
2. The program creates objects for Rectangle, Triangle, and Circle classes.
3. Each shape's respective `printArea()` method is called to display its area.

---

## **Input Requirements**

- **a**: An integer representing one of the dimensions (or radius for the circle).
- **b**: An integer representing the second dimension (ignored for the circle).

## **Code Explanation**

- **Shape Class**:
- Stores the dimensions `a` and `b`.
- Acts as a base class for all shapes.

- **Rectangle, Triangle, Circle Classes**:
- Extend the `Shape` class.
- Implement their specific formula for calculating the area.

- **Main Class**:
- Uses a `Scanner` to get input from the user.
- Creates objects for Rectangle, Triangle, and Circle.
- Calls their `printArea()` methods.
