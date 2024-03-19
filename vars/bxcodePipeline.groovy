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
        case IConstants.PipelineVersion.GitlabBased.value():
            echo "GitlabBased: $version"
            break;
        case IConstants.PipelineVersion.GitflowBased.value():
            echo "GitflowBased: $version"
            break;
        case IConstants.PipelineVersion.Backend.value():
            echo "Backend: $version"
            break;
        case IConstants.PipelineVersion.V4.value():
            echo "V4: $version"
            break;
        case IConstants.PipelineVersion.PROPERTY.value():
            echo "PROPERTY: $version"
            break;
        case IConstants.PipelineVersion.ApiProxyGitflow.value():
            echo "ApiProxyGitflow: $version"
            break;
        case IConstants.PipelineVersion.Deployment.value():
            echo "Deployment: $version"
            break;
        case IConstants.PipelineVersion.ContIntegration.value():
            echo "ContIntegration: $version"
            break;
        case IConstants.PipelineVersion.CIGraviton.value():
            echo "CIGraviton: $version"
            break;
        case IConstants.PipelineVersion.DeployWar.value():
            echo "DeployWar: $version"
            break;
        case IConstants.PipelineVersion.MobileAndroid.value():
            echo "MobileAndroid: $version"
            break;
        case IConstants.PipelineVersion.MobileLib.value():
            echo "MobileLib: $version"
            break;
        case IConstants.PipelineVersion.GravitonPipeline.value():
            echo "GravitonPipeline: $version"
            break;
        case IConstants.PipelineVersion.GravitonPipelineDeploy.value():
            echo "GravitonPipelineDeploy: $version"
            break;
        case IConstants.PipelineVersion.FrontEndReact.value():
            echo "FrontEndReact: $version"
            break;
        case IConstants.PipelineVersion.BackendGo.value():
            echo "BackendGo: $version"
            break;
    }

}