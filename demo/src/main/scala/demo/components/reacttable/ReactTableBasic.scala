package demo
package components
package reacttable

import chandu0101.scalajs.react.components.tables.ReactTable
import chandu0101.scalajs.react.components.util.JsonUtil
import demo.util.SampleData
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object ReactTableBasic {

  val code =
    """
      |  val data: Vector[Map[String,Any]] = JsonUtil.jsonArrayToMap(SampleData.personJson)
      |  val columns: List[String] = List("fname","lname","email","country")
      |  ReactTable(data = data,columns = columns,rowsPerPage = 6)
    """.stripMargin
  val component = ReactComponentB[Unit]("plain")
    .render(P => {
   <.div(
     <.h2(^.cls := "mui-font-style-headline")("Basic Table"),
      CodeExample(code)(
       ReactTable(data = data,columns = columns ,rowsPerPage = 6)
      )
    )
  }).buildU

  val data: Vector[Map[String,Any]] = JsonUtil.jsonArrayToMap(SampleData.personJson)
  val columns: List[String] = List("fname","lname","email","country")

  def apply() = component()

}
