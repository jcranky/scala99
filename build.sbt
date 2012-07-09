
name := "Scala 99 Problems"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.11" % "test"
)

seq(netbeans.NetbeansTasks.netbeansSettings:_*)
