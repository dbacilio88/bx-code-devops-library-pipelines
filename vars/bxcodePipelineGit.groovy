import com.bxcode.pipeline.PipelineBuilder


def call(PipelineBuilder builder, boolean wout, boolean smc, String version) {

    def agentLabel = "slave-beta"
    def solutionProject = ""

    pipeline {
        agent none
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
                echo "Setting Up & Initialising Env $version"
            }
            stage("Unit Test") {
                echo "Unit Test $version"
            }
            stage("Dependencies, Code Scan & Bugs") {
                echo "Dependencies, Code Scan & Bugs $version"
            }
            stage('SonarQube Quality Gate') {
                echo "SonarQube Quality Gate $version"
            }
            stage("Build Image") {
                echo "Build Image $version"
            }
            stage('Deploy to Dev') {
                echo "Deploy to Dev $version"
            }
            stage('Deploy to Test') {
                echo "Deploy to Test $version"
            }
            stage('Deploy to UAT') {
                echo "Deploy to UAT $version"
            }
            stage('Deploy to Prod') {
                echo "Deploy to Prod $version"
            }
            stage('Release') {
                echo "Release $version"
            }
            stage('Archive Build') {
                echo "Archive Build $version"
            }
        }
    }

}