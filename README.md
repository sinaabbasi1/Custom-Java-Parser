# :coffee: Custom Java Parser

This project involves designing and implementing a parser with Java CUP and modifying an existing scanner using JFlex.
The goal was to enhance the scanner and parser to support additional constructs inspired by Java, while maintaining case-insensitive functionality and user-friendly error reporting.

A custom Java parser with modified grammar, redefining certain statements and constructs. Includes a GUI-based compiler to display outputs from the scanner and parser.

## Getting Started

This app runs smoothly with OpenJDK version 1.8.0_292.

1. **Clone the repository:** <br />
```
git clone https://github.com/sinaabbasi1/Custom-Java-Parser.git
```
2. **Compile the project:** If you're using the command line, navigate to the `src/` directory and compile the `.java` files: <br />
```
javac FrameGUI.java
```
3. **Run the app:** <br />
```
java FrameGUI
```

## Features

### Extended Syntax

  1. `for-where` **Loop:** \
     A loop construct with a block of statements defined by `begin` and `end`.
     
     **Syntax:**
     ```
     for <variable-name> = <initial-value> until <final-value> where
     begin
         // statements
     end
     ```

     **Example:**
     ```
     for i = 8 until 14 where
     begin
         System.out.println("Hello");
     end
     ```
  2. `while-where` **Loop:** \
     A `while` loop with an added block of statements.

     **Syntax:**
     ```
     while <condition> where
     begin
         // statements
     end
     ```

     **Example:**
     ```
     while (x < 100) where
     begin
         x = x + 10;
     end
     ```
  3. **Array Declaration:** \
     Simplifies array creation with specified ranges.

     **Syntax:**
     ```
     array-identifier = array[start:end] of element-type;
     ```

     **Example:**
     ```
     myArray = array[0:9] of int;
     ```

### Additional Enhancements
* **Case Insensitivity:** The scanner recognizes keywords regardless of case.
* **Error Reporting:** Highlights problematic symbols and their location.


## Prerequisites

* **Java Development Kit (JDK):** Required to compile and run Java programs.
* **JFlex:** A lexical analyzer generator. [Installation Guide](https://www.youtube.com/watch?v=WLHn5JzLx6I)
* **Java CUP:** A parser generator for Java. [Installation Guide](https://www.youtube.com/watch?v=zWoDiDy5c-U)

## Screenshots

| ![Startup Screen](./screenshots/Startup%20Screen.png) | 
|:--:| 
| *Startup Screen* |

| ![Test Case 1 - Correct](./screenshots/Test%20Case%201%20-%20Correct.png) | 
|:--:| 
| *Test Case 1 - Correct* |

| ![Test Case 2 - Correct](./screenshots/Test%20Case%202%20-%20Correct.png) | 
|:--:| 
| *Test Case 2 - Correct* |

| ![Test Case 3 - Incorrect](./screenshots/Test%20Case%203%20-%20Incorrect.png) | 
|:--:| 
| *Test Case 3 - Incorrect* |

| ![Test Case 4 - Incorrect](./screenshots/Test%20Case%204%20-%20Incorrect.png) | 
|:--:| 
| *Test Case 4 - Incorrect* |

## Contributing

Feel free to submit issues or pull requests if you find bugs or want to improve the game.

## License

This project is open-source and available under the [MIT License](LICENSE).





     
