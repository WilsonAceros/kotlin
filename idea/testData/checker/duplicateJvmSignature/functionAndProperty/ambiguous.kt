// FIR_COMPARISON

package a.b

class String

interface I {
    <error descr="[CONFLICTING_JVM_DECLARATIONS] Platform declaration clash: The following declarations have the same JVM signature (foo(Ljava/util/List;)V):
    fun foo(l: List<a.b.String>): Unit defined in a.b.I
    fun foo(l: List<kotlin.String>): Unit defined in a.b.I">fun foo(l: List<String>)</error>
    <error descr="[CONFLICTING_JVM_DECLARATIONS] Platform declaration clash: The following declarations have the same JVM signature (foo(Ljava/util/List;)V):
    fun foo(l: List<a.b.String>): Unit defined in a.b.I
    fun foo(l: List<kotlin.String>): Unit defined in a.b.I">fun foo(l: List<kotlin.String>)</error>
}