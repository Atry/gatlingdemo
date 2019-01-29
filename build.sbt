enablePlugins(GatlingPlugin)

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.5" % Test

libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.1.5" % Test

scalaVersion := "2.11.12"