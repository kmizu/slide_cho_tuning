package slide

/**
 * Created by kota_mizushima on 2014/04/24.
 */
trait HashValue {
  def value(hash: String): Option[String] = hash match {
    case h if h.startsWith("#") => Some(h.substring(1))
    case _ => None
  }
}
