name := "coffeescript-compiler"

version := "1.0.0"

organization := "io.really"

crossScalaVersions := Seq("2.10.5", "2.11.6")

homepage := Some(url("https://github.com/reallylabs/coffeescript-compiler"))

licenses += "Apache2" -> url("http://www.opensource.org/licenses/Apache-2.0")

scmInfo := Some(ScmInfo(url("https://github.com/reallylabs/coffeescript-compiler"), "scm:git@github.com:reallylabs/coffeescript-compiler.git"))

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <developers>
    <developer>
      <id>reallylabs</id>
      <name>Really Labs</name>
      <url>http://really.io</url>
    </developer>
  </developers>)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.5" % "test"
)

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)
