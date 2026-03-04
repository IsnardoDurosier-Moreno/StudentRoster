# Student Roster/Record System (Java OOP)

This project demonstrates object-oriented programming concepts in Java, focusing on:

- Inheritance
- Encapsulation
- Method overriding
- `equals()` implementation
- `compareTo()` using `Comparable`
- Polymorphism
- ArrayList usage

The program models a simple student record system with a base `Student` class and an extended `StudentRecord` class that manages courses.

---

## Project Structure

### Student.java
Represents a student with:
- First name
- Last name
- ID number

Implements:
- Comparable<Student>
- `equals()` → Two students are equal if their ID numbers match
- `compareTo()` → Alphabetical ordering by last name, then first name
- `toString()` → Formatted output

### StudentRecord.java
Extends `student` and adds:
- ArrayList<String> courses
- addCourse() (prevents duplicates)
- dropCourse()
- Overrides toString() to include course information.
- If no course exists, it prints `No course(s) found.`

### Purpose
This project was developed as part of a college assignment to demonstrate proper class design, method overriding, and sorting behavior without implementing a full LinkedList-based roster system (yet).

The ID formatting and roster integration will be handled in a separate main program.
