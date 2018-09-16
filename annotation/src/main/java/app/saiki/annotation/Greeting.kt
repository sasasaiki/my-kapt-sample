package app.saiki.annotation

@Target(AnnotationTarget.CLASS)
annotation class Greeting

@Target(AnnotationTarget.FUNCTION)
annotation class GreetingForFunc
