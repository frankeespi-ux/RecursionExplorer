# RecursionExplorer

A beginner-friendly Java console application designed to help me (Frank) learn and master recursion through hands-on practice.  
This project includes multiple recursive functions, menu navigation, input handling, and a full trace mode that visually demonstrates recursive call depth.

This is my second Java project posted to GitHub, and it represents a major step in my learning progress as I work toward becoming a software developer.

---

## 🚀 Features

### ✔ Factorial (recursive)
Computes `n!` using a classic recursive definition:
- Base case: `n <= 1`
- Recursive case: `n * factorial(n - 1)`

### ✔ Sum from 1 to n (recursive)
Adds all numbers from `1` to `n` using recursive addition:
- Base case: `n == 0`
- Recursive case: `n + sumTo(n - 1)`

### ✔ Reverse a string (recursive)
Reverses any string by peeling off characters one at a time:
- Base case: length `<= 1`
- Recursive case: last char + reverse(rest of string)

### ✔ Reverse a string (TRACE MODE)
A special version that prints each recursive call and return value.

Example output:
reverseString("Frank")
reverseString("Fran")
reverseString("Fra")
reverseString("Fr")
reverseString("F")
BASE CASE → return "F"
Returning "rF"
Returning "arF"
Returning "narF"
Returning "knarF"

Final result: knarF


This mode helped me understand what recursion actually *does* under the hood.

---

## 📂 Project Structure
RecursionExplorer/
├── src/
│ └── RecursionExplorer.java
├── .gitignore
├── README.md
---

## 🧠 What I Learned

- How to implement recursive algorithms in Java  
- How to identify base cases and recursive cases  
- How to trace recursion visually  
- How to build and run Java programs in VS Code  
- How to commit and push code to GitHub  
- How to structure a small but meaningful Java project  

Every function in this app was typed manually by me rather than auto-generated — to strengthen muscle memory and reinforce understanding.

---

## 🛠️ Technologies Used

- Java 25  
- VS Code  
- Git & GitHub  
- Windows 11  

---

## 🎯 Future Improvements

- Add Fibonacci (with and without memoization)  
- Add recursion depth limits  
- Add iterative versions for comparison  
- Convert program into a GUI (Swing or JavaFX)  
- Add unit tests (JUnit)  

---

## 📸 Screenshots (coming soon)
I plan to add screenshots of recursion trace output and program flow.

---

## 👤 Author

**Frank (frankeespi-ux)**  
Aspiring software engineer — completing a BS in Computer Science and building up my GitHub portfolio one project at a time.

---

If you find this project helpful or want to see my progress, feel free to ⭐ star the repo!
