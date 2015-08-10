package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.platform.*
import java.util.*

import java.util.Collections // TODO: it's temporary while we have java.util.Collections in js

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun <T> Array<out T>.reverse(): List<T> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun BooleanArray.reverse(): List<Boolean> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun ByteArray.reverse(): List<Byte> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun CharArray.reverse(): List<Char> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun DoubleArray.reverse(): List<Double> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun FloatArray.reverse(): List<Float> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun IntArray.reverse(): List<Int> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun LongArray.reverse(): List<Long> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun ShortArray.reverse(): List<Short> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun <T> Iterable<T>.reverse(): List<T> {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
deprecated("reverse will change its behavior soon. Use reversed() instead.", ReplaceWith("reversed()"))
public fun String.reverse(): String {
    return reversed()
}

/**
 * Returns a list with elements in reversed order.
 */
public fun <T> Array<out T>.reversed(): List<T> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun BooleanArray.reversed(): List<Boolean> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun ByteArray.reversed(): List<Byte> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun CharArray.reversed(): List<Char> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun DoubleArray.reversed(): List<Double> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun FloatArray.reversed(): List<Float> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun IntArray.reversed(): List<Int> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun LongArray.reversed(): List<Long> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun ShortArray.reversed(): List<Short> {
    if (isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a list with elements in reversed order.
 */
public fun <T> Iterable<T>.reversed(): List<T> {
    if (this is Collection && isEmpty()) return emptyList()
    val list = toArrayList()
    Collections.reverse(list)
    return list
}

/**
 * Returns a string with characters in reversed order.
 */
public fun String.reversed(): String {
    return StringBuilder().append(this).reverse().toString()
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("This method may change its behavior soon. Use sorted() instead.", ReplaceWith("sorted()"))
public fun <T : Comparable<T>> Iterable<T>.sort(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements, sorted by the specified [comparator].
 */
deprecated("This method may change its behavior soon. Use sortedWith() instead.", ReplaceWith("sortedWith(comparator)"))
public fun <T> Array<out T>.sortBy(comparator: Comparator<in T>): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements, sorted by the specified [comparator].
 */
deprecated("This method may change its behavior soon. Use sortedWith() instead.", ReplaceWith("sortedWith(comparator)"))
public fun <T> Iterable<T>.sortBy(comparator: Comparator<in T>): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("This method may change its behavior soon. Use sortedBy() instead.", ReplaceWith("sortedBy(order)"))
public inline fun <T, R : Comparable<R>> Array<out T>.sortBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) order: (T) -> R): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("This method may change its behavior soon. Use sortedBy() instead.", ReplaceWith("sortedBy(order)"))
public inline fun <T, R : Comparable<R>> Iterable<T>.sortBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) order: (T) -> R): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, in descending order.
 */
deprecated("This method may change its behavior soon. Use sortedDescending() instead.", ReplaceWith("sortedDescending()"))
public fun <T : Comparable<T>> Iterable<T>.sortDescending(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator { x, y -> y.compareTo(x) })
    return sortedList
}

/**
 * Returns a sorted list of all elements, in descending order by results of specified [order] function.
 */
deprecated("This method may change its behavior soon. Use sortedByDescending() instead.", ReplaceWith("sortedByDescending(order)"))
public inline fun <T, R : Comparable<R>> Array<out T>.sortDescendingBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) order: (T) -> R): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareByDescending(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, in descending order by results of specified [order] function.
 */
deprecated("This method may change its behavior soon. Use sortedByDescending() instead.", ReplaceWith("sortedByDescending(order)"))
public inline fun <T, R : Comparable<R>> Iterable<T>.sortDescendingBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) order: (T) -> R): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareByDescending(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun <T : Comparable<T>> Array<out T>.sorted(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun ByteArray.sorted(): List<Byte> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun CharArray.sorted(): List<Char> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun DoubleArray.sorted(): List<Double> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun FloatArray.sorted(): List<Float> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun IntArray.sorted(): List<Int> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun LongArray.sorted(): List<Long> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun ShortArray.sorted(): List<Short> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to their natural sort order.
 */
public fun <T : Comparable<T>> Iterable<T>.sorted(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sequence that yields elements of this sequence sorted according to their natural sort order.
 */
public fun <T : Comparable<T>> Sequence<T>.sorted(): Sequence<T> {
    return object : Sequence<T> {
        override fun iterator(): Iterator<T> {
            val sortedList = this@sorted.toArrayList()
            java.util.Collections.sort(sortedList)
            return sortedList.iterator()
        }
    }
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Array<out T>.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): List<T> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> BooleanArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Boolean) -> R?): List<Boolean> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> ByteArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Byte) -> R?): List<Byte> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> CharArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Char) -> R?): List<Char> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> DoubleArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Double) -> R?): List<Double> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> FloatArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Float) -> R?): List<Float> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> IntArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Int) -> R?): List<Int> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> LongArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Long) -> R?): List<Long> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> ShortArray.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Short) -> R?): List<Short> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Iterable<T>.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): List<T> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a sequence that yields elements of this sequence sorted according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Sequence<T>.sortedBy(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): Sequence<T> {
    return sortedWith(compareBy(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Array<out T>.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): List<T> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> BooleanArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Boolean) -> R?): List<Boolean> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> ByteArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Byte) -> R?): List<Byte> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> CharArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Char) -> R?): List<Char> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> DoubleArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Double) -> R?): List<Double> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> FloatArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Float) -> R?): List<Float> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> IntArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Int) -> R?): List<Int> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> LongArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Long) -> R?): List<Long> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <R : Comparable<R>> ShortArray.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (Short) -> R?): List<Short> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Iterable<T>.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): List<T> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a sequence that yields elements of this sequence sorted descending according to natural sort order of the value returned by specified [selector] function.
 */
