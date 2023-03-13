ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "flyway_integration"
  )

enablePlugins(FlywayPlugin)

libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"
flywayUrl := "jdbc:mysql://localhost:3306/flyway_excercise"
flywayUser := "YourUser"
flywayPassword := "YourPassword"
flywayLocations += "db/migration"