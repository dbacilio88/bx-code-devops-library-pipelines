package com.bxcode.tools.devops.constants

import com.bxcode.tools.devops.pipeline.PipelineBuilder

def call(
        String version = IConstants.PipelineVersion.Version.value(),
        scriptInstance,
        boolean wout = false,
        boolean smc = false) {
    def builder = new PipelineBuilder(scriptInstance)

}