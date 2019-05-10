
# TOWISE SCALA API
Towise assists you to detect human faces and bodies with using the latest and reliable technology.

## Getting Started
### Prerequisites
```
 Scala "2.12.8"

```
### Installing
To add dependecy to build.sbt

```sh
libraryDependencies += "com.argedor" %% "towise" % "0.2"
```
To import your project
```scala
import towise.Towise
```
### Using Towise
You must enter appKey and appId

For Example:
```scala
import towise.Towise

object Main{
  def main(args: Array[String]): Unit = {
    var config = Map("appId"->"type your appId","appKey"->"type your appKey");
    val t = new Towise(config)
    var image = "https://s.abcnews.com/images/Nightline/181010_ntl_dua_lipa_1257_hpMain_16x9_992.jpg"

    //for detection the faces on given image
    println(t.faceDetect(image))

    //for detection the bodies on given image
    println(t.bodyDetect(image))

    //for detection the emotion on given image
    println(t.emotionDetect(image))

    //for recognize face on given image
    println(t.faceComparing(image))

    //for get all person on system
    println(t.getAllPerson())

    //for get person by given person id
    println(t.getPerson(personId2))

    //for add new person to the system with given name
    println(t.addPerson("Keles0glu"))

    //for remove person from system that given person id
    println(t.removePerson(personId))

    //for add new image to person that given person id and save image to db
    println(t.addFace("https://ichef.bbci.co.uk/news/660/cpsprodpb/BFB3/production/_102457094_pa-clooney.jpg",personId2,"yes"))

    //get all faces of person
    println(t.getAllFace(personId2))

    //get image by given face id
    println(t.getFace("33a7c1988e5f43799aadb35652fb2af5"))

    //remove image of person
    println(t.removeFace("33a7c1988e5f43799aadb35652fb2af5"))

  }
}
```

## Versioning
For the versions available, see the https://github.com/argedor/TowiseScalaAPI/tags

## Authors
* **Harun Keleşoğlu** - *Developer* - [Github](https://github.com/harunkelesoglu)
See also the list of [contributers](https://github.com/argedor/TowiseScalaAPI/graphs/contributors)

## License

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details

