
# TOWISE SCALA API
Towise assists you to detect human faces and bodies with using the latest and reliable technology.

## Getting Started
### Prerequisites
```
 Scala "2.12.8"

```
### Installing
To add dependecy

```sh

```
To import your project
```scala

```
### Using Towise
You must enter appKey and appId

For Example:
```scala

object Main{
  def main(args: Array[String]): Unit = {
    var config = Map("appId"->"type your appId","appKey"->"type your appKey");
    val t = new Towise(config)
    var image = "https://s.abcnews.com/images/Nightline/181010_ntl_dua_lipa_1257_hpMain_16x9_992.jpg"
    var personId = "03a42fa2e1d1407b9388385efc01f083"
    println(t.faceDetect(image))
    println(t.bodyDetect(image))
    println(t.emotionDetect(image))
    println(t.faceComparing(image))
    println(t.getAllPerson())
    println(t.getPerson(personId2))
    println(t.addPerson("Keles0glu"))
    println(t.removePerson(personId))
    println(t.addFace("https://ichef.bbci.co.uk/news/660/cpsprodpb/BFB3/production/_102457094_pa-clooney.jpg",personId2,"yes"))
    println(t.getAllFace(personId2))
    println(t.getFace("33a7c1988e5f43799aadb35652fb2af5"))
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

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

