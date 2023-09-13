def call(Map config = [:]) {

        sh "echo TRIGGER ${config.isCronJob}"

        if (config.isCronJob) {
                sh "echo RUN-CRONJOB --- TIME ${config.timestampVersion}"
        } else {
                sh "echo RUN-MANUAL --- TIME ${config.timestampVersion}"
        }
}