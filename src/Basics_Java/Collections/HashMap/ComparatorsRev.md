# Java Comparator & Sorting — Quick Revision Guide 🚀

## 📌 Overview

This file covers the **most important sorting patterns in Java** used in:

* LeetCode
* Competitive Programming (CP)
* MAANG Interviews

---

## 🧠 1. Basic Sorting (List of Objects)

### ✅ Ascending (Best Practice)

```java
students.sort(Comparator.comparing(Student::getAge));
```

### ✅ Descending

```java
students.sort(Comparator.comparing(Student::getAge).reversed());
```

---

## 🧠 2. CP Style (Short Syntax)

```java
students.sort((a, b) -> a.age - b.age);     // ascending
students.sort((a, b) -> b.age - a.age);     // descending
```

⚠️ Note: May cause overflow (rare). Prefer `Integer.compare()` in interviews.

---

## 🧠 3. Multi-Level Sorting (VERY IMPORTANT 🔥)

### Example: Age ↑ then Name ↑

```java
students.sort(
    Comparator.comparing(Student::getAge)
              .thenComparing(Student::getName)
);
```

### Example: Age ↓ then Name ↑

```java
students.sort(
    Comparator.comparing(Student::getAge)
              .reversed()
              .thenComparing(Student::getName)
);
```

---

## 🧠 4. Sorting Arrays (LeetCode Standard)

### 1D Array

```java
Arrays.sort(arr);
```

### 2D Array (VERY COMMON)

```java
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
```

Used in:

* Merge Intervals
* Meeting Rooms
* Scheduling problems

---

## 🧠 5. PriorityQueue (Heap) — MUST KNOW 🔥

### Min Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

### Max Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
```

### Custom Object Heap

```java
PriorityQueue<Student> pq =
    new PriorityQueue<>(Comparator.comparing(Student::getAge));
```

---

## 🧠 6. String Sorting

```java
Collections.sort(list); // default lexicographical
```

```java
Collections.sort(list, (a, b) -> a.length() - b.length()); // by length
```

---

## ⚠️ Common Mistakes

### ❌ Wrong

```java
a.name - b.name
```

### ✅ Correct

```java
a.name.compareTo(b.name)
```

---

### ❌ Risky

```java
a.age - b.age
```

### ✅ Safe

```java
Integer.compare(a.age, b.age)
```

---

## 🎯 Final Memory Rules

* `comparing()` → select field
* `reversed()` → reverse order
* `thenComparing()` → tie-breaker

---

## 🚀 Must-Practice Problems

1. Merge Intervals
2. Meeting Rooms
3. Top K Elements (Heap)
4. Sort Characters by Frequency
5. K Closest Points

---

## 🧠 Final Advice

* Use **Comparator.comparing()** for interviews
* Use **lambda `(a,b)`** for fast CP coding
* Master **PriorityQueue + Comparator** for MAANG

---

## ✅ Example Student Class

```java
class Student {
    int age;
    String name;
    int weight;

    Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() { return age; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student{age=" + age + ", name='" + name + "', weight=" + weight + "}";
    }
}
```

---

🔥 **Master this file → You’re sorted for 90% of sorting questions.**
