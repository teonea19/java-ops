# java-ops

Small standalone Java programs written while working through Java fundamentals — no build tool yet, just `javac`/`java`.

## Requirements
- JDK 21 (install via SDKMAN or Eclipse Temurin)

## How to run
Compile any program with:
```bash
javac <ProgramName>.java
java <ProgramName>
```

## Programs

| Program | What it does | Run example |
|---|---|---|
| `Hello` | Prints a greeting; uses `args[0]` as a name if given | `java Hello Charlie` |
| `TempConverter` | Converts Fahrenheit to Celsius | `java TempConverter 98.6` |
| `DiceRoller` | Rolls a 6-sided die 10 times, prints total | `java DiceRoller` |
| `FizzBuzz` | Prints 1–100 with Fizz/Buzz substitution | `java FizzBuzz` |
| `SecondsToClock` | Converts seconds to `HH:MM:SS` | `java SecondsToClock 3661` |
