addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.12")

resolvers += Resolver.bintrayIvyRepo("kamon-io", "sbt-plugins")
addSbtPlugin("io.kamon" % "sbt-aspectj-play-runner" % "1.0.1")
