JVM_OPTIONS="-J-javaagent:target/universal/stage/lib/org.aspectj.aspectjweaver-1.8.10.jar"
JVM_OPTIONS="$JVM_OPTIONS -Dhttp.port=9000"
JVM_OPTIONS="$JVM_OPTIONS -Dorg.aspectj.tracing.factory=default"

target/universal/stage/bin/play2-5-kamon $JVM_OPTIONS
