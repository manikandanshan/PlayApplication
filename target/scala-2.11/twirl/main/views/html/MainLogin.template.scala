
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object MainLogin_Scope0 {
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

class MainLogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,UserInfo,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/page),format.raw/*7.21*/(""" """),format.raw/*7.22*/("""(AAMP-login)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        
        <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
    
     <!-- Responsive navbar -->
  <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">AAMP-login</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav navbar-left">
          """),_display_(/*35.12*/if(isLoggedIn)/*35.26*/ {_display_(Seq[Any](format.raw/*35.28*/("""
            """),format.raw/*36.13*/("""<li class=""""),_display_(/*36.25*/("active".when(page == "Profile"))),format.raw/*36.59*/(""""><a href=""""),_display_(/*36.71*/routes/*36.77*/.Application.profile()),format.raw/*36.99*/("""">Profile</a></li>
          """)))}),format.raw/*37.12*/("""
        """),format.raw/*38.9*/("""</ul>
        <ul class="nav navbar-nav navbar-right">
          """),_display_(/*40.12*/if(isLoggedIn)/*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
            """),format.raw/*41.13*/("""<li><p class="navbar-text"></p></li>
            <li><a href=""""),_display_(/*42.27*/routes/*42.33*/.Application.logout()),format.raw/*42.54*/("""">Logout</a></li>
          """)))}/*43.13*/else/*43.18*/{_display_(Seq[Any](format.raw/*43.19*/("""
            """),format.raw/*44.13*/("""<li><a href=""""),_display_(/*44.27*/routes/*44.33*/.Application.login()),format.raw/*44.53*/("""">Login</a></li>
          """)))}),format.raw/*45.12*/("""

        """),format.raw/*47.9*/("""</ul>
      </div>
    </div>
  </div>
      """),_display_(/*51.8*/content),format.raw/*51.15*/("""
      """),format.raw/*52.7*/("""<!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)(content)

  def f:((String,Boolean,UserInfo) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => (content) => apply(page,isLoggedIn,userInfo)(content)

  def ref: this.type = this

}


}

/**/
object MainLogin extends MainLogin_Scope0.MainLogin
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 18:10:54 IST 2017
                  SOURCE: C:/Users/Nagarajan/Desktop/EXAMPLE PROJECTS/PLAY_AAMP/app/views/MainLogin.scala.html
                  HASH: c6a0f38645f66366c7acbd744c91047ed5076154
                  MATRIX: 775->1|940->71|968->73|1045->124|1069->128|1097->129|1463->468|1478->474|1533->508|1621->569|1636->575|1689->607|2737->1628|2760->1642|2800->1644|2841->1657|2880->1669|2935->1703|2974->1715|2989->1721|3032->1743|3093->1773|3129->1782|3222->1848|3245->1862|3285->1864|3326->1877|3416->1940|3431->1946|3473->1967|3521->1997|3534->2002|3573->2003|3614->2016|3655->2030|3670->2036|3711->2056|3770->2084|3807->2094|3879->2140|3907->2147|3941->2154
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|43->12|43->12|43->12|44->13|44->13|44->13|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|76->45|78->47|82->51|82->51|83->52
                  -- GENERATED --
              */
          