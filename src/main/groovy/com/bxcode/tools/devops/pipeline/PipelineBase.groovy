package com.bxcode.tools.devops.pipeline

import com.bxcode.tools.devops.constants.IConstants

class PipelineBase implements Serializable, IConstants {
    def scriptInstance

    PipelineBase(def scriptInstance) {
        this.scriptInstance = scriptInstance
    }

    def instance() {
        return scriptInstance
    }
}
