```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    // ConcurrentModificationException
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    for (i in list2) {
        if (i % 2 == 0) {
            list2.remove(i) 
        }
    }
    println(list2) //Throws ConcurrentModificationException
}
```