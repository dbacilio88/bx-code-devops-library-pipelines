package com.bxcode.tools.devops.constants

interface IConstants extends Serializable {
    String BRANCHING_VERSION_GITFLOW = "GitflowBased"
    String BRANCHING_GRAVITON = "GravitonPipeline"

    enum PullRequestStatus {

        PENDING('pending'),
        IN_PROGRESS('in_progress'),
        SUCCESS('success'),
        FAILURE('failure'),
        ERROR('error');

        private String value;

        PullRequestStatus(String value) {
            this.value = value
        }

        String value() {
            return this.value
        }
    }

    enum PipelineVersion {
        Version('Version'),
        GravitonPipeline('GravitonPipeline')

        private String value

        PipelineVersion(String value) {
            this.value = value
        }

        String value() {
            return this.value
        }
    }
}
