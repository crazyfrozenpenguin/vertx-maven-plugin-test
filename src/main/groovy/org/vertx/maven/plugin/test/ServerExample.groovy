package http

vertx.createHttpServer().requestHandler { req ->
  req.response.end "<html><body><h1>Hello from vert.x: Groovy!</h1></body></html>"
}.listen(8080, "localhost")