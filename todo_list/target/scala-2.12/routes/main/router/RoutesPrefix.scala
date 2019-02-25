// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jamesdewinton/Projects/java/todo_list/conf/routes
// @DATE:Mon Feb 25 12:28:20 GMT 2019


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
