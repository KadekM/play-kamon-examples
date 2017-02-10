package controllers

import javax.inject._

import kamon.Kamon
import play.api._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject()(implicit ec: ExecutionContext) extends Controller {

  val counter = Kamon.metrics.counter("counter")

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  def inc = Action.async {
    Future {
      counter.increment()
      Ok("incremented")
    }
  }

}
