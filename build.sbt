ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies += "com.microsoft.playwright" % "playwright" % "1.42.0",
    name := "playwright-selenium-comparison",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % "test",
    libraryDependencies += "org.scalatestplus" %% "selenium-4-17" % "3.2.18.0" % "test",
    libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "4.18.1",
    Test / testOptions += Tests.Argument("-oD")
  )
