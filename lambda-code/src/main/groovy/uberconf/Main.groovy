package uberconf

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import groovy.transform.CompileStatic

@CompileStatic
class Main implements RequestHandler<ReqRes, ReqRes> {

  ReqRes handleRequest(ReqRes req, Context ctx) {
    new ReqRes(message: "I got your message! ${req.message}")
  }

  static class ReqRes {
    String message
  }
}
