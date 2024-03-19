package com.bxcode.pipeline

class PipelineBase implements Serializable, IConstants {

    def scriptInstance

    PipelineBase(def scriptInstance) {
        this.scriptInstance = scriptInstance
    }

    def instance() {
        return scriptInstance
    }
}
