# Java Gently Package Repository

## Overview

This repository contains Java programs that utilize the **Java Gently** package (`javagently`), a simple utility library designed to make input/output operations easier in Java, particularly for beginners and educational purposes.

## What is Java Gently?

Java Gently is a lightweight Java package that provides simplified methods for:
- Reading input from the keyboard or files (integers, doubles, strings, characters)
- Opening input/output streams
- Formatting output with alignment and precision

The package consists of a single class `Text` with static methods that wrap common I/O operations, making them more accessible than standard Java I/O classes.

### Key Features

- **Simple Input Methods**: `readInt()`, `readDouble()`, `readString()`, `readChar()`
- **File Handling**: `open()` for files and streams, `create()` for output files
- **Output Formatting**: `writeInt()`, `writeDouble()` with alignment options
- **Prompting**: `prompt()` method for user-friendly input prompts

## Usage Example

```java
import java.io.*;
import javagently.*;

public class MyProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader in = Text.open(System.in);
        
        Text.prompt("Enter your age:");
        int age = Text.readInt(in);
        
        Text.prompt("Enter your name:");
        String name = Text.readString(in);
        
        System.out.println("Hello " + name + ", you are " + age + " years old!");
    }
}
```

## Running Programs in This Repository

### Compilation
To compile Java programs that use the Java Gently package:

```bash
javac -cp . YourProgram.java
```

The `-cp .` (classpath) option ensures the compiler can find the `javagently` package in the current directory.

### Execution
To run the compiled program:

```bash
java YourProgram
```

### Batch File
A convenience batch file `runcode.bat` is provided for Windows users. To use it:

1. Edit `runcode.bat` to change `prog5` to your desired program name
2. Run the batch file: `runcode.bat`

Or create your own batch file with the compilation and execution commands.

## Project Structure

- `javagently/Text.java` - The main Java Gently utility class
- `prog1.java` through `prog5.java` - Example programs demonstrating various concepts
- `file1.java` through `file4.java` - Additional Java files
- `runcode.bat` - Windows batch file for easy compilation and execution
- `numbers.txt` - Sample data file
- `Testfile` - Test data file
- `bin/` - Directory for compiled class files (if used)

## Requirements

- Java Development Kit (JDK) installed
- Basic understanding of Java programming
- Windows command prompt or terminal for compilation/execution

## Notes

- Programs using Java Gently must handle `IOException` in their `main` method
- Input methods will prompt for re-entry on invalid input (e.g., non-numeric input for `readInt()`)
- The package is designed for simplicity and may not be suitable for production applications requiring advanced I/O features</content>
<parameter name="filePath">c:\Users\LENOVO THINK PAD\Desktop\MyJavaProject\README.md