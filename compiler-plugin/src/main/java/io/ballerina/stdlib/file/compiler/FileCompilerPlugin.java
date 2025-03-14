/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.file.compiler;

import io.ballerina.projects.plugins.CompilerPlugin;
import io.ballerina.projects.plugins.CompilerPluginContext;
//import io.ballerina.scan.ScannerContext;
//import io.ballerina.stdlib.file.compiler.staticcodeanalyzer.FileStaticCodeAnalyzer;
//
//import static io.ballerina.stdlib.file.compiler.Constants.SCANNER_CONTEXT;

/**
 * File compiler plugin.
 */
public class FileCompilerPlugin extends CompilerPlugin {

    @Override
    public void init(CompilerPluginContext context) {
        context.addCodeAnalyzer(new FileCodeAnalyzer());
        // Disabling the plugin for now
//        Object object = context.userData().get(SCANNER_CONTEXT);
//        if (object instanceof ScannerContext scannerContext) {
//            context.addCodeAnalyzer(new FileStaticCodeAnalyzer(scannerContext.getReporter()));
//        }
    }
}
