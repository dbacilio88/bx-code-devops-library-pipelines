def deployConfiguration() {
    dir('deployConfig') {
        checkout([
                $class           : 'GitSCM',
                branches         : [[name: "master"]],
                userRemoteConfigs: [[
                                            credentialsId: 'jenkins-credentials',
                                            url          : 'git@github.com:dbacilio88/bx-code-devops-library-pipelines.git'
                                    ]]
        ])
    }
}