public inline fun <T, R : Comparable<R>> Sequence<T>.sortedByDescending(inlineOptions(InlineOption.ONLY_LOCAL_RETURN) selector: (T) -> R?): Sequence<T> {
    return sortedWith(compareByDescending(selector))
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun <T : Comparable<T>> Array<out T>.sortedDescending(): List<T> {
    return sortedWith(comparator { x, y -> y.compareTo(x) })
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun ByteArray.sortedDescending(): List<Byte> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun CharArray.sortedDescending(): List<Char> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun DoubleArray.sortedDescending(): List<Double> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun FloatArray.sortedDescending(): List<Float> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun IntArray.sortedDescending(): List<Int> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun LongArray.sortedDescending(): List<Long> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun ShortArray.sortedDescending(): List<Short> {
    return copyOf().apply { sort() }.reverse()
}

/**
 * Returns a list of all elements sorted descending according to their natural sort order.
 */
public fun <T : Comparable<T>> Iterable<T>.sortedDescending(): List<T> {
    return sortedWith(comparator { x, y -> y.compareTo(x) })
}

/**
 * Returns a sequence that yields elements of this sequence sorted descending according to their natural sort order.
 */
public fun <T : Comparable<T>> Sequence<T>.sortedDescending(): Sequence<T> {
    return sortedWith(comparator { x, y -> y.compareTo(x) })
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun <T> Array<out T>.sortedWith(comparator: Comparator<in T>): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun BooleanArray.sortedWith(comparator: Comparator<in Boolean>): List<Boolean> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun ByteArray.sortedWith(comparator: Comparator<in Byte>): List<Byte> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun CharArray.sortedWith(comparator: Comparator<in Char>): List<Char> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun DoubleArray.sortedWith(comparator: Comparator<in Double>): List<Double> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun FloatArray.sortedWith(comparator: Comparator<in Float>): List<Float> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun IntArray.sortedWith(comparator: Comparator<in Int>): List<Int> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun LongArray.sortedWith(comparator: Comparator<in Long>): List<Long> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun ShortArray.sortedWith(comparator: Comparator<in Short>): List<Short> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a list of all elements sorted according to the specified [comparator].
 */
public fun <T> Iterable<T>.sortedWith(comparator: Comparator<in T>): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList, comparator)
    return sortedList
}

/**
 * Returns a sequence that yields elements of this sequence sorted according to the specified [comparator].
 */
public fun <T> Sequence<T>.sortedWith(comparator: Comparator<in T>): Sequence<T> {
    return object : Sequence<T> {
        override fun iterator(): Iterator<T> {
            val sortedList = this@sortedWith.toArrayList()
            java.util.Collections.sort(sortedList, comparator)
            return sortedList.iterator()
        }
    }
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun <T : Comparable<T>> Array<out T>.toSortedList(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun BooleanArray.toSortedList(): List<Boolean> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun ByteArray.toSortedList(): List<Byte> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun CharArray.toSortedList(): List<Char> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun DoubleArray.toSortedList(): List<Double> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun FloatArray.toSortedList(): List<Float> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun IntArray.toSortedList(): List<Int> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun LongArray.toSortedList(): List<Long> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun ShortArray.toSortedList(): List<Short> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use sorted() instead.", ReplaceWith("sorted()"))
public fun <T : Comparable<T>> Iterable<T>.toSortedList(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements.
 */
deprecated("Use asIterable().sorted() instead.", ReplaceWith("asIterable().sorted()"))
public fun <T : Comparable<T>> Sequence<T>.toSortedList(): List<T> {
    val sortedList = toArrayList()
    java.util.Collections.sort(sortedList)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <T, V : Comparable<V>> Array<out T>.toSortedListBy(order: (T) -> V): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> BooleanArray.toSortedListBy(order: (Boolean) -> V): List<Boolean> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Boolean> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> ByteArray.toSortedListBy(order: (Byte) -> V): List<Byte> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Byte> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> CharArray.toSortedListBy(order: (Char) -> V): List<Char> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Char> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> DoubleArray.toSortedListBy(order: (Double) -> V): List<Double> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Double> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> FloatArray.toSortedListBy(order: (Float) -> V): List<Float> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Float> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> IntArray.toSortedListBy(order: (Int) -> V): List<Int> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Int> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> LongArray.toSortedListBy(order: (Long) -> V): List<Long> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Long> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <V : Comparable<V>> ShortArray.toSortedListBy(order: (Short) -> V): List<Short> {
    val sortedList = toArrayList()
    val sortBy: Comparator<Short> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use sortedBy(order) instead.", ReplaceWith("sortedBy(order)"))
public fun <T, V : Comparable<V>> Iterable<T>.toSortedListBy(order: (T) -> V): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

/**
 * Returns a sorted list of all elements, ordered by results of specified [order] function.
 */
deprecated("Use asIterable().sortedBy(order) instead.", ReplaceWith("asIterable().sortedBy(order)"))
public fun <T, V : Comparable<V>> Sequence<T>.toSortedListBy(order: (T) -> V): List<T> {
    val sortedList = toArrayList()
    val sortBy: Comparator<T> = compareBy(order)
    java.util.Collections.sort(sortedList, sortBy)
    return sortedList
}

