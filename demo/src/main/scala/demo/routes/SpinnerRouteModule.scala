package demo
package routes

import demo.components.spinner.{SpinnerDemo, SpinnerInfo}
import demo.pages.SpinnerPage
import japgolly.scalajs.react.extra.router2.RouterConfigDsl

object SpinnerRouteModule {

  case object Info extends LeftRoute("Info", "info", () => SpinnerInfo())

  case object Demo extends LeftRoute("Demo", "demo", () => SpinnerDemo())

  val menu: List[LeftRoute] = List(Info,Demo)

  val routes = RouterConfigDsl[LeftRoute].buildRule { dsl =>
    import dsl._
    menu.map(i =>
      staticRoute(i.route, i) ~> renderR(r => SpinnerPage(i, r))
    ).reduce(_ | _)

  }
}
