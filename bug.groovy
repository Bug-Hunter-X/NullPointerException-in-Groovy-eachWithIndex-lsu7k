```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item at index $index: $item"
  }
}

myMethod(null)
```