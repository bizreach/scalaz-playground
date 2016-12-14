name := "scalaz-playground"
scalaVersion := "2.12.1"
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.8"
)
initialCommands in console := "import scalaz._; import Scalaz._"
