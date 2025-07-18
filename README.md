## 📄 Description – Exercise Statement

### ✅ Exercise 1
This Java exercise modifies the previous generic method so that **one of the arguments is not generic**.

- The class `GenericMethods` defines a generic method where the first parameter is always a `String`, and the remaining two are generic types.
- This demonstrates how to mix generic and non-generic parameters in method signatures.
- The `MainEx1` class calls the method using different combinations, mixing `String`, `Integer`, and custom objects.

This exercise focuses on:
- Applying partial generic typing to methods
- Reinforcing method signature flexibility
- Demonstrating hybrid method argument types

### ✅ Exercise 2
This task expands the generic method to accept a **variable number of arguments** (varargs).

- The class `GenericMethods` uses a generic method with varargs: `printAll(T... args)`.
- This allows the method to print any number of arguments of the same type.
- The `MainEx2` class calls the method with different numbers of arguments, including `String`, `Integer`, and objects of class `Persona`.

This exercise focuses on:
- Using generics with varargs
- Writing flexible and reusable utility methods
- Practicing loop constructs and dynamic argument handling

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.6-JavaLanguage-Generics-Level2.git
   ```

2. Open the project in IntelliJ IDEA:

   File → Open → Select the project folder

3. Set the correct Java SDK:

   File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Run the `MainEx1` class from the `ex1` package.
2. Run the `MainEx2` class from the `ex2` package.

The console will display:
- A generic method with one fixed argument (`String`) and two flexible ones
- A flexible method printing any number of arguments of a single type

---

## 🌐 Deployment

This is a Java console-based educational exercise and doesn't require production deployment.
If desired, you can compile and run it manually:

```bash
javac -d out src/com/alaw810/ex1/*.java
javac -d out src/com/alaw810/ex2/*.java

java -cp out com.alaw810.ex1.MainEx1
java -cp out com.alaw810.ex2.MainEx2
```

---

## 🤝 Contributions

This is a learning exercise intended for individual academic practice.
However, pull requests with enhancements or improvements are welcome!

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request

