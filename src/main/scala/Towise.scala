package towise

import com.fasterxml.jackson.databind.util.JSONPObject
import scalaj.http.{Http, HttpRequest, HttpResponse}
import play.api.libs.json.{JsValue, Json}
import config.Config

import scala.util.matching.Regex

class Towise(private var config: Map[String,String]) {


  def createRequest(endpoint: String,data: Map[String,String],method:String): JsValue = {
    var request:HttpRequest = Http(Config.baseUrl + endpoint)

    if(method.toUpperCase == "GET"){

      val res = request.headers(config).asString
      return Json.parse(res.body)
    }
    val res = request.headers(config).postForm.params(data).method(method.toUpperCase).asString

    return Json.parse(res.body)
  }

  def checkImage(image:String): Map[String,String] = {

      if(image.matches("(data:image).*")){
        return Map("image_base64" -> image)
      }
    return  Map("image_url"->image)
  }

  def faceDetect(image:String): JsValue = {

    val data = createRequest(Config.faceDetect,checkImage(image),"POST")
    return data
  }

  def bodyDetect(image:String): JsValue = {

    val data = createRequest(Config.bodyDetect,checkImage(image),"POST")
    return data
  }

  def emotionDetect(image:String): JsValue = {

    val data = createRequest(Config.emotionDetect,checkImage(image),"POST")
    return data
  }

  def faceComparing(image:String): JsValue = {

    val data = createRequest(Config.faceCompare,checkImage(image),"POST")
    return data
  }

  def getAllPerson(): JsValue = {

    val persons = createRequest(Config.persons,null,"GET")
    return persons
  }

  def getPerson(personId:String): JsValue = {

    val data = createRequest(Config.persons.concat("?person_id="+personId),null,"GET")
    return data
  }

  def addPerson(name: String): JsValue = {
    var person = Map("name" -> name)
    val data = createRequest(Config.persons,person,"POST")
    return data
  }

  def removePerson(personId: String): JsValue = {
    var person = Map("person_id" -> personId)
    val data = createRequest(Config.persons,person,"DELETE")
    return data
  }

  def getAllFace(personId:String): JsValue = {

    val data = createRequest(Config.faces.concat("?person_id="+personId),null,"GET")
    return data
  }

  def getFace(faceId:String): JsValue = {

    val data = createRequest(Config.faces.concat("?face_id="+faceId),null,"GET")
    return  data
  }

  def addFace(image:String,personId:String,save:String): JsValue = {
    var face = checkImage(image)
        face += ("person_id"->personId,"save_image"->save)
    val data = createRequest(Config.faces,face,"POST")
    return  data
  }

  def removeFace(faceId:String): JsValue ={
    var face = Map("face_id"-> faceId)
    val data = createRequest(Config.faces,face,"DELETE")
    return data
  }
}



