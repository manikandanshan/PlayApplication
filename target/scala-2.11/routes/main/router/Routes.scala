
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nagarajan/Desktop/EXAMPLE PROJECTS/PLAY_AAMP/conf/routes
// @DATE:Tue Feb 28 18:12:15 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_2: controllers.Application,
  // @LINE:13
  HomeController_0: controllers.HomeController,
  // @LINE:30
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_2: controllers.Application,
    // @LINE:13
    HomeController_0: controllers.HomeController,
    // @LINE:30
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.postLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Application.profile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.index1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/new""", """controllers.HomeController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login1_invoker = createInvoker(
    Application_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_postLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_postLogin2_invoker = createInvoker(
    Application_2.postLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "postLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_profile3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Application_profile3_invoker = createInvoker(
    Application_2.profile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout4_invoker = createInvoker(
    Application_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_index15_invoker = createInvoker(
    HomeController_0.index1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index1",
      Nil,
      "GET",
      """ Default path will just redirect to the computer list""",
      this.prefix + """home"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_list6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_list6_invoker = createInvoker(
    HomeController_0.list(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      """ Computers list (look at the default values for pagination parameters)""",
      this.prefix + """computers"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_create7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/new")))
  )
  private[this] lazy val controllers_HomeController_create7_invoker = createInvoker(
    HomeController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Nil,
      "GET",
      """ Add computer""",
      this.prefix + """computers/new"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_save8_invoker = createInvoker(
    HomeController_0.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """computers"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_edit9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_edit9_invoker = createInvoker(
    HomeController_0.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """ Edit existing computer""",
      this.prefix + """computers/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_update10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update10_invoker = createInvoker(
    HomeController_0.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """computers/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_delete11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_delete11_invoker = createInvoker(
    HomeController_0.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """ Delete a computer""",
      this.prefix + """computers/""" + "$" + """id<[^/]+>/delete"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:6
    case controllers_Application_login1_route(params) =>
      call { 
        controllers_Application_login1_invoker.call(Application_2.login())
      }
  
    // @LINE:7
    case controllers_Application_postLogin2_route(params) =>
      call { 
        controllers_Application_postLogin2_invoker.call(Application_2.postLogin())
      }
  
    // @LINE:8
    case controllers_Application_profile3_route(params) =>
      call { 
        controllers_Application_profile3_invoker.call(Application_2.profile())
      }
  
    // @LINE:9
    case controllers_Application_logout4_route(params) =>
      call { 
        controllers_Application_logout4_invoker.call(Application_2.logout())
      }
  
    // @LINE:13
    case controllers_HomeController_index15_route(params) =>
      call { 
        controllers_HomeController_index15_invoker.call(HomeController_0.index1())
      }
  
    // @LINE:16
    case controllers_HomeController_list6_route(params) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_HomeController_list6_invoker.call(HomeController_0.list(p, s, o, f))
      }
  
    // @LINE:19
    case controllers_HomeController_create7_route(params) =>
      call { 
        controllers_HomeController_create7_invoker.call(HomeController_0.create())
      }
  
    // @LINE:20
    case controllers_HomeController_save8_route(params) =>
      call { 
        controllers_HomeController_save8_invoker.call(HomeController_0.save())
      }
  
    // @LINE:23
    case controllers_HomeController_edit9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_edit9_invoker.call(HomeController_0.edit(id))
      }
  
    // @LINE:24
    case controllers_HomeController_update10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_update10_invoker.call(HomeController_0.update(id))
      }
  
    // @LINE:27
    case controllers_HomeController_delete11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete11_invoker.call(HomeController_0.delete(id))
      }
  
    // @LINE:30
    case controllers_Assets_at12_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_1.at(path, file))
      }
  }
}
