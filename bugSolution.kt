```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    //Alternative solution using iterator
    val list2 = mutableListOf(1,2,3,4,5)
    val iterator = list2.iterator()
    while(iterator.hasNext()){
        val i = iterator.next()
        if(i%2==0){
            iterator.remove()
        }
    }
    println(list2) // Output: [1,3,5]

    //Alternative solution using a copy of the list 
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val listToRemove = mutableListOf<Int>()
    for(i in list3){
        if(i%2==0){
            listToRemove.add(i)
        }
    }
    list3.removeAll(listToRemove)
    println(list3) // Output: [1,3,5]
}
```