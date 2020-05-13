// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u until 11u
    for (i in (uintProgression.reversed() step 2).reversed() step 3) {
        uintList += i
    }
    assertEquals(listOf(2u, 5u, 8u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL until 11uL
    for (i in (ulongProgression.reversed() step 2L).reversed() step 3L) {
        ulongList += i
    }
    assertEquals(listOf(2uL, 5uL, 8uL), ulongList)

    return "OK"
}