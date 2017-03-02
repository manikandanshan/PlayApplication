
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class Login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,UserInfo,Form[views.formdata.LoginFormData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo, loginForm: Form[views.formdata.LoginFormData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import bootstrap3._

Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/MainLogin(page, isLoggedIn, userInfo)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
   """),format.raw/*6.4*/("""<div class="container">
     """),_display_(/*7.7*/loginform(routes.Application.postLogin(), loginForm("email"), loginForm("password"))),format.raw/*7.91*/("""
   """),format.raw/*8.4*/("""</div>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,loginForm:Form[views.formdata.LoginFormData]): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo,loginForm)

  def f:((String,Boolean,UserInfo,Form[views.formdata.LoginFormData]) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo,loginForm) => apply(page,isLoggedIn,userInfo,loginForm)

  def ref: this.type = this

}


}

/**/
object Login extends Login_Scope0.Login
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 18:10:54 IST 2017
                  SOURCE: C:/Users/Nagarajan/Desktop/EXAMPLE PROJECTS/PLAY_AAMP/app/views/Login.scala.html
                  HASH: d357cac491a4719d808743abbe43203a58b0a3eb
                  MATRIX: 797->1|1014->103|1042->126|1069->128|1114->165|1153->167|1183->171|1238->201|1342->285|1372->289|1409->297
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|38->8|39->9
                  -- GENERATED --
              */
          