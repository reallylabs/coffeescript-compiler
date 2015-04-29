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

Thanks for David Gageot for the inspiration http://blog.javabien.net/2014/02/19/use-nashorn-and-webjars-to-execute-javascript-server-side/
