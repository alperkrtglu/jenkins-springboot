def call(Map config = [:]) {

        if (config.IS_CRON_JOB == 'TRUE') {
                sh "echo RUN-CRONJOB --- TIME ${config.timestampVersion}"
        } else {
                sh "echo RUN-MANUAL --- TIME ${config.timestampVersion}"
        }
}