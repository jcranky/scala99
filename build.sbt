
name := "Scala 99 Problems"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.12.1" % "test" withSources
)

seq(netbeans.NetbeansTasks.netbeansSettings:_*)
