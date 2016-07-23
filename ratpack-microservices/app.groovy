@Grab('io.ratpack:ratpack-groovy:1.3.3')

import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json

ratpack {
  handlers {
    get {
      render(json([message: "Hello World!"]))
    }
  }
}
