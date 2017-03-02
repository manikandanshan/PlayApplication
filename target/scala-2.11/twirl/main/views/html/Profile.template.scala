
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Profile_Scope0 {
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

class Profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,UserInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: UserInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<br>
<br>
<br>
"""),_display_(/*5.2*/MainLogin(page, isLoggedIn, userInfo)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
   """),format.raw/*6.4*/("""<body>
<!-- <center>

<font color="red" size="10">AMP</font>
<br>
<br>
<div class="row">

<!-- column 1 -->



<div class="col-sm-6">
<!-- box 1 -->
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Introduction</h3>
</div>
<div class="panel-body">
<p>E-commerce has greatly evolved for forty years of existence and is still evolving continuously, as well as the software offered to support it. When searching for e-commerce solutions, almost all offered systems are focused on building web-shops, despite of the fact electronic commerce is not just about web shopping any longer.</p>
<p><a class="btn btn-default right" href="#" >Continue &raquo;</a></p>
</div>
</div>
<!-- box 2 -->
<div class="panel panel-primary">
<div class="panel-heading">
<h3 class="panel-title">Overview</h3>
</div>
<div class="panel-body">
<p> The main goal was creating an AMP with a set of tools to allow developers to easily access and process all e-commerce data from within any kind of services. On top of it, especially aimed for building e-commerce solution with ease using the Play with Akka web framework.</p>
<p><a class="btn btn-default right" href="#" >Continue &raquo;</a></p>
</div>
</div>
</div> <!-- /column 1 -->
<!-- column 2 -->
<div class="col-sm-6">
<!-- box 3 -->
<div class="panel panel-success">
<div class="panel-heading">
<h3 class="panel-title">Purpose </h3>
</div>
<div class="panel-body">
<p>The product has some main purposes that are strongly connected. One purpose is to analyse, design and develop the e-commerce solution using the Play with Akka platform. This implementation will provide an open source template, which then can be reused by developers to build their own e-commerce solution. The second purpose is to provide better capability and scalability of Play with Akka rather than current e-commerce solution. Hence this document brings out the high level architecture of E-Commerce solution which replaces current E-commerce product.</p>
<p><a class="btn btn-default right" href="#" >Continue &raquo;</a></p>
</div>
</div>
<!-- box 4 -->
<div class="panel panel-warning">
<div class="panel-heading">
<h3 class="panel-title">High Level Architecture </h3>
</div>
<div class="panel-body">
<p>This AMP will adopt the existing framework and architecture of the current e-commerce sites, however due to the difference in the platform where each application should be accessed and presented; there are additional technologies, which will provide access to the mobile operating system (Windows, Android, IOS, Mac, etc.) platform that plays a vital part in this product.</p>
<p><a class="btn btn-default right" href="#" >Continue &raquo;</a></p>
</div>
</div>
</div>
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:UserInfo): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)

  def f:((String,Boolean,UserInfo) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)

  def ref: this.type = this

}


}

/**/
object Profile extends Profile_Scope0.Profile
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 18:10:54 IST 2017
                  SOURCE: C:/Users/Nagarajan/Desktop/EXAMPLE PROJECTS/PLAY_AAMP/app/views/Profile.scala.html
                  HASH: 1a1ed81db91078968684f5e8020f06fbecc32dbe
                  MATRIX: 766->1|916->56|943->57|984->73|1029->110|1068->112|1098->116|3844->2832
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|37->6|94->63
                  -- GENERATED --
              */
          