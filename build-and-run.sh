mvn -q clean package
cd target
unzip -qq *.zip
vertx runmod org.vertx.maven.plugin.vertx-maven-plugin-test-v0.0.1-SNAPSHOT
