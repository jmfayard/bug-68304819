package jmfayard.nulls

/**
 * Extending a Java Class with nullability annotations from Kotlin
 *
 * Steps: delete the "greeting" and "nullable" methods below
 * and let Ctrl-O - Override methods recreate them
 */

/** Actual result with Android Studio 3.1 canary **/
/** This is correct!!! **/

class KotlinClass : JavaClass() {

    override fun greeting(name: String): String {
        return super.greeting(name)
    }

    override fun nullableSearch(param1: String?, param2: String): String? {
        return super.nullableSearch(param1, param2)
    }
}


/*** Actual result with Android Studio 3.0.0 stable **/
/** This is wrong! **/
/*
class KotlinClass : JavaClass() {

    // name should not be String?
    override fun greeting(name: String?): String {
        return super.greeting(name)
    }

    // param2 should not be String?
    override fun nullableSearch(param1: String?, param2: String?): String? {
        return super.nullableSearch(param1, param2)
    }
}
*/


/** Expected and result from Intellij 2017.5.2
class KotlinClass : JavaClass() {


    override fun greeting(name: String): String {
        return super.greeting(name)
    }

    override fun nullableSearch(param1: String?, param2: String): String? {
        return super.nullableSearch(param1, param2)
    }
}
***/

