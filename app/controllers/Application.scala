package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def join = Action {
    Ok(views.html.join(""))
  }

  def projects = Action {
    Ok(views.html.projects(""))
  }

  def members = Action {
    Ok(views.html.members(""))
  }

  def meetings = Action {
    Ok(views.html.meetings(""))
  }

}