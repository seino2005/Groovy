def env = System.getenv()
def envList = env.collect { "$it.key=$it.value" }
println "cmd /c set".execute(envList, new File(".")).text

println "user.dir:" + System.getProperty("user.dir")
println "getAbsoluteFile:" + new File(".").getAbsoluteFile()
println "getParent:" + new File(".").getAbsoluteFile().getParent()

/*
user.dir:C:\Data\work\groovy\sample
getAbsoluteFile:C:\Data\work\groovy\sample\.
getParent:C:\Data\work\groovy\sample
 */

