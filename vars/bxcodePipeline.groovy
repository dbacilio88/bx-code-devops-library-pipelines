import com.bxcode.pipeline.IConstants
import com.bxcode.pipeline.PipelineBuilder

def call(
        String version = IConstants.PipelineVersion.Version.value(),
        scriptInstance,
        boolean wout = false,
        boolean smc = false) {
    def builder = new PipelineBuilder(scriptInstance)

    echo "Current pipeline version: $version"
    echo "WOUT: $wout"

}