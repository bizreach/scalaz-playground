name := "scalaz-playground"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.3"
)
initialCommands in console := "import scalaz._; import Scalaz._"
