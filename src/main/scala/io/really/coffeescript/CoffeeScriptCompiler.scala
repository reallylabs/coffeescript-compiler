package io.really.coffeescript

import javax.script._
import jdk.nashorn.api.scripting._
import javax.script.ScriptContext._;
import scala.io.Source

/**
 * CoffeeScriptCompiler relies on Java8's Nashorn implementation for faster performance and more predictable output
 */

class CoffeeScriptCompiler(bare: Boolean = true) {
  val factory = new NashornScriptEngineFactory
  val engine = factory.getScriptEngine(Array("-strict", "--no-java", "--no-syntax-extensions"))
  val context = new SimpleScriptContext();
  context.setBindings(engine.createBindings(), ScriptContext.ENGINE_SCOPE);
  val coffeeScriptSource = Source.fromInputStream(getClass.getResourceAsStream("/coffee-script.js")).mkString
  val compiled = (engine.asInstanceOf[Compilable]).compile(coffeeScriptSource + s"\nCoffeeScript.compile(__source, {bare: ${bare.toString}});")
  val bindings = engine.getBindings(ENGINE_SCOPE)

  def compile(coffee: String): String = {
    bindings.put("__source", coffee)
    return compiled.eval(bindings).toString
  }
}