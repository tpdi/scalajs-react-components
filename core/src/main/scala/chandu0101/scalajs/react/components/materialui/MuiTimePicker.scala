package chandu0101.scalajs.react.components
package materialui

import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.{Date => JDate}

case class MuiTimePicker(format: U[MuiTimePickerFormat] = uNone,
                         onDismiss: U[() => Unit] = uNone,
                         onShow: U[() => Unit] = uNone,
                         style: U[js.Any] = uNone,
                         onChange: U[(JDate, JDate) => Unit] = uNone,
                         ref: U[String] = uNone,
                         hintText: U[String] = uNone,
                         key: U[String] = uNone,
                         defaultTime: U[JDate] = uNone,
                         onTouchTap: U[ReactEventI => Unit] = uNone,
                         onFocus: U[ReactEventI => Unit] = uNone) {

  def apply() = {
    val props = JSMacro[MuiTimePicker](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Mui.TimePicker)
    f(props).asInstanceOf[ReactComponentU_]
  }

}

case class MuiTimePickerFormat(val value: String) extends AnyVal

object MuiTimePickerFormat {

  val AM_PM = new MuiTimePickerFormat("ampm")

  val TWENTY_FOUR_HOUR = new MuiTimePickerFormat("24hr")

  def newFormat(format: String) = new MuiTimePickerFormat(format)
}