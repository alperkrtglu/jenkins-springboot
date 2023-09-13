def call(Map config = [:]) {

        sh "echo TRIGGER ${config.IS_CRON_JOB}"

        if (!config.IS_CRON_JOB) {
                sh "echo RUN-CRONJOB --- TIME ${config.timestampVersion}"
        } else {
                sh "echo RUN-MANUAL --- TIME ${config.timestampVersion}"
        }
}