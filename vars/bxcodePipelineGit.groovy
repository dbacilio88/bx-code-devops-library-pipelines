import com.bxcode.pipeline.PipelineBuilder


def call(PipelineBuilder builder, boolean wout, boolean smc, String version) {

    def agentLabel = "slave-beta"
    def solutionProject = ""

    pipeline {
        agent any
        tools {
            maven: 'maven'
            gradle: 'gradle'
        }
        environment {
            DEPLOYMENT_VERSION = "v1"
        }
        options {
            disableConcurrentBuilds()
        }
        stages {
            stage("Setting Up & Initialising Env") {
                agent {
                    label agentLabel

                }
                steps {
                    script {
                        echo "Setting Up & Initialising Env $version"
                    }
                }
            }
            stage("Unit Test") {
                agent {
                    label agentLabel

                }
                steps {
                    script {
                        echo "Unit Test $version"
                    }
                }
            }
            stage("Dependencies, Code Scan & Bugs") {
                agent none
                steps {
                    script {
                        echo "Dependencies, Code Scan & Bugs $version"
                    }
                }

            }
            stage('SonarQube Quality Gate') {
                agent {
                    label agentLabel

                }
                steps {
                    script {
                        echo "SonarQube Quality Gate $version"
                    }
                }
            }
            stage("Build Image") {
                agent {
                    label agentLabel

                }
                steps {
                    script {
                        echo "Build Image $version"
                    }
                }
            }
            stage('Deploy to Dev') {
                agent none
                steps {
                    script {
                        echo "Deploy to Dev $version"
                    }
                }
            }
            stage('Deploy to Test') {
                agent none
                steps {
                    script {
                        echo "Deploy to Test $version"
                    }
                }
            }
            stage('Deploy to UAT') {
                agent none
                steps {
                    script {
                        echo "Deploy to UAT $version"
                    }
                }
            }
            stage('Deploy to Prod') {
                agent none
                steps {
                    script {
                        echo "Deploy to Prod $version"
                    }
                }
            }
            stage('Release') {
                agent {
                    label agentLabel
                }
                steps {
                    script {
                        echo "Release $version"
                    }
                }
            }
            stage('Archive Build') {
                agent {
                    label agentLabel
                }
                steps {
                    script {
                        echo "Archive Build $version"
                    }
                }
            }
        }
    }
}