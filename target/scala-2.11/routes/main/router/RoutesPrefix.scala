
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nagarajan/Desktop/EXAMPLE PROJECTS/PLAY_AAMP/conf/routes
// @DATE:Tue Feb 28 18:12:15 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
