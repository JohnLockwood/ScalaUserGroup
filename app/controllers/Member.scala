package controllers

import play.api._
import play.api.mvc._

object Member extends Controller {

  def index(page:String) = Action {
    Ok(views.html.member.john_lockwood())
    //renderTemplate(page)
    //render(page)
  }

}