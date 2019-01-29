package com.thoughtworks.gatlingdemo

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

/**
  * @author 杨博 (Yang Bo)
  */
class CmbChinaDotCom extends Simulation {

  val httpProtocol = http
    .baseURL("http://www.cmbchina.com/")
    .inferHtmlResources()
    .disableCaching

  val scn = scenario(getClass.getName)
    .exec(http("Home Page").get("/"))
    .exec(http("Promotion").get("/Personal/Promotion/default.aspx"))

  setUp(scn.inject(atOnceUsers(users = 30))).protocols(httpProtocol)

}
