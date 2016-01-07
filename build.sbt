name := "scalaz-playground"
scalaVersion := "2.11.7"
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.0"
)
initialCommands in console := "import scalaz._; import Scalaz._"
