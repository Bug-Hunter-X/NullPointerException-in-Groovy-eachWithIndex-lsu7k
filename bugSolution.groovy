```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.eachWithIndex { String item, int index ->
      println "Item at index $index: $item"
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
```