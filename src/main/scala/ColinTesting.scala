import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._
import doodle.reactor._
import scala.concurrent.duration._

// To use this example:
//
// 1. run `sbt`
// 2. run the `run` command within `sbt`

Image.circle(10).fillColor(Color.hsl(0.degrees,0.8,0.6))
