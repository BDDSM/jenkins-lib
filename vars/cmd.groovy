import ru.pulsar.jenkins.library.steps.Cmd
import ru.pulsar.jenkins.library.ioc.ContextRegistry

int call(String script, boolean returnStatus = false) {
    ContextRegistry.registerDefaultContext(this)

    def cmd = new Cmd(script, returnStatus)
    cmd.run()
}
