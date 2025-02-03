# ConcurrentModificationException in Kotlin Collection Iteration
This repository demonstrates a common error in Kotlin when modifying a collection (List, Map, Set) while iterating over it using a `for` loop.  Attempting to remove elements directly within the loop throws a `ConcurrentModificationException`.

The `bug.kt` file showcases the problem. The `bugSolution.kt` file provides a corrected approach using `removeIf` or iterating over a copy of the collection.  Using `removeIf` is generally preferred for its efficiency and readability.

This example highlights the importance of understanding how collection modification affects iteration in Kotlin.