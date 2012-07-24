
package org.w3c.dom.events

import org.w3c.dom.*
import org.w3c.dom.views.*


//
// NOTE THIS FILE IS AUTO-GENERATED by the GeneratedJavaScriptStubs.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import js.noImpl

// Contains stub APIs for the W3C DOM API so we can delegate to the platform DOM instead


native public trait DocumentEvent {
    public fun createEvent(arg1: String?): Event = js.noImpl
}

native public trait Event {
    public val `type`: String
    public val bubbles: Boolean
    public val cancelable: Boolean
    public val currentTarget: EventTarget
    public val eventPhase: Short
    public val target: EventTarget
    public val timeStamp: Long
    public fun stopPropagation(): Unit = js.noImpl
    public fun preventDefault(): Unit = js.noImpl
    public fun initEvent(arg1: String?, arg2: Boolean, arg3: Boolean): Unit = js.noImpl

    public class object {
        public val CAPTURING_PHASE: Short = 1
        public val AT_TARGET: Short = 2
        public val BUBBLING_PHASE: Short = 3
    }
}

native public trait EventTarget {
    public fun dispatchEvent(arg1: Event?): Boolean = js.noImpl
    public fun addEventListener(arg1: String?, arg2: EventListener, arg3: Boolean): Unit = js.noImpl
    public fun removeEventListener(arg1: String?, arg2: EventListener, arg3: Boolean): Unit = js.noImpl
}

native public trait MouseEvent: UIEvent {
    public val altKey: Boolean
    public val button: Short
    public val clientX: Int
    public val clientY: Int
    public val ctrlKey: Boolean
    public val metaKey: Boolean
    public val relatedTarget: EventTarget
    public val screenX: Int
    public val screenY: Int
    public val shiftKey: Boolean
    public fun initMouseEvent(arg1: String?, arg2: Boolean, arg3: Boolean, arg4: AbstractView, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Int, arg10: Boolean, arg11: Boolean, arg12: Boolean, arg13: Boolean, arg14: Short, arg15: EventTarget): Unit = js.noImpl
}

native public trait MutationEvent: Event {
    public val attrChange: Short
    public val attrName: String
    public val newValue: String
    public val prevValue: String
    public val relatedNode: Node
    public fun initMutationEvent(arg1: String?, arg2: Boolean, arg3: Boolean, arg4: Node, arg5: String?, arg6: String?, arg7: String?, arg8: Short): Unit = js.noImpl

    public class object {
        public val MODIFICATION: Short = 1
        public val ADDITION: Short = 2
        public val REMOVAL: Short = 3
    }
}

native public trait UIEvent: Event {
    public val detail: Int
    public val view: AbstractView
    public fun initUIEvent(arg1: String?, arg2: Boolean, arg3: Boolean, arg4: AbstractView, arg5: Int): Unit = js.noImpl
}

