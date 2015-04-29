# coffeescript-compiler
CoffeeScript to JavaScript compiler in Scala using Nashorn based on CoffeeScript 1.9

## Requirements
  - Java 8 (Oracle JDK Preferred)

## How to Use it?
```
import io.really.coffeescript._

val compiler = new CoffeeScriptCompiler
println(compiler.compile("a = 5"))
```