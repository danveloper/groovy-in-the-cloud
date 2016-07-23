@Grab('com.aestasit.infrastructure.sshoogr:sshoogr:0.9.25')
import com.aestasit.infrastructure.ssh.dsl.*
import com.aestasit.infrastructure.ssh.*

def engine = new SshDslEngine(new SshOptions(defaultKeyFile: new File("/Users/danw/Downloads/uberconf.pem"), trustUnknownHosts: true))

engine.remoteSession('ubuntu@xxx:22') {
  exec 'rm -rf /tmp/key*'
  remoteFile('/tmp/key.foo').text = "mySecretKey=000000"
}
