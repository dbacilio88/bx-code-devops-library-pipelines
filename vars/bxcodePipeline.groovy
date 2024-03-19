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


    switch (version) {
        case IConstants.PipelineVersion.GitlabBased:
            echo "GitlabBased: $version"
            break;
        case IConstants.PipelineVersion.GitflowBased:
            echo "GitflowBased: $version"
            break;
        case IConstants.PipelineVersion.Backend:
            echo "Backend: $version"
            break;
        case IConstants.PipelineVersion.V4:
            echo "V4: $version"
            break;
        case IConstants.PipelineVersion.PROPERTY:
            echo "PROPERTY: $version"
            break;
        case IConstants.PipelineVersion.ApiProxyGitflow:
            echo "ApiProxyGitflow: $version"
            break;
        case IConstants.PipelineVersion.Deployment:
            echo "Deployment: $version"
            break;
        case IConstants.PipelineVersion.ContIntegration:
            echo "ContIntegration: $version"
            break;
        case IConstants.PipelineVersion.CIGraviton:
            echo "CIGraviton: $version"
            break;
        case IConstants.PipelineVersion.DeployWar:
            echo "DeployWar: $version"
            break;
        case IConstants.PipelineVersion.MobileAndroid:
            echo "MobileAndroid: $version"
            break;
        case IConstants.PipelineVersion.MobileLib:
            echo "MobileLib: $version"
            break;
        case IConstants.PipelineVersion.GravitonPipeline:
            echo "GravitonPipeline: $version"
            break;
        case IConstants.PipelineVersion.GravitonPipelineDeploy:
            echo "GravitonPipelineDeploy: $version"
            break;
        case IConstants.PipelineVersion.FrontEndReact:
            echo "FrontEndReact: $version"
            break;
        case IConstants.PipelineVersion.BackendGo:
            echo "BackendGo: $version"
            break;
    }

}