# Velocity Lens (Java)

Java planning utility that ranks engineering work by impact-per-effort and produces a constrained sprint batch.

## Build

```powershell
cd velocity-lens-java
mkdir out -ErrorAction SilentlyContinue
javac -d out src\main\java\com\\velocitylens\\velocity\*.java tests\TestPlanner.java
```

## Run

```powershell
cd velocity-lens-java
java -cp out com.velocitylens.velocity.Main
```

## Test

```powershell
cd velocity-lens-java
java -ea -cp out TestPlanner
```


